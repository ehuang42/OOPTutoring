public class University extends School {

	public int rank;

	// constructor
	public University(String aName, int aYear, int aNum, int rank) {
		super(aName, aYear, aNum);
		this.rank = rank;
		System.out.println("hey uni");
		//supercall

	}

	public int getRank() {
		return rank;
	}

	public String hasRank() {
		return "it has a rank";
	}
}