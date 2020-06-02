package co.grandcircus.gcinfoapi;

import java.util.List;

public class OuterMost {

	private String organization;
	private List<Room> rooms;
	private Ceo ceo;
	private List<Language> languages;
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public Ceo getCeo() {
		return ceo;
	}
	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}
	public List<Language> getLanguages() {
		return languages;
	}
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	
}
