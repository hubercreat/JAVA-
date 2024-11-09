// Employee基类
class Employee {
    private String name;
    private int birthdayMonth;

    public Employee(String name, int birthdayMonth) {
        this.name = name;
        this.birthdayMonth = birthdayMonth;
    }

    public double getSalary(int month) {
        if (month == birthdayMonth) {
            return 100;
        }
        return 0;
    }

    // Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }
}

// SalariedEmployee类
class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int birthdayMonth, double salary) {
        super(name, birthdayMonth);
        this.salary = salary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + salary;
    }

    // Getter和Setter方法
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// HourlyEmployee类
class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public HourlyEmployee(String name, int birthdayMonth, double hourlyRate, int hoursWorked) {
        super(name, birthdayMonth);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary(int month) {
        double baseSalary = Math.min(160, hoursWorked) * hourlyRate;
        double overtime = Math.max(0, hoursWorked - 160) * hourlyRate * 1.5;
        return super.getSalary(month) + baseSalary + overtime;
    }

    // Getter和Setter方法
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}

// SalesEmployee类
class SalesEmployee extends Employee {
    private double sales;
    private double commissionRate;

    public SalesEmployee(String name, int birthdayMonth, double sales, double commissionRate) {
        super(name, birthdayMonth);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + sales * commissionRate;
    }

    // Getter和Setter方法
    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}

// BasePlusSalesEmployee类
class BasePlusSalesEmployee extends SalesEmployee {
    private double baseSalary;

    public BasePlusSalesEmployee(String name, int birthdayMonth, double sales, double commissionRate, double baseSalary) {
        super(name, birthdayMonth, sales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + baseSalary;
    }

    // Getter和Setter方法
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

// 主类
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("张三", 5, 3000);
        employees[1] = new HourlyEmployee("李四", 7, 20, 170);
        employees[2] = new SalesEmployee("王五", 8, 10000, 0.1);
        employees[3] = new BasePlusSalesEmployee("赵六", 9, 15000, 0.15, 2000);
        employees[4] = new Employee("周八", 10);

        int month = 5; // 假设我们计算5月份的工资
        for (Employee employee : employees) {
            System.out.println(employee.getName() + "'s salary for " + month + ": " + employee.getSalary(month));
        }
    }
}