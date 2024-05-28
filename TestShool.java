
import java.util.Arrays;
import java.util.Scanner;

 public class TestShool {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Student stu1 = new Student(scanner.next(), scanner.nextDouble());

        Student stu2 = new Student(scanner.next(), scanner.nextDouble());

        Student stu3 = new Student(scanner.next(), scanner.nextDouble());                               

        Shool shool = new Shool();

        Student[] students={stu1,stu2,stu3};

        shool.setStudent(students);

         System.out.println("姓名\t\t" + "成绩");

        System.out.println("-------------------------");

        System.out.println(shool.toString());

        System.out.println("所招学生的平均分为"+shool.getAverageScore()+"分");

    }

}
 
class Student{
	private String name;
	private double score;
	public Student (){
		
	}
	public Student (String name,double score){
		this.name=name;
		this.score=score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return name + "\t" + score;
	}
	
}

class Shool{
	private String name;
	private Student student[] = new Student[3];
	public Shool() {
		
	}
	public Shool(String name,Student student[]){
		this.name = name;
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student[] getStudent() {
		return student;
	}
	public void setStudent(Student[] student) {
		this.student = student;
	}
	public double getAverageScore(){
		double sum = 0;
		double averageScore = 0;
		for(int i = 0;i < student.length; i++){
			sum += student[i].getScore();
		}
		averageScore = sum/student.length;
		return averageScore;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < student.length; i++){
			sb.append(student[i].toString()+"\n");
		}
		String msg = sb.toString();
		return msg;
	}
	
}




