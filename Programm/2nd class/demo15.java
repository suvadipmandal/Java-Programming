class demo15
{
public static void main(String []bhoot)
{
int l=bhoot.length;
if(l>0)
{
System.out.println("\nNumber of passing arguments : "+l);
for(int i=0;i<l;++i)
System.out.println("Argument No. : "+(i+1)+"\tPassing Argument : "+bhoot[i]);
}
else
System.out.println("\nToo few arguments at command line...");
}
}