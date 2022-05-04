package org.spring.Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car 
{
 Driver d;
 
 public Car() 
 { 
  System.out.println("default constructor of Car"); 
 }
 //@Autowired  
 public Car(Driver d) 
 {
  System.out.println("parameterized constructor of Car");
  this.d = d;
  d.run();
 }
 @Autowired
 @Qualifier("driver")
 public void setD(Driver d) 
 {
  this.d = d;
  d.run();
 }
}
