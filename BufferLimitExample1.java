
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

    
