import java.util.Scanner;
public class Name{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name = input.nextLine();

        System.out.println("Please Enter Your Age");
        int age = input.nextInt();

        System.out.println("Please Enter Your City");
        String city = input.next();

        System.out.println("Please Enter Your College Name");
        String college = input.next();

        System.out.println("Please Enter Your Profession");
        String profession = input.next();

        System.out.println("Please Enter Your Animal Type");
        String type = input.next();

        System.out.println("Please Enter Animal Name");
        String Aname = input.next();

        System.out.print("There once was a person named  " + name + "who lived in  " + city + ". At the age  " + age + "," + name + "  went to college at  " + college + "." + 
        name + " graduated and went to work as a  " + profession + ". Then, " + name + " adopted a (n) " + type + " named " + Aname + " . They both lived happily ever after!");
             
    }
}