import java.util.ArrayList;

public class Suitcase {
	private ArrayList <Item> items;
	private int maxWeight;
	private int totalWeight;

	public Suitcase(int weight) {
		this.items = new ArrayList<>();
		this.maxWeight = weight;
		this.totalWeight = 0;
	}

	public void addItem(Item item) {
		if (item.getWeight() + this.totalWeight <= this.maxWeight) {
			this.items.add(item);
			this.totalWeight += item.getWeight();
		}
	}

	public String toString() {
		if (this.items.isEmpty()){
			return "no items (0 kg)";
		}
		if (this.items.size() == 1) {
			return this.items.size() + " item (" + this.totalWeight + " kg)";
		}
		return this.items.size() + " items (" + this.totalWeight + " kg)";
	}

	public void printItems() {
		for (Item item : items) {
			System.out.println(item);
		}
	}

	public int totalWeight() {
		return this.totalWeight;
	}

	public Item heaviestItem() {
		int heaviest = 0;
		Item returnItem = null;
		if (this.items.isEmpty()) {
			return null;
		} else {
			for (Item item : items) {
				if (item.getWeight() > heaviest) {
					returnItem = item;
					heaviest = item.getWeight();
				}
			}
		}
		return returnItem;
	}
}
