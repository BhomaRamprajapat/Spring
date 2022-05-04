package org.SpringBeanLifeCycle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
 public static void main(String...arg) throws SQLException
 {
  ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
  
  JDBCConnection jdbc=context.getBean("jdbc",JDBCConnection.class);
  
  Connection cn=jdbc.getConnection();
  
  Statement st=cn.createStatement();
  
  
  ResultSet rs=st.executeQuery("select * from student");
  
  while(rs.next())
  {
   System.out.println(rs.getString(2));
  }
  /*
   registerShutdownHook() will execute once the main thread ends. son once all your
   codes gets executed, it will be called and close your container. So it won't give
   us any exception irrespective of the line no. we are calling it.
   */
  ((ClassPathXmlApplicationContext)context).registerShutdownHook(); // similar to close()
    
  //((ClassPathXmlApplicationContext)context).close();
 }
}
