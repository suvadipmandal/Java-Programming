class demo16
{
public static void main(String []bhoot)
{
int l=bhoot.length;
if(l>=2)
{
int no1=Integer.parseInt(bhoot[0]);
int no2=Integer.parseInt(bhoot[1]);
int tot=no1+no2;
System.out.println("\nSum of "+no1+" and "+no2+" is : "+tot);
}
else
System.out.println("\nToo few arguments at command line...");
}
}