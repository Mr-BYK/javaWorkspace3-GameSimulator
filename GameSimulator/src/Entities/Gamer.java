package Entities;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String nationalityId;
	private String getDateOfBirth;
	
	public Gamer( ) {
		
	}
	
	public Gamer(int id, String firstName, String lastName, String email, String password, String nationalityId,
			String getDateOfBirth) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.nationalityId = nationalityId;
		this.getDateOfBirth = getDateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getGetDateOfBirth() {
		return getDateOfBirth;
	}

	public void setGetDateOfBirth(String  getDateOfBirth) {
		this.getDateOfBirth = getDateOfBirth;
	}

	}
