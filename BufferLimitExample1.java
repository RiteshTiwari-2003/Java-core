
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
     */

    
