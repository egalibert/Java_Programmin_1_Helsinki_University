public class Container {
	private int amount;

	public Container() {
		this.amount = 0;
	}

	public int contains() {
		return this.amount;
	}

	public void add(int amount) {
		if (amount > 0) {
			this.amount = this.amount + amount > 100 ? 100 : this.amount + amount;
		}
	}

	public void remove(int amount) {
		this.amount = this.amount - amount < 0 ? 0 : this.amount - amount;
	}

	public void move(int amount, Container container) {
		if (amount > 0) {
			if (amount >= container.contains()) {
				this.add(container.contains());
				// this.amount = this.amount + container.contains() > 100 ? 100 : this.amount + container.contains();
				container.remove(container.contains());
			} else {
				this.add(amount);
				container.remove(amount);
			}
		}
	}

	public String toString() {
		return this.amount + "/100";
	}
}