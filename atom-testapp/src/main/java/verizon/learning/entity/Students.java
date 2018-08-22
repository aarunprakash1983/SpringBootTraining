package verizon.learning.entity;

public class Students {
private int studentId;
private String	studentName;
private String	nativePlace;
private double fees;


public Students(int studentId, String studentName, String nativePlace, double fees) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.nativePlace = nativePlace;
	this.fees = fees;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getNativePlace() {
	return nativePlace;
}
public void setNativePlace(String nativePlace) {
	this.nativePlace = nativePlace;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}

}
