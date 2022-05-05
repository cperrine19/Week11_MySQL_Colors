package colos;

import java.util.LinkedList;
import java.util.List;

public class Color {
	private String name; //instance variable
	
	//static variable List of favorite colors
	private static final List<Color> colors = List.of(//@formatter:off
			new Color("Blue"), 
			new Color ("Pink"),
			new Color ("Green"),
			new Color ("Yellow"),
			new Color ("Aqua"),
			new Color ("Red"),
			new Color ("Purple")
			); //formatter:on
	
	//constructor that takes a name for each color
	public Color (String name) {
		this.name = name;
	}
	
	//getter for color name
	public String getName() {
		return name;
	}
	
	//toString method
	@Override
	public String toString() {
		return name + " Color";
		
	}
	//compare method
	public int compare(Color that) {
		return this.name.compareTo(that.name);
	}
	
	//getter for list
	public static List<Color> getColors() {
		return new LinkedList<>(colors);
	}
	
}
