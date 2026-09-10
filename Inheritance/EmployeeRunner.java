public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.0);
        Employee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        Employee employee3 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.00, 32);
        Employee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.00);
        Employee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.00);
        Employee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.00);
        Employee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.00);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
        System.out.println(employee7);
    }
}