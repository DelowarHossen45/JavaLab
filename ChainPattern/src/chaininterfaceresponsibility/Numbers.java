package chaininterfaceresponsibility;

public class Numbers 
{
	public double num1,num2;
	public String calculationWanted;
	public Numbers(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public double getNumber1()
	{
		return num1;
	}
	public double getNumber2()
	{
		return num2;
	}
	public String getCalculationWanted()
	{
		return calculationWanted;
	}

}
