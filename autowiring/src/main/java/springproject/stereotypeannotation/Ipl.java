package springproject.stereotypeannotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("iplTeams")
public class Ipl {
	@Value("RCB")
	private String name;
	
	@Value("Faf")
	private String captain;
	
	@Value("#{temp}")
	private List<String> playersName;
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
//	@Override
//	public String toString() {
//		return "Ipl [name=" + name + ", captain=" + captain + ", playerName=" + playersName + "]";
//	}
	public List<String> getPlayersName() {
		return playersName;
	}
	public void setPlayersName(List<String> playersName) {
		this.playersName = playersName;
	}
}
