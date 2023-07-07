import java.util.ArrayList;

public class TodoList {
	private ArrayList <String> tasks;

	public TodoList() {
		this.tasks = new ArrayList<>();
	}
	public void add(String task) {
		this.tasks.add(task);
	}

	public int size() {
		return this.tasks.size();
	}

	public void print() {
		for (int i = 1; i <= this.tasks.size(); i++) {
		 	System.out.println(i + ": " + this.tasks.get(i - 1));
		}
	}

	public void remove(int number) {
		tasks.remove(this.tasks.get(number - 1));
	}
}
