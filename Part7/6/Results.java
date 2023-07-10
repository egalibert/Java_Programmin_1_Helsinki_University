import java.util.ArrayList;

public class Results {
	private ArrayList<Points> gradeList;
	private int passed;

	public Results () {
		this.gradeList = new ArrayList<>();
		this.passed = 0;
	}

	public void addPoints(Points points) {
		this.gradeList.add(points);
		if (points.hasPassed()) {
			this.passed++;
		}
	}

	public double getSum() {
		int sum = 0;
		for (Points points : this.gradeList) {
			sum += points.getPoints();
		}
		return sum * 1.0;
	}

	public double printAverage() {
		return this.getSum() / this.gradeList.size();
	}

	public double getPassingSum() {
		int sum = 0;
		for (Points points : this.gradeList) {
			if (points.hasPassed()) {
				sum += points.getPoints();
			}
		}
		return sum * 1.0;
	}

	public double printPassing() {
		return getPassingSum() / this.passed * 1.0;
	}

	public double printPercentage() {
		return (100 * (this.passed * 1.0)) / (this.gradeList.size() * 1.0);
	}

	public String getStars(int grade) {
		String stars = "";
		for (Points points : this.gradeList) {
			if (points.getGrade() == grade) {
				stars += "*";
			}
		}
		return stars;
	}

	public void printResults() {
		System.out.println("Point average (all): " + this.printAverage());
		if (this.getPassingSum() == 0.0) {
			System.out.println("Point average (passing): -");
		} else {
			System.out.println("Point average (passing): " + this.printPassing());
		}
		System.out.println("Pass percentage: " + this.printPercentage());
		System.out.println("Grade distribution:");
		for (int i = 5; i >= 0; i--) {
			System.out.println(i + ": " + this.getStars(i));
		}
	}
}
