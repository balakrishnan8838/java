import java.util.Scanner;
class prime{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter your number");
int end =scan.nextInt();
int count = 0;
for(int i=1;i<=end;i++){
if(end%i==0)
{
   count++;
}
}
if(count==2)
{
System.out.println("prime number");
}
else
{
System.out.println("not prime number");
}
}
}

