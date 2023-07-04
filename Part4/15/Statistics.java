
public class Statistics {
    private int count;
	private int sum;

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        // write code here
		this.sum += number;
		this.count++;
    }

    public int getCount() {
        // write code here
		return (this.count);
    }

	public int sum() {
        // write code here
		return (this.sum);
    }

    public double average() {
        // write code here
		if (this.count == 0) {
			return (0);
		}
		double count = this.count;
		return (this.sum / count);
    }
}

