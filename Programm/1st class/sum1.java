class hulum
{
int no1,no2,tot;
void initial()
{
no1=420;
no2=210;
}
void print()
{
tot=no1+no2;
System.out.println("\n\n\tSum of "+no1+" and "+no2+" is : "+tot);
}
}
class sum1
{
public static void main(String args[])
{
hulum x=new hulum();
x.initial();
x.print();
}
}