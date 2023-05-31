package springproject.StandAloneCollection;

import java.util.*;

public class Employee {

	private List<String> vehicle;
	private Set<String> email;
	private Map<String,String> name;
	private Properties property;
	public List<String> getVehicle() {
		return vehicle;
	}
	public void setVehicle(List<String> vehicle) {
		this.vehicle = vehicle;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public Map<String, String> getName() {
		return name;
	}
	public void setName(Map<String, String> name) {
		this.name = name;
	}
	public Properties getProperty() {
		return property;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	@Override
	public String toString() {
		return "Employee \nvehicle=" + vehicle + ", \nemail=" + email + ", \nname=" + name + ", \nproperty=" + property;
	}
}
