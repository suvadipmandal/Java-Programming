class demo14
{
public static void main(String []bhoot)
{
int l=bhoot.length;
if(l>0)
{
for(int i=0;i<l;++i)
System.out.println("Argument No. : "+(i+1)+"\tPassing Argument : "+bhoot[i]);
}
else
System.out.println("\nToo few arguments at command line...");
}
}