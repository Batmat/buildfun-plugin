package jenkins.plugins.buildfun;

public class FunImage {
	final String text;
	final String image;

	public FunImage(String text, String image) {
		super();
		this.text = text;
		this.image = image;
	}

	public String getText() {
		return text;
	}

	public String getImage() {
		return image;
	}
	
	@Override
	public String toString() {
		return text + " : " + image;
	}
}
