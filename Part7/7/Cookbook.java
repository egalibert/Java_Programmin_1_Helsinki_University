import java.util.ArrayList;

public class Cookbook {
	private ArrayList<Recipe> recipes;

	public Cookbook() {
		this.recipes = new ArrayList<>();
	}

	public void addRecipe(Recipe recipe) {
		this.recipes.add(recipe);
	}

	public void listAllRecipes() {
		System.out.println("\nRecipes:");
		for (Recipe recipe : this.recipes) {
			System.out.println(recipe);
		}
	}

	public void findByName(String name) {
		System.out.println("\nRecipes:");
		for (Recipe recipe : this.recipes) {
			if (recipe.getName().contains(name)) {
				System.out.println(recipe);
			}
		}
	}

	public void findByTime(int maxTime) {
		System.out.println("\nRecipes:");
		for (Recipe recipe : this.recipes) {
			if (recipe.getCookTime() <= maxTime) {
				System.out.println(recipe);
			}
		}
	}

	public void findByIngredient(String ingredient) {
		System.out.println("\nRecipes:");
		for (Recipe recipe : this.recipes) {
			if (recipe.hasIngredient(ingredient)) {
				System.out.println(recipe);
			}
		}
	}
}
