/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.math.BigInteger;

/**
 *
 * @author BenjaminFamily
 */
public class MementoTester {

    public static BigInteger fibo(int n, Caretaker caretaker, Originator originator)
    {
        BigInteger fib_one;//BigInteger.ZERO;
        BigInteger fib_two;//BigInteger.ZERO;
        
  
        
        if(n==0||n==1)
        {
            originator.setState(BigInteger.ONE);
            caretaker.add(originator.saveStateToMemento());
            originator.getStateFromMemento(caretaker.get(n));
            fib_one=originator.getState();
            
            return fib_one;
            
        }
        else
        { 
            
            originator.getStateFromMemento(caretaker.get(n-2));
            fib_one=originator.getState();
            
            
            originator.getStateFromMemento(caretaker.get(n-1));
            fib_two=originator.getState();
            
            
            
           fib_two=fib_two.add(fib_one);
            originator.setState(fib_two);
            caretaker.add(originator.saveStateToMemento());
            
            return fib_two;
        }
            
    }
    
    
    public static void main(String[] args) {
        long start, end;
        double dur;
        BigInteger f;
        Caretaker caretaker=new Caretaker();
        Originator originator=new Originator();
        start =System.nanoTime();
        for(int i=0; i<1001;i++)
        {
            
            
            f=fibo(i, caretaker, originator);
            
            
            
            
            
            System.out.println("Fibo("+i+"): "+f);
            
        }
        end=System.nanoTime();
        dur=(end-start)/1000.0;
        System.out.println("The time to compute this is "+dur+" nanoseconds");

        
    }
    
}
