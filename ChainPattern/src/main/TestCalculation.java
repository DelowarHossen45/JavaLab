package main;

public class TestCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		Numbers request = new Numbers(4,2,"sub");
		chainCalc1.calculate(request);

	}

}