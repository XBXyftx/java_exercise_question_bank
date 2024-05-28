package p2;

import java.util.Scanner;

public class TestPerson {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Student student = new Student(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextInt());
		Faculty faculty = new Faculty(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),new MyDate(sc.nextInt(),sc.nextInt(),sc.nextInt()),sc.next(),sc.nextInt() );
		Staff staff = new Staff(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),new MyDate(sc.nextInt(),sc.nextInt(),sc.nextInt()),sc.next());
		System.out.println(student.toString()+faculty.toString()+staff.toString());
	}

}


class MyDate{
	private int year;
	private int month;
	private int day;
	public MyDate(int year,int month,int day){
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "雇佣日期:\t"+year+"年"+month+"月"+day+"日\n";
	}
	
}


class Person{
	protected String name;
	protected String add;
	protected String phoneNo;
	protected String email;
	public Person(){
		
	}
	public Person(String name,String add,String phoneNo,String email){
		this.name=name;
		this.add=add;
		this.phoneNo=phoneNo;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "姓名:" + name + "\n地址:" + add + "\n电话:" + phoneNo
				+ "\nEmail:" + email ;
	}
	
	
}


class Student extends Person{
	protected int classStatus;
	
	public Student(String name,String add,String phoneNo,String email,int classStatus){
		super(name,add,phoneNo,email);
		this.classStatus = classStatus;
	}

	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}

	@Override
	public String toString() {
		return super.toString()+"\n班级:" + classStatus;
	}
	
}


class Employee extends Person{
	protected String office;
	protected double salary;
	protected MyDate dateHired;
	public Employee(String name,String add,String phoneNo,String email,String office,double salary,MyDate dateHired){
		super(name,add,phoneNo,email);
		this.office = office;
		this.salary=salary;
		this.dateHired = dateHired;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return super.toString()+"\n办公地点:" + office + "\n薪水:" + salary+
				"\n" + dateHired.toString();
	}
	
}


class Faculty extends Employee{
	private String officeHours;
	private int rank;
	public Faculty(String name,String add,String phoneNo,String email,String office,double salary,MyDate dateHired,String officeHours,int rank){
		super(name,add,phoneNo,email,office,salary,dateHired);
		this.officeHours=officeHours;
		this.rank=rank;
		
	}
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return super.toString()+"\n办公时间:" + officeHours + "\n级别:" + rank;
	}
	
}


class Staff extends Employee{
	private String title;
	
	public Staff(String name,String add,String phoneNo,String email,String office,double salary,MyDate dateHired,String title){
		super(name,add,phoneNo,email,office,salary,dateHired);
		this.title=title;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString()+"\n职称:" + title;
	}
	
}
