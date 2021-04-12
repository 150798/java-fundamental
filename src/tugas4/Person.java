package tugas4;

public class Person {
	String fullName, cardIdentitas, title, domisili;
	
	
	public Person(String fullName, String cardIdentitas) {
		super();
		this.fullName = fullName;
		this.cardIdentitas = cardIdentitas;
		
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCardIdentitas() {
		return cardIdentitas;
	}

	public void setCardIdentitas(String cardIdentitas) {
		this.cardIdentitas = cardIdentitas;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDomisili() {
		return domisili;
	}

	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}
	
	
	
	

}
