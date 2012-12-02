package jenkins.plugins.buildfun;

import org.junit.Test;
import static org.junit.Assert.*;

public class FunGeneratorTest {
	@Test
	public void simpleTest() {
		assertEquals(3, new FunGenerator().imagesList.size());
	}

	public void nextImage() {
		FunGenerator g = new FunGenerator();
		FunImage nextImage = g.nextImage();
		assertNotNull(nextImage);
		assertNotNull(nextImage.getImage());
		assertNotNull(nextImage.getText());
		nextImage = g.nextImage();
		assertNotNull(nextImage);
		assertNotNull(nextImage.getImage());
		assertNotNull(nextImage.getText());
		nextImage = g.nextImage();
		assertNotNull(nextImage);
		assertNotNull(nextImage.getImage());
		assertNotNull(nextImage.getText());
		
	}
}
