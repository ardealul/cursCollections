package hierarchy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
protected String name;
protected int yearsInCompany;
protected boolean hasParking;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYearsInCompany() {
	return yearsInCompany;
}
public void setYearsInCompany(int yearsInCompany) {
	this.yearsInCompany = yearsInCompany;
}
public boolean isHasParking() {
	return hasParking;
}
public void setHasParking(boolean hasPraking) {
	this.hasParking = hasPraking;
}
public Employee(String name, int yearsInCompany, boolean hasParking) {
	super();
	this.name = name;
	this.yearsInCompany = yearsInCompany;
	this.hasParking = hasParking;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", yearsInCompany=" + yearsInCompany + ", hasParking=" + hasParking + "]";
}

}
