public class testing {
	
	
	public static void main(String[] args) {
		Cat cat1 = new Cat("Nina", 10); //how to create an instatnce
		System.out.println(cat1.getName()); //instance variable
		// System.out.println(cat1.name); not gonna compile
		// Cat.printer(); // static method in static context
		// cat1.printer(); // invoke method call on instance of object

		// System.out.println(Cat.dnaSequence);
		// String newDna = Cat.dnaSequence;
		// newDna +="AGCT";
		// System.out.println(cat1.toString());
		// System.out.println("color is " + Color.YELLOW);
	}

}