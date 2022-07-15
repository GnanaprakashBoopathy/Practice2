package org.company;

public class CompanyInfo {
private void companyName(String name) {
System.out.println("Company Name is "+name);
}
private void companyName(char id, int year) {
System.out.println("Company ID is "+id+"\n"+"Company Start year is "+year);
}
private void companyName(int year1) {
System.out.println("Company year of Starting "+year1);
}
private void companyName(float address) {
System.out.println("Company Address is "+address);
}
public static void main(String[] args) {
	CompanyInfo a=new CompanyInfo();
	a.companyName("Success");
	a.companyName('A');
	a.companyName(2014);
	a.companyName('A', 2013);
	a.companyName(198.23f);
	
}
}
