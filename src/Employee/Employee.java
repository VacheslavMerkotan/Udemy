package Employee;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String departmen;

    double povishenie(double salary) {
        double povishenie = salary * 2;
        return povishenie;
    }

        void ShowInfo() {
            System.out.println("Nomer:"  + id + " Familia: " + surname + " Let: " + age + " PovishenieVdvoe "  + povishenie(salary));
        }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 5;
        e1.surname = "Ivanov";
        e1.age = 32;
        e1.salary = 128.63;
        e1.departmen = "OT";
        e1.povishenie(e1.salary);
        e1.ShowInfo();

        Employee e2 = new Employee();
        e2.id = 10;
        e2.surname = "Petrov";
        e2.age = 27;
        e2.salary = 73.75;
        e2.departmen = "OT";
        e2.povishenie(e1.salary);
        e2.ShowInfo();

    }
}
