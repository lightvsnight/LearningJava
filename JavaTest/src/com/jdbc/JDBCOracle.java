package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.model.Order;

public class JDBCOracle {
	
	
	public static Connection conn;
	public static Statement stmt;
	public static ResultSet rs;

	public static void main(String[] args) throws ClassNotFoundException {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Class.forName("com.mysql.jdbc.Driver");
		try {

			String jdbc_url= "jdbc:mysql://192.168.1.249:3306/crowd?useUnicode=true&amp;characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
			String jdbc_username= "root";
			String jdbc_password= "root";
			/*
			 * DriverManager内部类， DriverManager.getConnection(String URL, String
			 * user, String password)
			 * 
			 * URL ： a database URL of the form jdbc:subprotocol:subname
			 * 一个数据库链接URL user： the database user on whose behalf the connection
			 * is being made 这个数据库用户是谁，代表这个连接正在使用的人 password ： the user's
			 * password 这个用户的密码
			 */
			conn = DriverManager.getConnection(jdbc_url,jdbc_username,jdbc_password);

			/*
			 * Creates a Statement object for sending SQL statements to the
			 * database. 创建一个陈述对象为了发送SQL语句到这个数据库 SQL statements without
			 * parameters are normally executed using Statement objects. If the
			 * same SQL statement is executed many times, it may be more
			 * efficient to use a PreparedStatement object.
			 */
			Statement stmt = conn.createStatement();

			/*
			 * boolean execute(String sql) throws SQLException
			 * 这个方法返回一个boolean值，告诉我们这个SQL语句执行是否有误
			 * 
			 * Executes the given SQL statement, which may return multiple
			 * results 执行这个给定的SQL语句，这可能返回多样的数据
			 */
			stmt.execute("select * from cr_order");

			rs = stmt.executeQuery("select * from cr_order");
			
			List<Order> oL = new ArrayList<Order>();
			while(rs.next()){
				
               Order order = new Order();
               order.setId(rs.getInt("id"));
               order.setTaskId(rs.getInt("taskId"));
               order.setOrderCode(rs.getString("orderCode"));
               oL.add(order);
			}

			System.out.println("");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (stmt != null) {
					stmt.close();
					stmt = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}