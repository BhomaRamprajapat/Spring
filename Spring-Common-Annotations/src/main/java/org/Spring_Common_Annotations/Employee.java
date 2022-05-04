package org.Spring_Common_Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeBean") // its is similar to <bean id="" class="" />
public class Employee 
{
 private Name name;
 @Value("${Employee.fname}")
 private String fname;
 @Value("${Employee.lname}")
 private String lname;
 
 public Employee()
 {
  System.out.println("Default constructor of Employee");
 }

 //@Autowired    //constructor injection
 public Employee(Name name)
 {
  this.name=name;
  System.out.println("Parameterized Constructor of Employee");
 }
 
 @Autowired  // setter injection
 public void setName(Name name)
 {
  this.name=name;
  System.out.println("setter of Employee");
 }
 
 public void test()
 {
  name.show();
  System.out.println("Employee fname : "+fname);
  System.out.println("Employee lname : "+lname);
 }
}
