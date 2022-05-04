package org.SpringBeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection 
{
 @Value("${mysql.userName}")
 private String userName;
 
 @Value("${mysql.password}")
 private String password;
 
 @Value("${mysql.url}")
 private String url;
 
 @Value("${mysql.driver}")
 private String driver;
 
 private Connection cn;
 
 //@PostConstruct // like init method
 public void createConnection() throws ClassNotFoundException, SQLException
 {
  System.out.println("Creating Connection");
  
  //loading deriver
  Class.forName(driver);
  
  //getting connection
  cn=DriverManager.getConnection(url,userName,password);
 }
 
 public Connection getConnection()
 {
  return cn;
 }
 
 //@PreDestroy
 public void destroy() throws SQLException
 {
  System.out.println("closing connection");
  cn.close();
 }
}













