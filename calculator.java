import java.util.Scanner;
class calculator{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter first number");
int num1 = scan.nextInt();
System.out.println("enter your secind number");
int num2 = scan.nextInt();
int add = num1 + num2;
int sub = num1 - num2;
int multi = num1 * num2;
int division = num1 / num2;
int module = num1 % num2;
System.out.println("your answer is:"+ add);
System.out.println("your answer is:"+ sub);
System.out.println("your answer is:"+ multi);
System.out.println("your answer is:"+ division);
System.out.println("your answer is:"+ module);
}
}