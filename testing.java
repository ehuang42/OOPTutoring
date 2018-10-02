/*
    Created by Le-En Huang (ehuang42) during Fall 2018 for tutoring 
    purposes.

    Demonstrate concepts of Objects, constructors, getters&
    setters, enum class, and modifiers.
    
    Related Files:
    	class Cat.java
        enum class Color.java
*/

public class testing {
	
	// TODO: finish tutorial & explanations!
	
	public static void main(String[] args) {
		Cat cat1 = new Cat("Nina", 10); //how to create an instatnce
		System.out.println(cat1.getName()); //instance variable
		System.out.println(cat1.name); 

		// not gonna compile because name field is private,
		// meaning we cannot access it from another class
		// for more modifier info (public, private, no, protected),
		// go to Oracle tutorials

		Cat.printer(); // static method in static context
		cat1.printer(); // invoke method call on instance of object

		System.out.println(Cat.dnaSequence);
		String newDna = Cat.dnaSequence;
		newDna +="AGCT";
		System.out.println(cat1.toString());
		System.out.println("color is " + Color.YELLOW);
	}

}