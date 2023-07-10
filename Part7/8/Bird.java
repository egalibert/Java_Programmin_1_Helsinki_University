public class Bird {

	private String name;
	private String latin;
	private int spotted;

	public Bird(String name, String latin) {
		this.name = name;
		this.latin = latin;
		this.spotted = 0;
	}

	public String getName() {
		return this.name;
	}

	public String getLatinName() {
		return this.latin;
	}

	public int getObservations() {
		return this.spotted;
	}

	public void addObservation() {
		this.spotted++;
	}

	public String toString() {
		if (this.getObservations() == 1) {
			return this.name + " (" + this.latin + "): " + this.spotted + " observation";
		}
		return this.name + " (" + this.latin + "): " + this.spotted + " observations";
	}
}