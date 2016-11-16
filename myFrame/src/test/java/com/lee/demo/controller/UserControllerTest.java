package com.lee.demo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class UserControllerTest {
	
	/**
	 * 1、以嵌入式（本地）链接方式连接h2数据库
	 * 这种连接方式默认情况下只允许一个客户端连接到h2数据库，有客户端连接H2数据库之后，此时的数据库文件就会被锁定，那么其他客户端就无法连接了
	 * 连接语法：jdbc:h2:[file:][ ]
	 * 例如：
	 * jdbc:h2:~/test //连接位于用户目录下的test数据库
	 * jdbc:h2:file:/data/sample
	 * jdbc:h2:file:E:/H2/gacl(Windows only)
	 */
	@Test
	public void testH2DB(){
		final String JDBC_URL="jdbc:h2:test";
		final String USER="sa";
		final String password="";
		final String DRIVER_CLASS="org.h2.Driver";
		try {
			Class.forName(DRIVER_CLASS);
			Connection conn= DriverManager.getConnection(JDBC_URL, USER, password);
			Statement stmt = conn.createStatement();
			stmt.execute("drop table if EXISTS USER_INFO");
			stmt.execute("CREATE TABLE USER_INFO(id VARCHAR(36) PRIMARY KEY,name VARCHAR(100),sex VARCHAR(4))");
	        //新增
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('1','大日如来','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('2','青龙','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('3','白虎','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('4','朱雀','女')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('5','玄武','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('6','苍狼','男')");
	        //删除
	        stmt.executeUpdate("DELETE FROM USER_INFO WHERE name='大日如来'");
	        //修改
	        stmt.executeUpdate("UPDATE USER_INFO SET name='孤傲苍狼' WHERE name='苍狼'");
	        //查询
	        ResultSet rs = stmt.executeQuery("SELECT * FROM USER_INFO");
	        //遍历结果集
	        while (rs.next()) {
	            System.out.println(rs.getString("id") + "," + rs.getString("name")+ "," + rs.getString("sex"));
	        }
	        //释放资源
	        stmt.close();
	        //关闭连接
	        conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 2、使用TCP/IP的服务器模式(远程连接)方式连接H2数据库(推荐)
	 * 这种连接方式就和其他数据库类似了，是基于Service的形式进行连接的，因此允许多个客户端同时连接到H2数据库
	 * 连接语法：jdbc:h2:tcp://[: ]/[ ]
	 * 范例：jdbc:h2:tcp://localhost/~/test
	 */
	@Test
	public void h2_tcp_connection(){
		final String JDBC_URL = "jdbc:h2:tcp://localhost/~/test";
	    final String USER = "sa";
	    final String PASSWORD = "123";
	    final String DRIVER_CLASS="org.h2.Driver";
	    
	    try {
			Class.forName(DRIVER_CLASS);
		    Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
		    Statement stmt = conn.createStatement();
		    stmt.execute("DROP TABLE IF EXISTS USER_INFO");
		    stmt.execute("CREATE TABLE USER_INFO(id VARCHAR(36) PRIMARY KEY,name VARCHAR(100),sex VARCHAR(4))");
		  //新增
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + 11+ "','大日如来','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + 22+ "','青龙','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + 33+ "','白虎','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + 44+ "','朱雀','女')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + 55+ "','玄武','男')");
	        stmt.executeUpdate("INSERT INTO USER_INFO VALUES('" + 66+ "','苍狼','男')");
	        //删除
	        stmt.executeUpdate("DELETE FROM USER_INFO WHERE name='大日如来'");
	        //修改
	        stmt.executeUpdate("UPDATE USER_INFO SET name='孤傲苍狼' WHERE name='苍狼'");
	        //查询
	        ResultSet rs = stmt.executeQuery("SELECT * FROM USER_INFO");
	        //遍历结果集
	        while (rs.next()) {
	            System.out.println(rs.getString("id") + "," + rs.getString("name")+ "," + rs.getString("sex"));
	        }
	        //释放资源
	        stmt.close();
	        //关闭连接
	        conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 3、内存模式
	 * 只存在于内存中，一旦服务器重启，则内存中的数据库和表都不存在了
	 */
}
