public class Cube {
	private int edgelength;

	public Cube(int edgeLength) {
		this.edgelength = edgeLength;
	}

	public int volume() {
		int volume;

		volume = this.edgelength * this.edgelength * this.edgelength;
		return (volume);
	}
	public String toString() {
		return ("The length of the edge is" + this.edgelength + "and the volume " + volume());
	}
}
