import java.util.ArrayList;

public class Hold {
	private ArrayList<Suitcase> suitcases;
	private int maxWeight;
	private int totalWeight;

	public Hold(int maxWeight) {
		this.suitcases = new ArrayList<>();
		this.maxWeight = maxWeight;
		this.totalWeight = 0;
	}

	public void addSuitcase(Suitcase suitcase) {
		if (suitcase.totalWeight() + this.totalWeight <= this.maxWeight) {
			this.suitcases.add(suitcase);
			this.totalWeight += suitcase.totalWeight();
		}
	}

	public String toString() {
		return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
	}

	public void printItems() {
		for (Suitcase suitcase : this.suitcases) {
			suitcase.printItems();
		}
	}
}

