package homeWork6_exceptions;

public class Greckiy extends Salad{
	
	public Greckiy() {
		setname("Greckiy");
		newVegetables(new Ogyrec());
		newVegetables(new Potato(120));
		newVegetables(new Cabbage(75));


	}
	
	
}
