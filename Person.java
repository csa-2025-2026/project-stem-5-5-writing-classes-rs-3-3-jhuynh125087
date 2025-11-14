public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int SSN;

    Person ( String in_firstName, String in_lastName, int in_age, int in_SSN)
    {
        firstName = in_firstName;
        lastName = in_lastName;
        age = in_age;
        SSN = in_SSN;
    }

    void personPrint ()
    {
        System.out.println ("\n SSN: " + SSN + "\n\t Name: " + firstName + " " + lastName + "\n\t Age: "  + age);
    }


}
