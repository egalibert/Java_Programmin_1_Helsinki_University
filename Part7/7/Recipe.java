import java.util.ArrayList;

public class Recipe {
	private String name;
	private int time;
	private ArrayList<String> ingredients;

	public Recipe(String name, int time, ArrayList<String> list) {
		this.name = name;
		this.time = time;
		this.ingredients = list;
	}

	public String getName() {
		return this.name;
	}

	public int getCookTime() {
		return this.time;
	}

	public boolean hasIngredient(String ingredient) {
		if (this.ingredients.contains(ingredient)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return this.name + ", cooking time: " + this.time;
	}
}