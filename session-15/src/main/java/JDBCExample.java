

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	// CRUD application - create, read, update, delete

	public static void main(String[] args) {

		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "root");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Statement s;
		// 1.query to actor table to get all records
		try {
			s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor;");
			while (rs.next()) {
				Actor actor = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("last_update"));
				System.out.println(actor.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 2. create
		try {
			s = connection.createStatement();
			s.executeUpdate("insert into actor (first_name, last_name) values ('Sai', 'Redy')");
			System.out.println("added a new record to actor table");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3. read
		try {
			s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor where first_name='Sai' and last_name='Redy';");
			while (rs.next()) {
				Actor actor = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("last_update"));
				System.out.println(actor.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 4. update
		try {
			s = connection.createStatement();
			s.executeUpdate("update actor set last_name='Reddy' where first_name='Sai' and last_name='Redy';");
			System.out.println("updated a record to actor table");

			s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor;");
			while (rs.next()) {
				Actor actor = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("last_update"));
				System.out.println(actor.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 5. delete
		try {
			s = connection.createStatement();
			s.executeUpdate("delete from actor where first_name='Sai' and last_name='Reddy';");
			System.out.println("deleted a record from actor table");

			s = connection.createStatement();
			ResultSet rs = s.executeQuery("select * from actor;");
			while (rs.next()) {
				Actor actor = new Actor(rs.getInt("actor_id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("last_update"));
				System.out.println(actor.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class Actor {

	private int actorId;
	private String firstName;
	private String lastName;
	private String lastUpdate;

	public Actor() {
	}

	public Actor(int actorId, String firstName, String lastName) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Actor(int actorId, String firstName, String lastName, String lastUpdate) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate="
				+ lastUpdate + "]";
	}
}
