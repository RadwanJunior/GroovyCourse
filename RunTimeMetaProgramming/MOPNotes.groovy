/*Runtime MetaProgramming
-> Writing of computer programs that write or manipulate other programs or themselves

WHAT IS MOP?
-> Meta Object Protocol
-> COllection of rules of how a request for a method call is handled by groovy runtime system & how to control this intermediate layer
-> Groovy asks this intermediate layer called the MOP to understand how to call this method

Complilation with groovy
GROOVY CALLER -> MOP -> GROOVY TARGET OR JAVA TARGET

Complilation with javac
JAVA CALLER -> JAVA TARGET

3 TYPES OF OBJECTS:
1.  POJO: Regular java object
2.  POGO: Groovy object, written in groovy that extends java.lang.Object & implements groovy.lang.GroovyObject interface by default
3.  Groovy Interceptor: Groovy Object that implements groovy.lang.GroovyInterceptable interface

**SEE GROOVY METHOD CALL TREE FOR MORE HELP!

invokeMethod() = we can catch method calls from methods that are not defined

WHAT IS EXPANDO?
-> Class in groovy that allows you to add properties and methods to it dynamically
*/