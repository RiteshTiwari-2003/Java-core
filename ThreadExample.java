/*multithreading in java
 * 
 * multi threading in java 
 * multithreading in java is the feature that allow execution of two or more thread simultaniously ,
 * enabling parallelism and better utilization of cpu, it allow a program to perform mltiple task concurrently.
 * 
 * key component of multithreading:
 * thread:
 * 
 * a thread is lightweighted subprocessor smallest unit of execution.
 * each thread run in the same process but it has its own call stack, and register and its execution context.abstract 
 * 
 * main thread:
 * every java program start with a single thread called the main thread.
 * the main thread can create or start other thread.
 * 
 * state of thread:
 * new:
 * created but not yet started.
 * runnable:
 * ready to run and waiting in the cpu.
 * running :
 * currently executing active.
 * blOCKED/WAITING: waiting for resource or signal.
 * terminated : completed execurtion.
 * 
 * benifit of multi threading:
 * 
 * better cpu utilization
 * improved application performanae.
 * efficient handling of concurrent task
 * enable non bloaking operation.
 * 
 * 
 * we can create thread in java using two method 
 * 1. using thread class
 * 2. using runnable interface
 * 
 * 1.using thread class;
 * extend the thread class and override the run method.
 * start the thread using the start() method.
 * 
 * 
 */
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thead is running..");
    }
}
public class ThreadExample{
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        MyRunnable myRunnable=new MyRunnable();
        Thread thread1=new Thread(myRunnable);
        thread1.start();
    }}
/*using the runnable interface
 * 
 * implement the runnable interface and define the run method.
 * create the thread object by passing the runnale instance to the Thread constructor.
 * 
 */
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable thread is running");
    }
}

