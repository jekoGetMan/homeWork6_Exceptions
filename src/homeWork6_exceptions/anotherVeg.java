package homeWork6_exceptions;

abstract public class anotherVeg extends Ingredients {
	public anotherVeg(String name, double calories) {
		super(name, calories);
		setCategory("dopVeg");
	}

	public anotherVeg(String name, double calories, double weight) {
		super(name, calories, weight);
		setCategory("dopVeg");
	}
}