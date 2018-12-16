package homeWork6_exceptions;

import java.util.Scanner;
import java.lang.reflect.Constructor;
import java.util.InputMismatchException;


public class Kyxnya {
	private String name;
	private Salad salad;

	public Kyxnya(String name, Salad salad) {
		this.name = name;
		this.salad = salad;
	}

	public Kyxnya(String name) {
		this.name = name;
		salad = new Salad();
	}

	public Kyxnya() {
		name = "Jenya";
		salad = new Salad();
	}

	public Ingredients getIngredient(Scanner scanner) {
		String ingredientName;
		double weight;
		
		System.out.println("list ingredients:");
		ingredientName = scanner.next();
		
		System.out.println("Indicate weight:");
		
		try {
			weight = scanner.nextDouble();
		}
		catch (InputMismatchException e) {
			System.out.println("Once again");
			scanner.next();
			
			return null;
		}

		try {
			Class [] parameters = {double.class};
			ingredientName = " " + ingredientName;
			Class ingredientClass = Class.forName(ingredientName);
			Constructor constructor =
					ingredientClass.getDeclaredConstructor(parameters);
			Ingredients ingredients = (Ingredients) constructor.newInstance(
					new Object[]{new Double(weight)});
			
			return ingredients;
		}
		catch (Exception e) {
			System.out.println("Nothing");
			
			return null;
		}
	}

	public void functions() {
		Scanner scanner = new Scanner(System.in);
		int choice = -1;
		Ingredients ingredients = null;
		
		System.out.println("My name is " + name + ".");
		System.out.println("Are u hungry?");
		
		while (choice != 0) {
			System.out.println("\nChoose operation:\t");
			System.out.println("1. change name");
			System.out.println("2. receipt");
			System.out.println("3. list");
			System.out.println("4. new ingredient");
			System.out.println("5. Choose ingredients");
			System.out.println("0. Exit");
			
			try {
				choice = scanner.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Wrong option!");
				scanner.next();
				choice = -1;
			}
			
			switch(choice) {
			case 1:
				System.out.println("Name your salad:");
				salad.setname(scanner.next());
				break;

			case 2:
				salad.getCosist();
				break;

			case 3:
				ingredients = getIngredient(scanner);
				if (ingredients != null) {
					if (!salad.newVegetables(ingredients)) {
						System.out.println("Wrong operation");
					}
				}
				break;

			case 4:
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}
}