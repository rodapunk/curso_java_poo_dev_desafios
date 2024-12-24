package m13_aula12_herpol_desafio.entities;

public abstract class Lesson {
	private String title;
	
	public Lesson() {
		
	}

	public Lesson(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract int duration();
}