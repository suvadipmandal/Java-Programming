class hulum
{
int no1,no2,tot;
hulum(int x,int y)
{
no1=x;
no2=y;
}
void print()
{
tot=no1+no2;
System.out.println("\n\n\tSum of "+no1+" and "+no2+" is : "+tot);
}
}
class sum4
{
public static void main(String args[])
{
hulum x=new hulum(543,678);
x.print();
}
}