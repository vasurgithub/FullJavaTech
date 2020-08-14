` **Important Notes for Demos:** `
#### *[POJO] - Plain Old Java Object
   In software engineering, a plain old Java object is an ordinary Java object, not bound by any special restriction. 
   
#### [Refer][1] for difference between POJO and JavaBean
[1]: https://www.geeksforgeeks.org/pojo-vs-java-beans/#:~:text=POJO%20stands%20for%20Plain%20Old,re%2Dusability%20of%20a%20program.

![](./Images/SpringDemo0.png)
# _Spring Demos_
---
  + __Demo1__ : `Constructor-based dependency injection`

## `__Demo~1__` 

  ### Create a New Maven Project
  #### Select an Archetype
  -  **Group id**: org.apache.maven.archetypes
    - **Artifact id**: maven-archetype-quickstart
    - **Version** : 1.4
  #### New Maven Project
   - **Group id**: com.ravada
    - **Artifact id**: SpringDemo1
    - **Package**: com.ravada.SpringDemo1
    ![](./Images/SpringDemo1.png)
  #### File Structure
  ![](./Images/SpringDemo2.png)
  ![](./Images/SpringDemo3.png)
#### Added dependency to POM.xml file (Project Object Model)
    The below dependency added in the POM.xml file
```
    <dependency>
     <groupId>org.springframework</groupId>
     <artifactId>spring-context</artifactId>
     <version>5.2.1.RELEASE</version>
    </dependency>
```
  Save the changes
  ![](./Images/SpringDemo5.png)
  ![](./Images/SpringDemo4.png)
  Rightclick->Maven->Update Project
  Add new folder __resources__ in the src/main.
  RClick on main folder->New-> New Folder
  ![](./Images/SpringDemo6.png)
  ![](./Images/SpringDemo7.png)
  Rightclick->Maven->Update Project
  Delete the App.java from /src/main/java
  ![](./Images/SpringDemo8.png)
  ![](./Images/SpringDemo9.png)
  Create a new __FlightBean.java__ class in Package __com.ravada.SpringDemo1__
  RClick on __com.ravada.SpringDemo1__ package->New->Class
  
  ![](./Images/SpringDemo10.png)
  ![](./Images/SpringDemo11.png)

  Source code of __FlightBean.java__
  ```
  package com.ravada.SpringDemo1;
  public class FlightBean {
    String source;
    String destination;
    Double price;
    public FlightBean(String source, String destination, Double price) {
      // TODO Auto-generated constructor stub
      this.source=source;
      this.destination=destination;
      this.price=price;
    }
      public void display() {
      System.out.println("Source  :"+source);
      System.out.println("Destination:"+destination);
      System.out.println("Price: "+price);	
    }
  }
  ```
  ![](./Images/SpringDemo12.png)
Adding a Spring Bean Configuration file to resources
![](./Images/SpringDemo13.png)
RClick on __src/main/resources__ and select 
New->Spring Bean Configuration File
![](./Images/SpringDemo14.png)
![](./Images/SpringDemo15.png)
Click on __Finsh__
![](./Images/SpringDemo16.png)
Add the below code in the __config.xml__ file
```
<bean id="flightBean" class="com.ravada.SpringDemo1.FlightBean">
<constructor-arg name="source" value="Hyderabad"/>
<constructor-arg name="destination" value="Bangalore"/>
<constructor-arg name="price" value="5090.00"/>     
</bean>
```
![](./Images/SpringDemo17.png)
Delete the file __AppTest.java__ from /src/test/java
![](./Images/SpringDemo18.png)
Add the new __FlightTest.java__ class to test the FlightBean
RClick on package  __com.ravada.SpringDemo1__ in __SpringDemo1/src/test/java__ and select 
New->Class
![](./Images/SpringDemo19.png)
![](./Images/SpringDemo20.png)
![](./Images/SpringDemo21.png)
```
package com.ravada.SpringDemo1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class FlightTest {
	public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("config.xml");
        
        FlightBean fb = (FlightBean)ap.getBean("flightBean");
        fb.display();
 	}

}
```
![](./Images/SpringDemo22_a.png)
To update the Maven Project __SpringDemo1__
RClick on Maven Project __SpringDemo1__ and Select Maven-> Update Project (Alt + F5)

![](./Images/SpringDemo23.png)
![](./Images/SpringDemo24.png)
Click __OK__ to Update the Maven Project __SpringDemo1__
Run the Spring Application (__FlightTest.java__)
RClick on FlightTest.java -> Run As -> Java Application
![](./Images/SpringDemo25.png)
The output is displayed in Console screen
![](./Images/SpringDemo26.png)





Topics:
Constructor-based DI is accomplished when the container invokes a class constructor with a number of arguments, each representing a dependency on other class.
Spring IOC use default constructor to create the object of the class .if your class has parameterized constructor , then you have to call the parameterized constructor to create the object