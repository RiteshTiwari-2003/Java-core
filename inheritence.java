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
 */
