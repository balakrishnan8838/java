import java.util.Scanner;
class ScannerEx{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter your name");
String name = scan.nextLine();
System.out.println("enter your age");
int age = scan.nextInt();
System.out.println("enter your phone number");
long phone = scan.nextLong();
System.out.println("your name is:"+ name);
System.out.println("your age is:"+ age);
System.out.println("your  phone number is:"+ phone);
}
}