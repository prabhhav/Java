package thousand;
class Overriding2 {
public void getcolor()
{
    System.out.println("Pink");
}
}
class sportscar1 extends Overriding2 {

    public void getcolor()         
{
     super.getcolor();
    System.out.println("Red");
}
}
public class Overriding1
{ public static void main(String args[]){
        sportscar1 d = new sportscar1();
        d.getcolor();
      
    
}    
}
