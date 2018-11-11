package chaininterfaceresponsibility;

public class AddNumbers implements Chain 
{
	private Chain NextInChain;
	@Override
	public void setNextChain(Chain nextChain) 
	{
		this.NextInChain=nextChain;
	}

	public void calculate(Numbers requests) 
	{
		if(requests.getCalculationWanted()=="add")
		{
			System.out.println(requests.getNumber1() +"+" +requests.getNumber2()+
					"=="(requests.getNumber1()+ "+" +requests.getNumber2()));
		}
	}

}
