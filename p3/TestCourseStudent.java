package p3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCourseStudent {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Course course = new Course(sc.next());
		Student student1 =new Student(sc.nextInt(),sc.next());
		Student student2 =new Student(sc.nextInt(),sc.next());
		course.addStudent(student1);
		course.addStudent(student2);
		System.out.println(course.toString());
	}

}


class Student{
	private int stuNo;
	private String name;
	public Student(){
		
	}
	public Student(int stuNo,String name){
		this.stuNo=stuNo;
		this.name=name;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ѧ��" + stuNo + "\t����" + name;
	}
	
}


class Course {
	private String name;
	private ArrayList<Student> stuList = new ArrayList<>();
	private int numberOfStudent;
	public Course(){
		
	}
	public Course(String name){
		this.name=name;
	}
	public Course(String name, ArrayList<Student> stuList, int numberOfStudent){
		this.name=name;
		this.stuList=stuList;
		this.numberOfStudent=numberOfStudent;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Student>  getStuList() {
		return stuList;
	}
	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
	public void addStudent(Student stu){
		stuList.add(stu);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i<stuList.size();i++){
			sb.append(stuList.get(i).toString()+"\n");
		}
		String msg = sb.toString();
		return "�γ�����\t"+name+"\nѡ��ѧ������\n"+msg;
		
	}
	
}