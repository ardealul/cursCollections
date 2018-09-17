package hierarchy;
import java.util.ArrayList;
import java.util.List;
import hierarchy.*;

public class Company {
	
private List<Cleaner> cleaner = new ArrayList<Cleaner>();
private List<JuniorSoftwareEngineer> softwareengineer = new ArrayList<JuniorSoftwareEngineer>();
private List<Manager> manager = new ArrayList<Manager>();


public void addCleaner(Cleaner addCleaner) {
	cleaner.add(addCleaner);
	this.cleaner = cleaner;
}
public void addSoftwareengineer(JuniorSoftwareEngineer juniorsoftwareengineer ) {
	softwareengineer.add(juniorsoftwareengineer);
	this.softwareengineer = softwareengineer;
}

public void addManager(Manager managerAdd) {
	manager.add(managerAdd);
	this.manager = manager;
}
public List<Cleaner> getCleaner() {
	return cleaner;
}
public void setCleaner(List<Cleaner> cleaner) {
	this.cleaner = cleaner;
}
public List<JuniorSoftwareEngineer> getSoftwareengineer() {
	return softwareengineer;
}
public void setSoftwareengineer(List<JuniorSoftwareEngineer> softwareengineer) {
	this.softwareengineer = softwareengineer;
}
public List<Manager> getManager() {
	return manager;
}
public void setManager(List<Manager> manager) {
	this.manager = manager;
}


}
