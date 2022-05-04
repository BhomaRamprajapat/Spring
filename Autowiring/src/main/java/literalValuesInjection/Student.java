package literalValuesInjection;

//import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student 
{
 // @Value("${student.name}") it is not using setter injection
 private String name;
 private String course;
 
 
 //@Required it is not working due to it is depricated
 //@Value("BhomRaj") we are giving static value
 @Value("${student.name}") //loading values from properties file
 public void setName(String name)
 {
  this.name=name;
 }
 
 @Value("${student.course}")
 public void setCourse(String course)
 {
  this.course=course;
 }
 
 public String toString()
 {
  return "Name   : "+name+"\n"+"Course : "+course;
 }
}
