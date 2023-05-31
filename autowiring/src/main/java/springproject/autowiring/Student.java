package springproject.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int usn;
	private String name;
//	@Autowired
	private Certificate certificate;
	public int getUsn() {
		return usn;
	}
	@Autowired
	public Student(int usn, String name, Certificate certificate) {
		System.out.println("Injecting using constructor");
		this.usn = usn;
		this.name = name;
		this.certificate = certificate;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", certificate=" + certificate + "]";
	}
}
