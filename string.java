/* java string 
 * 
 * the string , string builder and string buffer classes in java differ in their mutability,performance and thread safty 
 * 
 * 1. string:
 * nature: immutable (once a string object is created its value can not be changed ).
 * performance; slower in operation that modify string, concatenation because every modification create new String object.
 * thread sfety: safe for multi threaded envoirments sincr it is immutable.
 * usages: use string when the value will not change often, or for small scale stringmanipulation.
 * 
 * 2. stirngbuilder:
 * nature : mutable (you can modify the value without creating a new object ).
 * performance: fatser than string because it does not create new object for every modification
 * thread sfety; not thread safe (not synchronized), use in single threaded envoirments.
 * usages: use stringbuilder when frequent modification are needed in single threaded language
 * 
 * 3. stringbuffer:
 * nature : mutable(like stringbuilder, allow modification without creating new object)
 * performance : slower than stringbuilder due to synchronized overhead
 * thread safety; thread safe (method are synchronized making it suitable formultithreaded program).
 * usage: use stringbuffer when working in multi threaded applications where thread safety is required.
 * 
 * what si the difference between == and .equals() server different purpose and are used to compare objects or primitive values.
 * 
 * 1. == operator:
 * purpose:
 * compares reference equality for objects and value equality for primitives .
 * for primitive: checks whether the value are equal .
 * for object: check whether the two reference point to the same memory allocation (whether they are the saame object)
 * 
 * exception handling in java
 * 
 * exception handling in java
 * 
 * exception handlinghh in java is a mechanism used tio handle runtime error, ensuring that the normal flow of the program maintained 
 * even when unexpected condition occur , java provide a robust framework using ty, catch ,finally , throw, throws for managing exception
 * 
 * key component of exception handling :
 * try: define the block of code where exception can occur.
 * catch: handle the exception if it occur in try block .
 * finally: a block of code that always execute , whether an exception is thrown or not.
 * throw: used to explicitly throw an exception.
 * 
 * throws: declare exception that a method might throw.
 * 
 * 
 * type of execption checked exception 
 * unchecked exception: 
 * exception that arev chaecked at compile time, if your code may throw a checked exception, , you must either handle it by try catch block or 
 * declare it using throws keywords
 * 
 * 
 * 
 * what is the difference between final finally and finalyse() in java
 * 
 * 1. final:
 * the final keyword is a modifier used to apply restriction on classes metjod and variable
 * use of final:
 * final variable;
 * a variable declared as final can not be reassigned after it initialize.
 * for objects, the refrence is final , but object state still be modified.
 * 
 * 
 * 
 */