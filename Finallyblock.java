/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Finallyblock{
    
public static void main(String[] args){
   try{
       int divideByZero = 5/0;
   }
   catch(ArithmeticException e){
       System.out.println("ArithmeticException =>" +e.getMessage());
       
   }
   finally{
       System.out.println("this is the finally block");
   }
}
}