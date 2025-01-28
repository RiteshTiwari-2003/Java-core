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
 * 
 * 
 */