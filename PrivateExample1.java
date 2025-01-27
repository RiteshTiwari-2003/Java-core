/*
 * method overloading in java
 * 
 * method overloading occur within the same class and allow you to define multiple method with the same name but different parameters.the 
 * compiler differentiate between these methods based on number, type and order of their parameter.
 * 
 * key point:
 * same name but different parameterlist
 * it is compiler time polymorphism.
 * method can have different return type, but method signature must differ.
 * 
 * 2. method overriding:
 * 
 * method overriding occur between a parent and child class, where a method in child class has the same name , return type and parameter as mehod in parent class.
 * 
 * key points:
 * same method name, same parameter and same return type.
 * it is run time (dynamic ) polymorphism .
 * the @override annotation is used to indicate that a method is being overridden.
 * 
 * 
 * java new keyword;
 * 
 * the java new keyword is used to create new instance of the class. in other word i can say that it instantiate a class by allocating memory for new object and returning a reference to that memory
 * 
 * point to remember:
 * it is used to create the object.
 * it allocate the memory at runtime
 * all object occupy memory at heap area
 * it invokes the object constructor
 * 
 * 
 * java private keyword
 * 
 * a java private keyword is an access modifier , it can be assigned to variable , methods and inner class , it is the most restricted  type of access modifier
 * 
 * point to remember the private access modifier is accessible only within the same class.
 * we can not assign private to outer class and interface.
 * the best use of private is create a fully encapsulated class in java by making all the data member of the class private.
 * 
 * if we make any class constructor private then we can not create instance of class outside the class .
 * if we are overriding method, overridden method must not be restrictive.
 * 
 * according to the previous point when we asign a private modifier to any method and variable that method or variable can be overridden
 * to subclass using any type of access modifier , however , still private method can not be accessable outside the class.
 *
 * 
 */

 class A{
   //private String msg="try to access private variable outside the class";// this gave error 
    String msg="try to access private variable outside the class";
 }
 public class PrivateExample1{
   public static void main(String[] args){
      A a=new A();
      System.out.println(a.msg);
   }
    
 }

 //lets see that whether we can assign the private modifier to the outer class or not

 /*private class PrivateExample3{
   void display(){
      System.out.println("Try to access outer private class");  this give error we can not assign outclass as private access modifier
   }
 }
   
 
 java protected keyword
 
 a java protected keyword is an access modifier , it can be assigned to variable , methods and constructor and inner class 
 
 point to remember 
 
 java protected keyword or protected access modifier is accessible within the package , however it is also accessible outside the package but only with inheritence.
 
 we can not assign protected on outer class and interface
 
 if you make any constructor protected , you can notn create instance of that class outside the package .
 
 package com.java;
 public class A{
 protected String msg="try to access the protected variable outside the package";}
 package com.javatpoint;
 import com.java.A
 public class ProtectedExample1{
 public static void main(String[] args){
 A a=new A();
 System.out.println(a.msg);}}// error come 


 java public keywords

 
 */