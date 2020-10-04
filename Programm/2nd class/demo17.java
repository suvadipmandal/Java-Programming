class demo17
{
public static void main(String []bhoot)
{
int no1=0,no2=0;
int l=bhoot.length;
if(l>=2)
{
 try
  {
  no1=Integer.parseInt(bhoot[0]);
  }
 catch(Exception e)
  {
  no1=100;
  } 
  try
    {
    no2=Integer.parseInt(bhoot[1]);
    }
  catch(Exception e)
    {
    no2=200;
    }
int tot=no1+no2;
System.out.println("\nSum of "+no1+" and "+no2+" is : "+tot);
}
else
System.out.println("\nToo few arguments at command line...");
}
}