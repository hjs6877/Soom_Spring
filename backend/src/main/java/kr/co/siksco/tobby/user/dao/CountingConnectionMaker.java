package kr.co.siksco.tobby.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class CountingConnectionMaker implements ConnectionMaker {

	private int counter;
	private ConnectionMaker realConnectionMaker;
	private DataSource dataSource;

	public CountingConnectionMaker(DataSource dataSource){
		this.dataSource = dataSource;
	}
	
	public Connection makeConnection() throws ClassNotFoundException,
			SQLException {
		this.counter++;
		return realConnectionMaker.makeConnection();
	}

	public int getCount(){
		return this.counter;
	}
}
