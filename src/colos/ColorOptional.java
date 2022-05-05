package colos;

import java.util.NoSuchElementException;
import java.util.Optional;

public class ColorOptional {

	public static void main(String[] args) {
		new ColorOptional().run();
	}

	private void run() {
		Optional<Color> opC = Optional.of(new Color("White"));
		Color color = colorMethod(opC);
		System.out.println("My new color is " + color + ".");

		try {
			Optional<Color> empty = Optional.empty();
			colorMethod(empty);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private Color colorMethod(Optional<Color> colorOptional) { // NSEE with custom message
		return colorOptional.orElseThrow(() -> new NoSuchElementException("This color does not exist."));
	}

}
