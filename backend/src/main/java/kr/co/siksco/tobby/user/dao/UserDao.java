package kr.co.siksco.tobby.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.siksco.tobby.user.domain.User;

public class UserDao {
	private ConnectionMaker connectionMaker;
	
	public UserDao(ConnectionMaker connectionMaker){
		this.connectionMaker = connectionMaker; 
	}
	public void add(User user) throws ClassNotFoundException, SQLException{
		Connection con = connectionMaker.makeConnection();
		PreparedStatement ps = con.prepareStatement(
				"INSERT INTO TEST_USER (id, name, password) values (?,?,?)");
		
		ps.setString(1, user.getId());
		ps.setString(2,  user.getName());
		ps.setString(3,  user.getPassword());
		
		ps.executeUpdate();
		
		ps.close();
		con.close();
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException{
		Connection con = connectionMaker.makeConnection();
		PreparedStatement ps = con.prepareStatement(
				"SELECT * FROM TEST_USER WHERE id = ?");
		
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		con.close();
		
		return user;
	}
	
	
}
