package homeWork6_exceptions;

public class seasoning extends Ingredients {

	public seasoning(String name, double calories) {
		super(name, calories);
		setCategory("seasoningVeg");
	}

	public seasoning(String name, double calories, double weight) {
		super(name, calories, weight);
		setCategory("seasoningVeg");
	}
}