
package thousand;
class abc2
    {
        int a = 5;
        int b = 6; 
        public void apple(){
        System.out.println("Value of a " +a);
    }
    }
    
    
    class xyz2 extends abc2
    { 
        int a = 5;
        int b = 6; 
        public void banana(){
        System.out.println("Value of b " +b);
    }
    }
      
    class mno2 extends abc2
    { 
        int a = 5;
        int b = 6; 
        int c = 7;
        public void grapes(){
        System.out.println("Value of c " +c);
    }
    }


public class Hierarchial {
    public static void main(String args[]){
        mno2 d = new mno2();
        d.apple();
        d.grapes();
        xyz2 e = new xyz2();
        e.apple();
        e.banana();
                     
    }
}
