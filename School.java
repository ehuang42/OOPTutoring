public class School {
	public String schoolName;
	public int yearFounded;
	public int numOfFaculty;
	
	public School(String schoolName, int yearFounded, int numOfFaculty) {
		this.schoolName = schoolName;
		this.yearFounded = yearFounded;
		this.numOfFaculty = numOfFaculty;
		System.out.println("hey school");

	}

	public String getName() {
		return schoolName;
	}

	public int getYear() {
		return yearFounded;
	}

	public int getNum() {
		return numOfFaculty;
	}

	public String hasRank() {
		return "school doesn't have rank";
	}
}