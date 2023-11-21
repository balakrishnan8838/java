import java.util.Scanner;
class swap{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter your first number");
int num1 = scan.nextInt();
System.out.println("enter your second number");
int num2 = scan.nextInt();
int result;
result = num1;
num1 = num2;
num2 = result;
System.out.println("your first number result is:"+ num1);
System.out.println("your second number result is:"+ num2);
}
}
