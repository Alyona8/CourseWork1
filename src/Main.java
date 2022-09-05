public class Main {
    private static Employee[] employees = new Employee[10];

    private static double getSum() {
        double sum = 0;
        for (Employee value : employees) {
            sum = sum + value.getSalary();
        }
        return sum;
    }

    private static void getMaxPay() {
        String expensiveEmployee = "";
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                expensiveEmployee = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + expensiveEmployee);
    }

    private static void getMinPay() {
        String cheapEmployee = " ";
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                cheapEmployee = employee.getFullName();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + cheapEmployee);
    }

    private static double averageSalary() {
        return Math.ceil(getSum() / employees.length);
    }

    public static void main(String[] args) {
        employees[0] = new Employee("Арбузова Марина Ивановна", 1, Math.ceil(Math.random() * 100000));
        employees[1] = new Employee("Басманов Михаил Матвеевич", 2, Math.ceil(Math.random() * 100000));
        employees[2] = new Employee("Волкова Арина Павловна", 5, Math.ceil(Math.random() * 100000));
        employees[3] = new Employee("Галиуллин Марат Рустамович", 3, Math.ceil(Math.random() * 100000));
        employees[4] = new Employee("Дерябина Мария Васильевна", 4, Math.ceil(Math.random() * 100000));
        employees[5] = new Employee("Елистратов Тимофей Алексеевич", 5, Math.ceil(Math.random() * 100000));
        employees[6] = new Employee("Жигалова Анна Семеновна", 1, Math.ceil(Math.random() * 100000));
        employees[7] = new Employee("Зайнуллин Артур Марсович", 2, Math.ceil(Math.random() * 100000));
        employees[8] = new Employee("Игнатьев Иван Романович", 3, Math.ceil(Math.random() * 100000));
        employees[9] = new Employee("Котова Арина Николаевна", 4, Math.ceil(Math.random() * 100000));


        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println();
        System.out.println("Сумма затрат на зарплаты сотрудников в месяц " + getSum() + " руб.");
        getMinPay();
        getMaxPay();
        System.out.println("Среднее значение зарплат сотрудников " + averageSalary() + " руб.");
        System.out.println();

        for (Employee e : employees) {
            System.out.println(e.getFullName());
        }
        System.out.println();

    }
}