package project1.abstractclass;

public class Recipe1 extends AbstractRecipe{

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Getting raw materials ready");
		
	}

	@Override
	void doTheDishes() {
		// TODO Auto-generated method stub
		System.out.println("Dishes are being prepared");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("clean the dishes");
	}
	
}
