import java.util.Scanner;

class continent
{
    String country,continent,state,place;
    Scanner sc=new Scanner(System.in);
    void acceptcontinent()
    {
        System.out.println("Enter Contient Name = ");
        continent=sc.next();
    }
}
class country extends continent
{
    void acceptcountry()
    {
        System.out.println("Enter Country Name = ");
        country=sc.next();
    }
}
class state extends country
{
    void acceptstate()
    {
        System.out.println("Enter State Name = ");
        state=sc.next();
        System.out.println("Enter Place Name = ");
        place=sc.next();
    }
    void disp()
    {
        System.out.println("Continent\t Country \t State \t Place \n\n");
        System.out.println(continent+"\t\t"+country+"\t\t"+state+"\t\t"+place);
    }
}
public class Country
{
    public static void main(String[] args)
    {
        state ob=new state();
        ob.acceptcontinent();
        ob.acceptcountry();
        ob.acceptstate();
        ob.disp();
    }
}


