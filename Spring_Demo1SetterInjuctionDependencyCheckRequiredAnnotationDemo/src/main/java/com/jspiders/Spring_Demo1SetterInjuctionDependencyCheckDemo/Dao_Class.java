package com.jspiders.Spring_Demo1SetterInjuctionDependencyCheckDemo;

import org.springframework.beans.factory.annotation.Required;

public class Dao_Class 
{
	private  String derverClass;
	private String url;
	private String user;
	private String password;
	public String getDerverClass() {
		return derverClass;
	}
	@Required
	public void setDerverClass(String derverClass) {
		this.derverClass = derverClass;
	}
	public String getUrl() {
		return url;
	}
	@Required
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
	@Override
	public String toString() {
		return "Dao_Class [derverClass=" + derverClass + ", url=" + url + ", user=" + user + ", password=" + password
				+ "]";
	}
	

}
