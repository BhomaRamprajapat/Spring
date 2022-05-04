package org.Spring_Common_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
 public static void main( String[] args )
 {
  // I don't want to use xml file so i am creating a config class
  //ApplicationContext context=new ClassPathXmlApplicationContext("org/Spring_Common_Annotations/beans.xml");
  
  ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
  Employee e=context.getBean("employeeBean",Employee.class);
  
  ((AnnotationConfigApplicationContext)context).close();
  e.test();
 }
}
