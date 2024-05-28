package p1;

public class TestPersonInterface {
	public static void main (String[] arg){
		Student student = new Student("Tom",Student.FRESHMAN);
		Faculty faculty = new Faculty("Jerry",Faculty.ASSOCIATEPROFESSOR);
		System.out.println(student.toString());
		System.out.println(student.volunteer("��������־Ը��Э��"));
		System.out.println(faculty.toString());
		System.out.println(faculty.volunteer("�����д����幤Э��"));
	}

}

class Person{
	private String name;
	public Person(){
		
	}
	public Person (String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
class Student extends Person implements Volunteer{
	private int grade;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;
	public Student(String name,int grade){
		super(name);
		this.grade = grade;
		
	}
	@Override
	public String toString() {
		return "����"+super.getName()+"\n�꼶"+grade;
	}
	public String volunteer(String organization){
		return "��������"+organization;
	}
	
}

interface Volunteer{
	public abstract String volunteer(String organization);
}

class Faculty extends Person implements Volunteer{
	private String title;
	public final static String TEACHINGASSISTANT = "����";
	public final static String LECTURER = "��ʦ";
	public final static String ASSOCIATEPROFESSOR = "������";
	public final static String PROFESSOR = "����";
	public Faculty(String name,String title){
		super(name);
		this.title = title;
	}
	@Override
	public String toString() {
		return "����"+super.getName()+"\nְ��"+title;
	}
	public String volunteer(String organization){
		return "��������"+organization;
	}
	
}



