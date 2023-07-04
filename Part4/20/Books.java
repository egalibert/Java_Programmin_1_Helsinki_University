public class Books {
	private String name;
	private String pages;
	private String pubYear;
	
	public Books(String name, String pages, String pubYear) {
		this.name = name;
		this.pages = pages;
		this.pubYear = pubYear;
	}

	public String getName() {
		return (this.name);
	}

	public String getPages() {
		return this.pages;
	}

	public String getYear() {
		return this.pubYear;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.pages + " pages, " + this.pubYear;
	}
}
