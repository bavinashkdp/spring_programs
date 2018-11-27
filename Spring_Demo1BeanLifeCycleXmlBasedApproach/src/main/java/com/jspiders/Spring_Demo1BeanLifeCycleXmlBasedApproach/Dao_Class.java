package com.jspiders.Spring_Demo1BeanLifeCycleXmlBasedApproach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Dao_Class
{
	private Connection connection;
	private String driver;
	private String url;
	private String user;
	private String password;
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void myInit() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		connection=DriverManager.getConnection(url, user, password);
		System.out.println("Connection object is created!!!!!!!");
	}
	public void persist(int id,String name,double sal) throws SQLException
	{
		String qry="insert into jdbc.employee values(?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, sal);
		preparedStatement.executeUpdate();
		System.out.println("datas are inserted into database");
	}
	public void load(int id) throws SQLException
	{
		String qry="select * from jdbc.employee where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getDouble(3));
		}
		System.out.println("datas are fetched from database");
	}
	public void update(int id,String name,double sal) throws SQLException
	{
		String qry="update  jdbc.employee set name=?,salary=? where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(3, id);
		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2, sal);
		preparedStatement.executeUpdate();
		System.out.println("datas are updated into database");
	}
	public void delete(int id) throws SQLException
	{
		String qry="delete from jdbc.employee  where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		System.out.println("datas are deleted from database");
	}
	public void myDetroy() throws SQLException
	{
		connection.close();
		System.out.println("connection object is closed!!!!!!!!!!!!!");
	}
	
	

}
