import java.util.Scanner;
public class Lcm{
    public static void main(String[]args){
        int aq;
        int ba;
        int xz;
        int yw;
        int th;
        int gcd;
        int lcm;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Twe Integers\n");
        xz = input.nextInt();
        yw = input.nextInt();

        aq = xz;
        ba = yw;

        while (ba != 0){
            th = ba;
            ba = aq % ba;
            aq = th;

        }
            gcd = aq;
            lcm = (xz*yw) / gcd;
            System.out.println("HCM" +xz+ "and" +yw+ "=" +gcd);
            System.out.println("LCM" +xz+ "and" +yw+ "=" +lcm);
    }
}