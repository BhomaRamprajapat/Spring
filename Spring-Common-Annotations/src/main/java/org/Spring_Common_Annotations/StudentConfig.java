package org.Spring_Common_Annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
// i want to use another method to create bean so i am commenting this line
@ComponentScan(basePackages = "org.Spring_Common_Annotations")
@PropertySource("classpath:Employee-info.properties")
public class StudentConfig 
{
 
 
/*
 @Bean(name="mybean") // i can give name(id) from here also
 // i can use multiple name(id) of bean 
 // like name={"mybean","employeeBean"}
 public Employee employeeBean() // method name is going to my bean id
 {
  // return new Employee(nameBean());  this is constructor injection
  Employee e=new Employee();
  
  //this is setter injection
  e.setName(nameBean());
  return e;
 }
 
 @Bean
 public Name nameBean()
 {
  return new Name();
 }
 */
}
