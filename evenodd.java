import java.util.* ;
public class evenodd
{
public static void main(String args[])
{
int n;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number= ");
n=scan.nextInt();

if(n%2==0)
{
System.out.println( "The Number is Even.");
}
else
{
System.out.println("The Number is Odd.");
}
}
}
