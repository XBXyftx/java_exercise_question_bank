import java.util.ArrayList;

import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(scanner.nextInt(), scanner.next(), scanner.nextDouble()));

        Equipment e = new PC(scanner.next(), scanner.next());

        employees.add(new Programmer(scanner.nextInt(), scanner.next(), scanner.nextDouble(), Status.BUSY, e,
                scanner.nextDouble()));

        e = new Printer(scanner.next(), scanner.next());

        employees.add(new Designer(scanner.nextInt(), scanner.next(), scanner.nextDouble(), Status.VOCATION, e,
                scanner.nextDouble(), scanner.nextInt()));

        System.out.println("--------------------------------员工列表----------------------------------");

        System.out.println("ID\t姓名\t工资\t职位\t状态\t奖金\t股票\t领用设备");

        for (int i = 0; i < employees.size(); i++) {

            System.out.println(employees.get(i).toString());

        }

        scanner.close();

    }

}

class Status {

    private String name;

    public static final Status BUSY = new Status("工作");

    public static final Status VOCATION = new Status("休假");

    private Status(String name) {

        this.name = name;

    }

    public String getName() {

        return name;

    }

}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + salary + "\t" + "普通员工";
    }

}

class Programmer extends Employee {
    private Status status;
    private Equipment equipment;
    private double bonus;

    public Programmer(int id, String name, double salary, Status status, Equipment equipment, double bonus) {
        super(id, name, salary);
        this.status = status;
        this.equipment = equipment;
        this.bonus = bonus;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.getId() + "\t" + super.getName() + "\t" + super.getSalary() + "\t" + "程序员" + "\t"
                + status.getName() + "\t" + bonus + "\t" + equipment.getDescription();
    }
}

class Designer extends Programmer {
    private int stock;

    public Designer(int id, String name, double salary, Status status, Equipment equipment, double bonus, int stock) {
        super(id, name, salary, status, equipment, bonus);
        this.stock = stock;

    }

    @Override
    public String toString() {
        return super.getId() + "\t" + super.getName() + "\t" + super.getSalary() + "\t" + "设计师" + "\t"
                + super.getStatus().getName()
                + "\t" + super.getBonus() + "\t" + stock + "\t" + super.getEquipment().getDescription();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}

interface Equipment {
    abstract public String getDescription();
}

class PC implements Equipment {
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return "PC机(" + model + "/" + display + ")";
    }
}

class Printer implements Equipment {
    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "打印机(" + name + "/" + type + ")";
    }
}
