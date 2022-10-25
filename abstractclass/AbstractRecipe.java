package project1.abstractclass;

public abstract class AbstractRecipe {

	//this abstract helps us to define the basic algorithms
	
	public void execute() {
		getReady();
		doTheDishes();
		cleanup();
	}
	
	abstract void getReady();
	abstract void doTheDishes();
	abstract void cleanup();

}
