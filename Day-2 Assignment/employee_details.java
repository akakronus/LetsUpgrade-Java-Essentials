package employee_details;

public class employee_details {

    String name, city;
    int age;

    public void display() {

        System.out.println("The Name is : " +name);
        System.out.println("The Age is : " +age);
        System.out.println("The City is : " +city);

    }

    public static void main(String[] args) {

        employee_details emp1 = new employee_details();
        emp1.name = "Vijay";
        emp1.age = 46;
        emp1.city = "Chennai";

        employee_details emp2 = new employee_details();
        emp2.name = "Suresh";
        emp2.age = 21;
        emp2.city = "Chennai";

        System.out.println("--- Employee Details ---");
        emp1.display();
        emp2.display();

    }

}