package org.spring.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import literalValuesInjection.Student;

public class App 
{
 public static void main( String[] args )
 {
  ApplicationContext context=new ClassPathXmlApplicationContext("org/spring/Autowiring/beans.xml");
  
  //Car d=(Car)context.getBean("car");
  
  Student s=context.getBean("student",Student.class);
  System.out.println(s);
 }
}
