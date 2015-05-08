package kr.co.siksco.tobby.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

	public Connection makeConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://55447970fc6b4d799b0000d1-soom.cloudsc.kr:44861/soomspring?useUnicode=true&characterEncoding=utf8"
				, "soomspring", "soomspring");
		return con;
	}

}
