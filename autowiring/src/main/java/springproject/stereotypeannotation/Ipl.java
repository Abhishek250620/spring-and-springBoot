package springproject.stereotypeannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
	@Value("RCB")
	private String name;
	
	@Value("Faf")
	private String captain;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	@Override
	public String toString() {
		return "Ipl [name=" + name + ", captain=" + captain + "]";
	}
}
