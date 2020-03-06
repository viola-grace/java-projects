
public class Passenger {
	private int id;
	private String firstName;
	private String lastname;
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public  String toString() {
		return "Passenger Information is First Name:" +this.firstName+" LastName "+this.lastname;
	}
	public int hashCode() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
