class hulum
{
int no1,no2,tot;
void initial(int x,int y)
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
class sum2
{
public static void main(String args[])
{
hulum x=new hulum();
x.initial(233,876);
x.print();
x.initial(77,532);
x.print();
}
}