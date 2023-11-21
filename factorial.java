import java.util.Scanner;
class factorial{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter any number:");
int fact = scan.nextInt();
int num = 1;
for(int i=1;i<=fact;i++)
{
 num = num*i;
}
System.out.println("your factorial number is:"+ num);
}
}