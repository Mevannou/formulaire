package test;

public class User {
	private String firstname;
	private String lastname;
	private int age;
	private String mail;
	private int postalcode;
	private String city;
	private String men;
	private String women;

	public User(String firstname1, String lastname1, int age1, String mail1, int postalcode1, String city1, String men1,
			String women1) {
		this.firstname = firstname1;
		this.lastname = lastname1;
		this.age = age1;
		this.mail = mail1;
		this.postalcode = postalcode1;
		this.city = city1;
		this.men = men1;
		this.women = women1;

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMen() {
		return men;
	}

	public void setMen(String men) {
		this.men = men;
	}

	public String getWomen() {
		return women;
	}

	public void setWomen(String women) {
		this.women = women;
	}

}
