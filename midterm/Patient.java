public class Patient extends Person {

	private String id;


	public addPatient (String name, String number, String id) {
		this.name = name;
		this.number = number;
		this.id = id;
	}

	public String lookUp () {
		return this.id;
	}

	public void removePatient (String id) {
		this.Person.remove(id);
	}



}