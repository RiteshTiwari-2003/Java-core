
import java.nio.DoubleBuffer;

/*
 * Double buffer limit() method in java with example 
 * 
 * the java.nio.DoubleBuffer has a limit function , the double buffer class utilized to adjust the limit of this DoubleBuffer.
 * this method sets the new limit of the buffer by using the parameter.
 * 
 * syntex:
 * public final DoubleBuffer limit(int newLimit)
 * 
 * 
 */
public class BufferLimitExample1{
    public static void main(String[] args) {
        DoubleBuffer db=DoubleBuffer.allocate(6);
        db.put(10.5);
        db.put(20.5);
        System.out.println("The DoubleBuffer before setting the buffer's limit " + java.util.Arrays.toString(db.array()) + "\n at the position " + db.position() + "\n and the limit: " + db.limit());
        db.limit(2);


    
    }}

    /*java short keyword
     * the short keyword default size is -32768 to 32767, its default value is 0 , its default size is 2 bytes, it is used to save memory in large array
     * 
     * java long keyword:
     * java long keyword is a primitive data type , it is used to declare a vaiable , it can also be used with methods,it can hold the 64 bits two's compliment integer.
     * the long containe minimum value of -2^63 and maximum value 2^63-1
     * 
     * from java 8, the long can represent as an unsigned 64bit long , which has a minimum value of 0 and and a maximum value is 2^64-1
     * 
     * 
     * java string valueOf()
     * 
     * the String.valueOf() method in java is a multipurpose static method. its major function lies in conversion of types of data,
     * such as primitive types and object into a string.the technique provide a efficient and convenient way to construct string objects from different source of data.
     * 
     * internal representation
     * 
     * public static String valueof(Object obj){
     * return (obj==null)?"null":obj.toString();}
     * 
     * method signature 
     * public static String valueOf(boolean b)
     * public static String valueOf(char c)
     * public static String valueof(char[]c)
     * public static String valueof(int i)
     * 
     * public class stringvalueofExample{
     * public static void main(String[] args){
     * int value=30;
     * String s1=String.valueOf(value);
     * System.out.println(s1+10);}}// output is 3010
     * 
     * java abstract keyword
     * 
     * the abstract eyword is used to achive abstraction in java, it is a non access modifier whch is used to create abstract cloass and method.
     * the role of an abstract class is to contain abstract method, however it also contain non abstraqct method, the method which is declared with abstract keyword and does not have implementationn is
     * known as abstract method
     * 
     * abstract class Employee{
     * abstract void work(){
     * }}// we cannot declare a abstract method in non abstract class 
     * 
     * rule of abstract keyword
     * 
     * 1. an abstract keyword cannot be used with variable and constructor
     * 2. if a class is abstract it can not be instantiated
     * 3. if a method is abstract it can not be contain body
     * 4. we can not use abstract with final
     * 5. we can not declare abstract keyword as a private
     * 6. we can not declare abstract keyword as a static
     * 7. an abstract method can not be synchronized.
     * 
     * an abstract keyword can only be useful with class and method 
     * an abstract class contain constructor and static method 
     * if qa class extends the abstract class , it must also implementsa the atleast one of the abstract method.
     * an abstract class contain the main method and the final method.
     * an abstract class contain overloaded abstract method.
     * 
     * 
     * example of abstract keyword;
     * abstract class vehicle{
     * abstract void bike();}
     * class honda extends Vehicle{
     * @override
     * void bike(){
     * System.out.println("bike is ridding");}}
     * public class AbstarctExample1{
     * pubic static void main(String[] args){
     * Hondaobj=new honda();
     * obj.bike();}}
     * 
     * 2. abstract class can contain non abstract method and abstract method
     * 
     * abstract class Vehicle[
     * abstract void bike();
     * void car(){
     * System.out.println("Car is running");}]
     * class Honda extends Vehicle{
     * @override 
     * void bike(){
     * System.out.println("bike is running");}}
     * public class AbstactExample2{
     * public static void main(String[] args){
     * Honda obj=new Honda();
     * obj.bike();
     * obj.car();}}
     * 
     * example 3:
     * 
     * abstract class containing the constructor
     * 
     * abstract class Vehicle{
     * String msg;
     * Vehicle(String msg){
     * this.msg=msg;}
     * void display(){
     * System.out.println(msg);}}
     * class Honda extends Vehicle{
     * Honda(String msg){
     * super(msg);}
     * }
     * public class AbstractExample3{
     * public static void main(String[] args){
     * Honda obj=new homda("Constructor is invoked");
     * obj.display();}}
     */

    
