package school.lesson3;

public class HomeWork3 {

    public void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan Aleksandrocich", "Qa", "ivanov@mail.ru", "8901111111", 100000, 30);
        empArray[1] = new Employee("Ivanov Igor Ivanovich", "Dev", "ivigor@mail.ru", "8902222222", 80000, 50);
        empArray[2] = new Employee("Ikov Ilya Alekseevich", "Manager", "oreo@mail.ru", "8903333333", 50000, 45);
        empArray[3] = new Employee("Nonov Igor Petrovich", "BackDev", "nivo@mail.ru", "8904444444", 59000, 25);
        empArray[4] = new Employee("Lomo Petr", "FrontDev", "lop@mail.ru", "8905555555", 140000, 47);
        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }

    class Employee {
        String name;
        String position;
        String email;
        String phone;
        int salary;
        int age;

        public Employee(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public void info() {
            System.out.println("ФИО: " + name + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
        }

        public int getAge() {
            return age;
        }
    }
}

