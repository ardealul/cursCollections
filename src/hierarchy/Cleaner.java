package hierarchy;

public class Cleaner extends Employee {

	public Cleaner(String name, int yearsInCompany, boolean hasParking) {
		super(name, yearsInCompany, hasParking);
	}

	@Override
	public String toString() {
		return "Cleaner [name=" + name + ", yearsInCompany=" + yearsInCompany + ", hasParking=" + hasParking + "]";
		
	}

}
