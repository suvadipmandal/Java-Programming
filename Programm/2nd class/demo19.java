import java.io.DataInputStream;
class demo19
{
public static void main(String []bhoot)
{
DataInputStream in=new DataInputStream(System.in);
int no1=0,no2=0;
try
 {
 System.out.print("\nEnter 1st Number :");
 no1=Integer.parseInt(in.readLine());
 }
catch(Exception e)
 {
 no1=100;
 }
try
 {
 System.out.print("\nEnter 2nd Number :");
 no2=Integer.parseInt(in.readLine());
 }
catch(Exception e)
 {
 no2=200;
 }
 int tot=no1+no2;
 System.out.println("\n\tSum="+tot);
}
}