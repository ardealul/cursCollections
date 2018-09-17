package hierarchy;

public class JuniorSoftwareEngineer extends Employee {

	public JuniorSoftwareEngineer(String name, int yearsInCompany, boolean hasParking) {
		super(name, yearsInCompany, hasParking);
	}

	@Override
	public String toString() {
		return "Junior Software Engineer [name=" + name + ", yearsInCompany=" + yearsInCompany + ", hasParking=" + hasParking + "]";
	}

}
