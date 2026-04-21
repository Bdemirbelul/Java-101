public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30.0;
        }
        return 0;
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - this.hireYear;

        if (yearsWorked < 10) {
            return this.salary * 0.05;
        } else if (yearsWorked < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - tax + bonus;
        double totalSalary = this.salary + raise;

        return "Adi : " + this.name + "\n"
                + "Maasi : " + this.salary + "\n"
                + "Calisma Saati : " + this.workHours + "\n"
                + "Baslangic Yili : " + this.hireYear + "\n"
                + "Vergi : " + tax + "\n"
                + "Bonus : " + bonus + "\n"
                + "Maas Artisi : " + raise + "\n"
                + "Vergi ve Bonuslar ile birlikte maas : " + salaryWithTaxAndBonus + "\n"
                + "Toplam Maas : " + totalSalary;
    }
}
