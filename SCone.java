class TSOne
{
	int j;
	TSOne(int j)
	{
		this.j=j;
	}
}
class TSOneTwo implements Cloneable
{
	TSOne c;
	int i;
	TSOneTwo(TSOne c,int i)
	{
		this.c=c;
		this.i=i;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class SCone
{
	public static void main(String []args)throws CloneNotSupportedException
	{
		TSOne c= new TSOne(20);
		TSOneTwo d1= new TSOneTwo(c,10);
		System.out.println(d1.i +"......"+ d1.c.j);
		TSOneTwo d2=(TSOneTwo)d1.clone();
		d1.i=888;
		d1.c.j=999;
		System.out.println(d2.i +"...."+ d2.c.j);
	}
}