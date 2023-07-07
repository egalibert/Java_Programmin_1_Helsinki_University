import java.util.ArrayList;

public class Room {
	private ArrayList <Person> people;

	public Room() {
		this.people = new ArrayList<>();
	}
	
	public void add(Person person) {
		this.people.add(person);
	}

	public boolean isEmpty() {
		if (this.people.isEmpty()) {
			return true;
		}
		return false;
	}

	public ArrayList<Person> getPersons() {
		return this.people;
	}

	public Person shortest() {
		Person retString = null;
		int shortest = 250;
		if (this.people.isEmpty()) {
			return null;
		} else {
			for (Person person : this.people) {
				if (person.getHeight() < shortest) {
					shortest = person.getHeight();
					retString = person;
				}
			}
		}
		return retString;
	}

	public Person take() {
		Person retString = null;
		int shortest = 250;
		if (this.people.isEmpty()) {
			return null;
		} else {
			for (Person person : this.people) {
				if (person.getHeight() < shortest) {
					shortest = person.getHeight();
					retString = person;
				}
			}
		}
		this.people.remove(retString);
		return retString;
	}
}

