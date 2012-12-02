package jenkins.plugins.buildfun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FunGenerator {
	private static final String IMAGE_SPLITTER = ",";
	List<FunImage> imagesList = new ArrayList<FunImage>();

	public FunGenerator() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				FunGenerator.class
						.getResourceAsStream("text-associations.properties")));
		String line;
		try {
			while (null != (line = reader.readLine())) {
				String[] textAndImages = line.split("=");
				assert textAndImages.length == 2;
				if (textAndImages[1].contains(IMAGE_SPLITTER)) {
					String[] images = textAndImages[1].split(IMAGE_SPLITTER);
					for (String image : images) {
						imagesList.add(new FunImage(textAndImages[0], image));
					}
				} else {
					imagesList.add(new FunImage(textAndImages[0],
							textAndImages[1]));
				}
			}
		} catch (IOException e) {
			throw new IllegalStateException("WTF", e);
		}
	}

	Random random = new Random(System.currentTimeMillis());

	public FunImage nextImage() {
		return imagesList.get(random.nextInt(imagesList.size()));
	}
}
