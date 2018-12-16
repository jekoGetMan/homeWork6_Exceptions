package homeWork6_exceptions;

public class extraVeg extends Ingredients {

	public extraVeg(String name, double calories) {
		super(name, calories);
		setCategory("extraVeg");
	}

	public extraVeg(String name, double calories, double weight) {
		super(name, calories, weight);
		setCategory("extraVeg");
	}
}
