package com.demo.dao;

public class DAOFactory {
	public static MySqlDB getMySqlDB(){
		return new MySqlDB();
	}
}
