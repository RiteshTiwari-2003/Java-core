# java introduction

Java is the object oriented programming language , class -based, concurrent , secured , and general purpose computer programming language , it is widely used robust technology.

java is the prograsmming language and platform , java is the high level robust object oriented and secure programming language ,
java was developed by sunmicrosystem(which is now the subsidery of oracle ) in the year 1995 , james gosling is known as the father of java programming language, before java its name was oak , since oak was already a regstered company so james gosling and his team changed the name from oak to java.

# Getting Started

before diving into code we will need to setup your development envoirment , java development typically required the java development kit,which include the java compiler and other development tools, you can download jdk from official oracle website , once we have jdk installed , you can use the text editor or an integrated development envoirment (IDE) like intelliJ IDEA, Eclipse, or netBeans to wroite and run your core java,

# feature of java

A list of the most important features of the Java language is given below.

Java Features
Simple
Object-Oriented
Portable
Platform independent
Secured
Robust
Architecture neutral
Interpreted
High Performance
Multithreaded
Distributed
Dynamic

# difference between jvm , jdk and jre

jm is the java vertual machine is an abstract machine,it is calle as virtual machine because it does not irtual exist.
it is an specufication that provide an run time enoirment in which java byte code can be executed
it is also run those program which are written in other language but compiled to java bytecode,
jvm are aailable for many software and hardware platform , jm jre and jdk
are platform dependent because the configuration of each os is different form each other ,

jvm perform the following main task:
loads code
verifies codes
execute codes
provide runtime enoirment 

# jre 

JRE is an acronym for Java Runtime Environment. It is also written as Java RTE. The Java Runtime Environment is a set of software tools which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.

# jdk

jdk is the jaa development kit is a software development enoirment whichh is used to developed
java applications and applets,it physically exist it contains jre + development tools.

jdk is implenmentaion of any one of the below given jaa platform released by oracle coorporates
standard edition java platform
enterprise edition java platform
micro edition java platform

the jdk contain the private java virtual machine and a few other resources 
interpreter(loader), a compiler (javac),an achiever(jar), a documentaion generator(javadoc)

# variable in java 
there are three type of variables in java
1. local variable 
2. instance variable
3. static variable

there are two data types in java :
1. primitive 2. non - primitive 

1. local variable :
a variable declared inside the body of the method is called local variable ,
you can use this variable only within the method and the other method in the class even not aware with this varible 

public class LocalVariable{
    public static void main(String[] args){
        int num=10;
        System.out.println(num);
    }
}
2. instance variable :
a ariable declared inside the class outside the body of the method , is called an instance variable,
it is not declared as static.

it is called as instance variable because its value is instance specific and is not shared among instance.

