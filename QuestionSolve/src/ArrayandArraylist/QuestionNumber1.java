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
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		int b[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=9;i>0;i--)
		{
			b[i]=b[i-1];
		}
		for(i=0;i<10;i++)
		{
			System.out.print(b[i]+ " ");
		}
		System.out.println();
		int c[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=0;i<9;i++)
		{
			c[i]=c[i+1];
		}
		for(i=0;i<10;i++)
		{
			System.out.print(c[i]+ " ");
		}
		System.out.println();
		int d[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=8;i>=0;i--)
		{
			d[i]=d[i+1];
		}
		for(i=0;i<10;i++)
		{
			System.out.print(d[i]+ " ");
		}
		System.out.println();
		int e[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=1;i<10;i++)
		{
			e[i]=e[i]+e[i-1];
		}
		for(i=0;i<10;i++)
		{
			System.out.print(e[i]+ " ");
		}
		System.out.println();
		int f[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=0;i<10;i=i+2)
		{
			f[i]=0;
		}
		for(i=0;i<10;i++)
		{
			System.out.print(f[i]+ " ");
		}
		System.out.println();
		int g[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=0;i<5;i++)
		{
			g[i+5]=g[i];
		}
		for(i=0;i<10;i++)
		{
			System.out.print(g[i]+ " ");
		}
		System.out.println();
		int h[]= {1,2,3,4,5,4,3,2,1,0};
		for(i=1;i<5;i++)
		{
			h[i]=h[9-i];
		}
		for(i=0;i<10;i++)
		{
			System.out.print(h[i]+ " ");
		}
	}

}
