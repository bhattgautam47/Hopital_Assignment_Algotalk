package Hospital_Starter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	private String regno;
	private String name;
	private int age;
	private String room;
	private String doctorname;
	private String admitdate;
	private float expenses;
	private String status;
	public Patient() {
		
	}
	public Patient(String name, int age, String room, String doctorname, String admitdate, float expenses,
			String status) {
		super();
		this.name = name;
		this.age = age;
		this.room = room;
		this.doctorname = doctorname;
		this.admitdate = admitdate;
		this.expenses = expenses;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getAdmitdate() {
		return admitdate;
	}
	public void setAdmitdate(String admitdate) {
		this.admitdate = admitdate;
	}
	public float getExpenses() {
		return expenses;
	}
	public void setExpenses(float expenses) {
		this.expenses = expenses;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	

}
