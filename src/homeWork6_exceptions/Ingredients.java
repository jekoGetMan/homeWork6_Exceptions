package homeWork6_exceptions;

abstract public class Ingredients {
	private double weight;
	private String kind;
	private String name;
	private double cal;

	public Ingredients(String name) {
		this.name = name;
	}

	public String toString() {
		return (weight + " gramms of " + name + " (" + kind + "), "
				+ getTotalCalories() + "cal");
	}

	public Ingredients(String name, double calories) {
		if (calories < 0) {
			throw new IllegalArgumentException("not correct"
					+ calories + "c");
		}
		this.name = name;
		this.cal = calories;
		this.weight = 100;
	}

	public Ingredients(String name, double calories, double weight) {
		if (calories < 0) {
			throw new IllegalArgumentException("not correct "
					+ calories + "c");
		}

		if (weight < Double.MIN_NORMAL) {
			throw new IllegalArgumentException("Cannot create " + weight
					+ "g of " + name);
		}

		this.name = name;
		this.cal = calories;
		this.weight = weight;
	}



	public double getWeight() {
		return weight;
	}
	public void setCategory(String category) {
		this.kind = category;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return kind;
	}
	public double getCalories() {
		return cal;
	}
	public double getTotalCalories() {
		return cal * weight / 100.0;
	}
	public void setCalories(double calories) {
		this.cal = calories;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setName(String name) {
		this.name = name;
	}
}