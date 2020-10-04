import java.io.DataInputStream;
class prg2
{
public static void main(String args[])
{
DataInputStream in=new DataInputStream(System.in);
int no1=0;
int no2=0;
try
{
System.out.print("\nEnter 1st number :");
no1=Integer.parseInt(in.readLine());
System.out.print("\nEnter 2nd number :");
no2=Integer.parseInt(in.readLine());
int tot=no1+no2;
System.out.println("\nSum="+tot);
}
catch(Exception e)
{
System.out.println(e.toString());
}
}
}