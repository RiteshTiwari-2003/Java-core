/*
 * inheritense in java
 * 
 * inheritense in java is mechanism in which one object acquire all properties and behaviour of parent object .
 * it is importent part of oops.
 * 
 * the idea behind inheritense in java is that we can create new classes that are build upon existing class.when we inherit methods from an existing classeswe can reuse method and 
 * fields of parent classes.
 * 
 * inheritense in java enable a class to inherit properties and action from another class called a super class and parent class ,
 * a class derived from super class is called child class and subclass.
 * 
 * inheritence represent is a relation ship which is also known as parent child relation ship.
 * 
 * why use inheritense in java:
 * for overriding , for run time polymorphism in java
 * code reusability
 * 
 * type of inheritense in java:
 * 
 * 1: single inheritence
 * 2; multilevel inheritense
 * 3: Hierrachical inheritence
 * 
 * Aggrigation in java:
 * 
 * Aggregation is simply a has a relation ship
 * 
 * if a class have entity reference,it is known as aggregation.aggregation represent has a relation ship.
 * consider a situation where  Empoyee object contain many information such as id, name , emailid etc.
 * it contain one more object named address, which contain its own information such as city , state, country, Zipcode etc.
 * 
 * class Employee{
 * int id;
 * String name;
 * Address address;}
 * in such case employee has a entity reference address
 * 
 * class Operation{
 * int square(int num){
 * return n*n;}}
 * class circle{
 * Operation op;
 * double pi=3.14;
 * double area(int radius){
 * op=new Operation();
 * int rsqure=op.square(radius);
 * return pi*rsquare;}}
 * 
 * 
 super keyword in java

 the super keyword in java is a referense variable which is used to refer immideate parent class object.
 whenever you create the instance of subclass, an instanse of parent class is created implicitly which is refered by super reference variable.

 usage of java super keyword:
 super can be used to refer immdeate parent class instance variable
 super can be used to invoke immdeate parent class method.
 super() can be used to invoke the immdeate parent class constructor.

 final keyword in java:

 the final keyword in java is used to restrict the user.

 runtime polymorphism in java (overriding)
 plymorphism have two type one is compile time polymorphism and one is run time polymorphism 
 polymorphism in java is a concept by which we can perform a single action in different ways, polymorphism derived from 2 greek words: one is poly means many and 
 morphs means many forms.
 so plymorphism means many forms.

 compile time polymorphism :
 method overloading is used to achive compile time polymorphism , a class have numourous method with the same name 

 class Calculation {  
    int add(int a, int b) {  
        return a + b;  
    }  
    double add(double a, double b) {  
        return a + b;  
    }  
}  
public class CompileTimePolymorphism {  
    public static void main(String[] args) {  
        Calculation calc = new Calculation();  
        // Compile-time polymorphism: selecting the appropriate add method based on parameter types  
        System.out.println("Sum of integers: " + calc.add(5, 3));  
        System.out.println("Sum of doubles: " + calc.add(2.5, 3.7));  
    }  
}  
    runtime polymorphism in java

    runtime polymorphism or dynamic method dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile time.

    class Bike{  
  void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    b.run();  
  }  
}  

Dynamic binding and static binding in java

connecting a method call to the method body is known as binding
there are two type of binding 

1. static binding
2. dynamic binding

1. static binding:
when type of objectt is determined at compile time, it is known as static binding.

2. dynamic binding:
when type of object is determined at run time, it is known as dynamic binding

static binding example;

class Dog{
private void eat(){
System.out.println("dog is eating...");}
public static void main(String[] args){
Dog d1=new Dog();
d1.eat();}}


dynamic binding:

class Aninmal{
void eat(){
System.out.println("animal is eating");
}}
class Dog extends Animal{
void eat(){
System.out.println("dog is eating");}
public static void main(String[] args){
Animal a=new Dog();
a.eat();}}



java instanceof operator

the java instance of operator is used to test whether the object is an instance of specified type or not (class or subclass or interface)

public static void main(String[] args){
Simple1 s=new Simple1();
System.out.println(s instanceOf Simple1);//true}



 */
