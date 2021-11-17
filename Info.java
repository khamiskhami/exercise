import java.util.*;
  public class Info{
      public static void main(String []args){
          Scanner scanner = new Scanner (System.in);
          System.out.println ( "What's your first_name ?" );
          String firstName = scanner.nextLine();
          System.out.println ( "What's your last_name ?" );
          String lastNam = scanner.nextLine();
          System.out.println ( "What's your age" );
          int ag = scanner.nextInt();
           System.out.println("Welcome " + firstName  + " " + lastNam + " " + " You are  "  + ag +  " years old! "  );

      }
  }