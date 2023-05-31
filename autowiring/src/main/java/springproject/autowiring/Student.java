package springproject.autowiring;

public class Student {
	private int usn;
	private String name;
	private Certificate certificate;
	public int getUsn() {
		return usn;
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
