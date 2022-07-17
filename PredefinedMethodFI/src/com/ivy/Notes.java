package com.ivy;


/*
 * 
 * Predefined Functional Interfaces :
 * ============================================
 * 
 * 		#1. Lambda Expression is used to reduce the no.of lines code and avoid implementation
 * 			classe
 * 		#2.Funcional Interface is used to call Lambda Expression
 * 		a. Predicate
 * 		b. function
 * 		c. consumer
 * 		d. Supplier
 * 		e. Bipredicate
 * 		f. BiFunction
 * 		g. BiConsumer
 * 		h. UnaryOperator
 * 		i. BinaryOperator
 * 
 *  1. Predicate :
 *  		#1. It is boolean value function
 *  		#2.Predicate is used to perform some conditional check
 *  			i.e.wherever conditional checks are there use predicate instead of writing
 *  			more code
 *  
 *  interface Predicate<T>{
 *  	boolean test(T t);
 *  }
 */
/*
 *  Method Reference 
 * ================================================================
 * 
 *  #1. Java8 provides a new feature is called Method Reference. In C++ it is called Method resolution 
 *      operator. It was used to resolve the ambiguity in C++ 
 *  #2. The main objective of Lambda expression is to reduce no.of lines in code
 *  #3. The main objective of Method reference is used to no lines of code in Lambda Expression body
    just call method defination ,it will take care to place complete method body into lambda expression
    
    There are 3 ytpes of method references :

    1. Reference to static method
    2. Reference to instance method
    3. Reference to constructor
    4. Reference to arbitary type


    Lambda Expression                                      Method reference
    ------------------------------------------------------------------------------
    s->s.length()                                           String::length()
    s->s.toUpperCase()                                      String::toUpperCase
    (i1,i2)->i1.compareTo(i2)                               Integer::compareTo
    (s1,s2)->s1.compareTo(s2)                               String::compareTo

    
    Syntax:
    1. static method
            Lambda Expression :(args)->ClassName.staticMethod(args)
            Method Reference : ClassName::staticMethodName

    2. Instance Method
            Lambda Expression:(args)->ObjectName.instanceMethodName(args)
            Method Reference :ObjectName::instanceMethodName()
            
    3. Constructor
            Lambda Expression : (args)->new ClassName(args)
            Method Reference : ClassName::new        
 */
/*
 *  When to use Lambda Expression and Method reference
 * -----> when we have to use that method in only one place/class means having single implementation then 
 *        use Lambda Expression
 * -----> when we have to use method in more tha one place ,i.e. having multiple implementation of that method
 *        use Method reference
 * 
 * 
 *      ---------------------------------------------------------------------------------------
 *        Note : Method reference can be invoked by Functional Interface, here Functional interface and
 *              method definations signature (input arguments) should be same,else it will give compile
 *              error
 *      
 */

public class Notes {

}
