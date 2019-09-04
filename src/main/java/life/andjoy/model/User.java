package life.andjoy.model;

public class User {

	public String id;
	public String name;
	public Integer age;

	public boolean isAdult() {
		return age >= 18;
	}

}
