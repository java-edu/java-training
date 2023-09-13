package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.Actor;
import util.JDBCConnection;

public class ActorJDBCDao implements Dao<Actor> {

	private Connection connection = JDBCConnection.getConnection();

	@Override
	public Optional<Actor> get(int id) {
		try {
			Statement s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor where id=" + id + ";");
			while (rs.next()) {
				Actor actor = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("last_update"));
				return Optional.of(actor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	@Override
	public List<Actor> get() {
		List<Actor> actors = new ArrayList<>();
		try {
			Statement s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor;");
			while (rs.next()) {
				Actor actor = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("last_update"));
				actors.add(actor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actors;
	}

	public Actor getLastInserted() {
		try {
			Statement s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor order by actor_id desc limit 1");
			while (rs.next()) {
				Actor actor = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("last_update"));
				return actor;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void add(Actor actor) {
		try {
			Statement s = connection.createStatement();
			s.executeUpdate("insert into actor (first_name, last_name) values ('" + actor.getFirstName() + "', '"
					+ actor.getLastName() + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Actor actor, int id) {
		try {
			Statement s = connection.createStatement();
			s.executeUpdate("update actor set first_name='" + actor.getFirstName() + "' , last_name='"
					+ actor.getLastName() + "' where actor_id=" + id + ";");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try {
			Statement s = connection.createStatement();
			s.executeUpdate("delete from actor where actor_id=" + id + ";");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
