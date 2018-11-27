
package com.jspiders.Spring_Demo1BeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dao_Class implements InitializingBean,DisposableBean
{
	private Connection connection;
	private String derver_class;
	private String url;
	private String userName;
	private String password;
	public String getDerver_class() {
		return derver_class;
	}
	public void setDerver_class(String derver_class) {
		this.derver_class = derver_class;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Dao_Class [derver_class=" + derver_class + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}
	//it will act like inint(servletConfig config) in in Genericservlet class for initiliazing the  Connection object
	public void afterPropertiesSet() throws Exception 
	{
		Class.forName(derver_class);
		connection=DriverManager.getConnection(url, userName, password);
		System.out.println("connection object is opened!!!!!");
	}
	
	public void save(int id,String name,double salary) throws SQLException
	{
		String qry="insert into jdbc.employee values(?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setDouble(3, salary);
		preparedStatement.executeUpdate();
		System.out.println("datas are inserted into database");
	}
	public void get(int id) throws SQLException
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
	
	public void update(int id,String name,double salary) throws SQLException
	{
		String qry="update jdbc.employee set name=?,salary=? where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(3, id);
		preparedStatement.setString(1, name);
		preparedStatement.setDouble(2, salary);
		preparedStatement.executeUpdate();
		System.out.println("datas are upadated into database");
	}
	
	public void delete(int id) throws SQLException
	{
		String qry="delete from jdbc.employee where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(qry);
		preparedStatement.setInt(1, id);
		 preparedStatement.executeUpdate();
		 System.out.println("datas are deleted from database");
	}
	
	// it will ac like destroy method in Genericservlet class for close chostly resources
	public void destroy() throws Exception 
	{
		connection.close();
		System.out.println("connection object is closed");
	}

}
