/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface3;

interface Marathon11{
    void run();
}

interface Jogging11{
    public void walk();
    
}

public class Interface3 implements Marathon11, Jogging11  {
    public void run(){System.out.println("Hello");}  
public void walk(){System.out.println("Welcome");}

    
    public static void main(String[] args) {
        Interface3 r = new Interface3();
    r.run();
    r.walk();
    }
    
}
