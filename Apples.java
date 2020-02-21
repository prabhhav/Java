/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apples;
import java.io.File;
/**
 *
 * @author lenovo
 */
public class Apples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File x = new File("C:\\Users\\prabhhav.txt");
        if(x.exists())
            System.out.println("x.getName() + exist!");
        else
            System.out.println("this thing does not exist");
        
    }
    
}
