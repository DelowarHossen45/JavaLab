package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculationJunit {

	@Test
	void test() {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MultiplyNumbers();
		Chain chainCalc4 = new DivideNumbers();
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		assertEquals(6.0,chainCalc1.calculate(new Numbers(4,2,"add")),"");
		//assertEquals(2.0,chainCalc1.calculate(new Numbers(4,2,"sub")),"");
		assertEquals(8.0,chainCalc1.calculate(new Numbers(4,2,"mul")),"");
		//assertEquals(2.0,chainCalc1.calculate(new Numbers(4,2,"divide")),"");



		
	}

}
