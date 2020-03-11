package thousand;

class simple {
    
public void getcolor()
{
    System.out.println("Color is");
}
public void getgear()
{
    System.out.println("Gear is");
}
public void getengine()
{
    System.out.println("Engine  is");
}
}
class sportscar extends simple
{
    public void getcolor()
{
    System.out.println("Color is red");
}
    public void getgear()
{
    System.out.println("Gear is of audi");
}
    public void getengine()
{
    System.out.println("Engine  is of bmw");
}
}

public class Overriding 
{ public static void main(String args[]){
        sportscar d = new sportscar();
        d.getcolor();
        d.getgear();
        d.getengine();
    
}    
}
