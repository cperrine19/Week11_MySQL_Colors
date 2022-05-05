package colos;

import java.util.List;

public class ColorSorter {

	//main method
	public static void main(String[] args) {
		new ColorSorter().run(); //run method to call sort method using true or false
	}

	private void run() {
		boolean sortWithLambda = true; //true for Lambda, false for Method
		List<Color> colors;
		String name;
		
		System.out.println("Original List: " + Color.getColors());
		
		if(sortWithLambda) {
			colors = sortWithLambda();
			name = "Lambda: ";
		}
		else {
			colors = sortWithMethodReference();
			name = "Method: ";
		}
		System.out.println(name + colors);
	}

	private List<Color> sortWithMethodReference() {
		List<Color> colors = Color.getColors();
		colors.sort(Color::compare);
		return colors;
	}

	private List<Color> sortWithLambda() {
		List<Color> colors = Color.getColors();
		
		colors.sort((c1, c2) -> c1.compare(c2));
		return colors;
	}

}
