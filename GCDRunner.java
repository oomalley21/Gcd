import java.util.Scanner;
public class GCDRunner{
 public static void main(String[] args){
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Find gcd(a,b). Enter a, then enter b");
     int a = keyboard.nextInt();
     int b = keyboard.nextInt();

     
     System.out.println("gcd("+a+","+b+") = "+ GCD.gcd(a,b));
    }
}
