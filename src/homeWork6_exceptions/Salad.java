package homeWork6_exceptions;

import java.util.List;
import java.util.ArrayList;

public class Salad {
	private String name;
	private List<Ingredients> ingredients = new ArrayList<Ingredients>();

	public boolean newVegetables (Ingredients ingredients) {
		return this.ingredients.add(ingredients);
	}

	public void setname(String name) {
		this.name = name;
	}

	public Salad() {
		name = "undefined";
	}

	public Salad(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<?> getIngredients() {
		return ingredients;
	}

	public void getCosist() {
		if (ingredients.isEmpty()) {
			System.out.println("No ingredients");

			return;
		}

		System.out.println("The salad " + name + " consist:\t");
		for (Ingredients ingredients : this.ingredients) {
			System.out.println(ingredients.toString());
		}
	}
}

