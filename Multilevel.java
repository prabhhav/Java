
package thousand;
  class abc1
    {
        int a = 5;
        int b = 6; 
        public void apple(){
        System.out.println("Value of a " +a);
    }
    }
    
    
    class xyz1 extends abc1
    { 
        int a = 5;
        int b = 6; 
        public void banana(){
        System.out.println("Value of b " +b);
    }
    }
      
    class mno extends xyz1
    { 
        int a = 5;
        int b = 6; 
        int c = 7;
        public void grapes(){
        System.out.println("Value of c " +c);
    }
    }

public class Multilevel {
    public static void main(String args[]){
        mno d = new mno();
        d.grapes();
        d.apple();
        d.banana();
    
}
}