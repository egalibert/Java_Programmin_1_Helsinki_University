import java.util.ArrayList;

public class BirdDatabase {
	
	private ArrayList<Bird> birds;

	public BirdDatabase() {
		this.birds = new ArrayList<>();
	}

	public void addBird(Bird bird) {
		this.birds.add(bird);
	}

	public void printAllBirds() {
		for (Bird bird : this.birds) {
			System.out.println(bird);
		}
	}

	public void checkDatabase(String name) {
		for (Bird bird : this.birds) {
			if (name.equals(bird.getName())) {
				bird.addObservation();
				return;
			}
		}
		System.out.println("Not a bird!");
	}

	public void printOne(String name) {
		for (Bird bird : this.birds) {
			if (name.equals(bird.getName())) {
				System.out.println(bird);
				return;
			}
		}
	}

}