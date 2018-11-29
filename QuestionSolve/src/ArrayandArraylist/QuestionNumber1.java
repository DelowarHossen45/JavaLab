package ArrayandArraylist;

public class QuestionNumber1
{
	public static void main(String arg[])
	{
		//int a[]=new int[10];
		//a number complete
		int a[]= {1,2,3,4,5,4,3,2,1,0};
		int i;
		for(i=1;i<10;i++)
		{
			a[i]=a[i-1];
		}
		for(i=1;i<10;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		int b[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=9;i>0;i--)
		{
			b[i]=b[i-1];
		}
		for(i=1;i<10;i++)
		{
			System.out.print(b[i]+ " ");
		}
	}

}
