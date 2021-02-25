package com.cognizant.ems.entity;

public class Employee 
{
int empno;
String ename;
double sal;
public Employee(){}
public Employee(int empno, String ename, double sal) 
{
    super();
    this.empno = empno;
    this.ename = ename;
    this.sal = sal;
}
//getter and setter methods  -------add getters and setter methods here---------
public String toString()
{
  return "Employee [" + empno + " | " + ename + " | " + sal+"]";    
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
}