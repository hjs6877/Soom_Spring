package kr.co.siksco.tobby.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.siksco.tobby.user.domain.User;

public class UserDao {
	public void add(User user) throws ClassNotFoundException, SQLException{
		Connection con = this.getConnection();
		
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
		Connection con = this.getConnection();
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
	
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://55447970fc6b4d799b0000d1-soom.cloudsc.kr:44861/soomspring?useUnicode=true&characterEncoding=utf8"
				, "soomspring", "soomspring");
		return con;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("hjs6877");
		user.setName("황정식");
		user.setPassword("6877");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + " 조회 성공");
	}
}
