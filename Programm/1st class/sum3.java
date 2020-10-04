class hulum
{
int no1,no2,tot;
hulum()
{
no1=876;
no2=9008;
}
void print()
{
tot=no1+no2;
System.out.println("\n\n\tSum of "+no1+" and "+no2+" is : "+tot);
}
}
class sum3
{
public static void main(String args[])
{
hulum x=new hulum();
x.print();
}
}