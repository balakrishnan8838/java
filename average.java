import java.util.Scanner;
class average{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter five numbers");
int num1 = scan.nextInt();
int num2 = scan.nextInt();
int num3 = scan.nextInt();
int num4 = scan.nextInt();
int num5 = scan.nextInt();
int total =(num1 + num2 + num3 + num4 + num5)/5;
System.out.println("your answer is:"+ total);
}
}