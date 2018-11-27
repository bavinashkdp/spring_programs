package com.jspiders.Spring_Demo1BeanLifeCycleAnnotationBasedApproach;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dao_Class 
{
	private Connection connection;
	private String driver,user,url,password;
	private Dao_Class() 
	{
		System.out.println("object is created");
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@PostConstruct
	public void myInit() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		connection=DriverManager.getConnection(url, user, password);
		System.out.println("connection object is created");
	}
	public void save(int id,String name,double salary) throws SQLException
	{
		String qry="insert into jdbc.employee values(?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, salary);
		preparedStatement.executeUpdate();
		System.out.println("datas are inserted into data base");
	}
	public void updateName(int id,String name) throws SQLException
	{
		String qry="update  jdbc.employee set name=? where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, name);
		preparedStatement.executeUpdate();
		System.out.println("datas are updated into data base");
	}
	public void updateSalary(int id,double salary) throws SQLException
	{
		String qry="update  jdbc.employee set salary=? where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(2, id);
		preparedStatement.setDouble(1, salary);
		preparedStatement.executeUpdate();
		System.out.println("datas are updated into data base");
	}
	
	public void updateAll(int id,String name,double salary) throws SQLException
	{
		String qry="update  jdbc.employee set name=?,salary=? where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(3, id);
		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2, salary);
		preparedStatement.executeUpdate();
		System.out.println("datas are updated into data base");
	}
	public void get(int id) throws SQLException
	{
		String qry="select * from  jdbc.employee where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getDouble(3));
			
		}
		System.out.println("datas are fetched from data base");
	}
	public void delete(int id) throws SQLException
	{
		String qry="delete from  jdbc.employee where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		System.out.println("datas are deleted  from data base");
	}
	
	@PreDestroy
	public void myDestroy() throws SQLException
	{
		connection.close();
		System.out.println("connection object is closed");
	}

}
