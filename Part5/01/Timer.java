
public class Timer {
	private ClockHand hundredSeconds;
	private ClockHand second;

	public Timer() {
		this.hundredSeconds = new ClockHand(100);
		this.second = new ClockHand(60);
	}

	public void advance() {
		this.hundredSeconds.advance();
		if (this.hundredSeconds.value() == 0) {
			this.second.advance();
		}
	}

	public String toString() {
		return this.second + ":" + this.hundredSeconds;
	}
}
