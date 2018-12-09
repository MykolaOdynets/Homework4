package Lits.HomeworkDB;

public class Employe {



	private int id;
	private String name;
	private String value;
	private int solary;
	
	public Employe (int id, String name, String value, int solary) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.solary = solary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
	
	public int getSolary() {
		return solary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", value=" + value
				+ "]";
	}
	
}


