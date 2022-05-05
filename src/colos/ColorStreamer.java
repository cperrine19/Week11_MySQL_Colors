package colos;

import java.util.stream.Collectors;

public class ColorStreamer {

	public static void main(String[] args) {
		new ColorStreamer().run();
	}

	private void run() { 		//create a stream of color objects
		String names = Color.getColors() 		//@formatter:off
		.stream() 				//stream method of colors
		.map(c -> c.toString()) //stream of string
		.sorted() 				//sort after converted to string by name ascending
		.collect(Collectors.joining(", \n")); //turn it into a string comma separated
	
	System.out.println("Stream: " + names);
	}

}
