/*
	Created by Le-En Huang (ehuang42) during Fall 2018 for tutoring 
	purposes.

	Demonstrate concepts of Inheritance and Java basics.
	
	Superclass-subclass structure:
	School (Top)
		- Unersity extends School (Middle)
			- College extends Unversity (Bottom)
*/

public class SchoolTest {
	public static void main(String[] args) {

		// 1. Getting constructor to work
		// 2. Understanding Java--statically typed dynamically run
		School school1 = new School("Harvard", 1900, 1000);
		University uni1 = new University("UGA", 1800, 400, 1000);
		University uni2 = new School("NYU", 1970, 200);
		School school2 = new University("GaTech", 1901, 2000, 1);


		// expected output:
		// Compile error on line 21
		// Explanation:
			// as a result of inheritance, we can instantiate an
			// university as a (run time) school type (line 20), 
			// but we can't instantiate a school type and tell the
			// compile to treat it as an univeristy.

		// Why:
			// An easy way to think about this is, we cannot narrow
			// down what an object can do. A school is a much general
			// object than university. Therefore, there might be some
			// specific things that an university can do that a school
			// can't.

			// Think about univeristies for a second: at Georgia Tech,
			// we have greek houses on campus. But not all schools have
			// greek houses. Like elementary school! Therefore we can't
			// just treat a school and expects it would meet any requirement
			// that an university might have. 

		System.out.println(school1.getName());
		System.out.println(uni1.getName() + uni1.getRank());
		System.out.println(school2.hasRank());
		System.out.println(uni2.getName());


		// Practice constructor chaining with tracing.

		College coll1 = new College("Dartmouth", 1890, 300, 7);
		// expected output:
		// hey school
		// hey uni
		// hey college
	}
	
}