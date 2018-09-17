package hierarchy;

public class Manager extends Employee {

	public Manager(String name, int yearsInCompany, boolean hasParking) {
		super(name, yearsInCompany, hasParking);

	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", yearsInCompany=" + yearsInCompany + ", hasParking=" + hasParking + "]";
	}

}
