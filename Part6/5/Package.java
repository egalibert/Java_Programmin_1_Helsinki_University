import java.util.ArrayList;

public class Package {
	private ArrayList<Gift> giftbag;

	public Package() {
		this.giftbag = new ArrayList<>();
	}

	public void addGift(Gift gift) {
		this.giftbag.add(gift);
	}

	public int totalWeight() {
		int total_w = 0;
		for (Gift gift : this.giftbag) {
			total_w += gift.getWeight();
		}
		return (total_w);
	}
}
