package p1;

public class TestPersonInterface {
	public static void main (String[] arg){
		Student student = new Student("Tom",Student.FRESHMAN);
		Faculty faculty = new Faculty("Jerry",Faculty.ASSOCIATEPROFESSOR);
		System.out.println(student.toString());
		System.out.println(student.volunteer("北京青年志愿者协会"));
		System.out.println(faculty.toString());
		System.out.println(faculty.volunteer("北京市慈善义工协会"));
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
		return "姓名"+super.getName()+"\n年级"+grade;
	}
	public String volunteer(String organization){
		return "所属社团"+organization;
	}
	
}

interface Volunteer{
	public abstract String volunteer(String organization);
}

class Faculty extends Person implements Volunteer{
	private String title;
	public final static String TEACHINGASSISTANT = "助教";
	public final static String LECTURER = "讲师";
	public final static String ASSOCIATEPROFESSOR = "副教授";
	public final static String PROFESSOR = "教授";
	public Faculty(String name,String title){
		super(name);
		this.title = title;
	}
	@Override
	public String toString() {
		return "姓名"+super.getName()+"\n职称"+title;
	}
	public String volunteer(String organization){
		return "所属社团"+organization;
	}
	
}



