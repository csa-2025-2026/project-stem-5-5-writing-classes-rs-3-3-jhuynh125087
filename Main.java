import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Person p1 = new Person ("Bessie", "Smith", 50, 62632413);
    p1.personPrint ();

    Oven myOven = new Oven(100, 30);

    if (myOven.isOn() == true)
    {
      System.out.println("It's on!");
    }
  }
}
