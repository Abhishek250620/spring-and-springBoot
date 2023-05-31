package springproject.autowiring;

public class Certificate {
	private String cName;

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Certificate [cName=" + cName + "]";
	}
}
