/*abstraction in java
 * 
 * in the world of java programming , abstract classes play a crucial role in java programming to defining the sturcture of the classes 
 * and therir behaviour in hierarchy , they provide a blueprint for other team to follow,
 * 
 * a class which is declared with the abstract keyword is known as abstract class in java, it can have abvstract and non abstract mehtod in java
 * 
 * abstracwtion in java 
 * 
 * abstraction is the process of hiding the implementation details and showing only functionality to the user 
 * another  way it shows only essential thing to the user and hide the internal details , for example sending the sms where we type 
 * the text and send the message. we do not know the interna processing about the message delivery.
 * 
 * way to achive abstraqction
 * 
 * there are two way to achive abstraction 
 * 1. using abstract class (0 to 100%)
 * 2. using interface(100%)
 * 
 * abstract class in java 
 * an abstract class in java act as a partially implemented class that itself cannot be instantiated, it exist only for subclassing purpose, 
 * and provide twemplate for its subcategories to follow, abstract class can have implementaion with abstract methods abstract method are declared 
 * to have no body, leaving their implementaion to the subclass.
 * 
 * point to remember
 * 
 * an abstract class must be declarted with an abstract keyword
 * it can have abstract and non abstract method.
 * it can not be instantiated
 * it can have constructor and static mrthod also.
 * it can  have final method which will force the subclass not to change the body of the method.
 * 
 * rule for java abstract class
 * 
 * an abstract class must be declared within abstract keyword 
 * it can have abstract and non abstract methods 
 * it can not be instantiated
 * it can have final methods
 * it can have comnstructor and static methods also.
 * 
 * sytex of abstract clASS
 * 
 * public abstract class Shape{
 * public abstarct double area();
 * public void display(){
 * System.out.printlnz("This is sahpe");}
 * 
 * 
 * }
 * 
 * abstract methods in java
 * 
 * an abstarct method which is declared in absteract class and does not have body implementation and use abstarct keyword is known as abstarct method.
 * 
 * abstarct class Bike{
 * abstarct void run();
 * }
 * class Honda extends Bike{
 * void run(){
 * System.out.println("running safety");
 * }
 * public static void main(String[] args){
 * Bike obj=new honda();
 * obj.run();
 * }}
 */