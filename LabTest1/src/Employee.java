
public class Employee {
	int eid;
	String dept;
	double salary;
	
	public Employee() {
}
    public Employee(int eid,String dept,double salary) {
	this.eid=eid;
	this.dept=dept;
	this.salary=salary;
}
    public void displayInformation() {
    System.out.println("Employee:"+eid);
    System.out.println("Department:"+dept);
    System.out.println("Salary:"+salary);
 }
 }