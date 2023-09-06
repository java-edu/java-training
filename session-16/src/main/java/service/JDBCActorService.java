package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import domain.Actor;
import util.JDBCConnection;

public class JDBCActorService {

	private Connection connection = JDBCConnection.getConnection();

	public List<Actor> getAll() {
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

	public Actor get(int id) {
		try {
			Statement s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor where id=" + id + ";");
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

	public List<Actor> get(String firstName, String lastName) {
		List<Actor> actors = new ArrayList<>();
		try {
			Statement s = connection.createStatement();
			ResultSet rs = s.executeQuery(
					"select * from actor where first_name='" + firstName + "' and last_name='" + lastName + "';");
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

	public void add(Actor actor) {
		try {
			Statement s = connection.createStatement();
			s.executeUpdate("insert into actor (first_name, last_name) values ('" + actor.getFirstName() + "', '"
					+ actor.getLastName() + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(Actor actor, int id) {
		try {
			Statement s = connection.createStatement();
			s.executeUpdate("update actor set first_name='" + actor.getFirstName() + "' , last_name='"
					+ actor.getLastName() + "' where actor_id=" + id + ";");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		try {
			Statement s = connection.createStatement();
			s.executeUpdate("delete from actor where actor_id=" + id + ";");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
