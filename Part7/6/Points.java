public class Points {
	private int points;
	private int grade;

	public Points (int points) {
		this.points = points;
		this.grade = this.calculateGrade();
	}

	public int getPoints() {
		return this.points;
	}

	public int getGrade() {
		return this.grade;
	}

	public boolean hasPassed() {
		if (this.points >= 50) {
			return true;
		}
		return false;
	}

	public int calculateGrade() {
		if (this.points < 50) {
			return 0;
		} else if (this.points < 60) {
			return 1;
		} else if (this.points < 70) {
			return 2;
		} else if (this.points < 80) {
			return 3;
		} else if (this.points < 90) {
			return 4;
		} else {
			return 5;
		}
	}
}