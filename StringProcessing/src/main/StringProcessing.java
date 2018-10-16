package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
//import java.lang.instrument.*;


public class StringProcessing {

	
	
	public static void main(String agr[])
	{
		String name[]=new String[15];
		String str;
		int i = 0,count=0;
		try {
			FileReader read=new FileReader("input.txt");
			Scanner file=new Scanner(read);
			PrintWriter write=new PrintWriter("write.txt");
			//for(i=0;i<8;i++)
			while(file.hasNext())
			{
				//str=file.next();
				name[i]=file.next();
				count++;
				i++;
			}
			for(i=0;i<count;i++)
			{
				for(int j=0;j<count;j++)
				{
					if(name[j].compareTo(name[i])>0)
					{
						str=name[i];
						name[i]=name[j];
						name[j]=str;
					}
				}
			}
			//write.out.print("hellon");
			for(i=0;i<count;i++)
			{
				write.print(name[i]);
				System.out.println("heloo");

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
