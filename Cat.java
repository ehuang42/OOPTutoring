/*
    Created by Dr. Christopher Simpkins and modified by 
    Le-En Huang (ehuang42) during Fall 2018 for tutoring 
    purposes.

    Demonstrate concepts of Objects, override, constructors, 
    getters & setters, enum class, and modifiers.
    
    Related Files:
        enum class Color.java
*/
public class Cat {

    private String name;
    private int anniversary;
    public static final String dnaSequence = "AGTC";
    private Color color;

    // constructor
    public Cat(String name, int cat_anniversary) {
        name = name;
        anniversary = cat_anniversary;
        //this.anniversary = anniversary;
    }

    // no-arg
    public Cat() {
    	// this.name = "defaul";
    	// this.anniversary = 0;
        this("default", 0);
    }
    
    public static void printer() { // if not static then throws exception
        System.out.println("it's a printer");
    }


    // setters

    public void setColor(Color color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;

        // or change the parameter's value to be different from 'name'
    }
    public void setDate(int anniversary) {
        anniversary = anniversary;
    }
    
    // getters
    public String getName() {
        return name;
    }
    public int getDate() {
        return anniversary;
    }

    @Override
    public String toString( ) {
        return ("Cat is: " + name);
    }
