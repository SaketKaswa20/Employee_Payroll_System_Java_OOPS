public class Main {
    public static void main(String[] args) {
        PayrollSystem ps = new PayrollSystem();
        FullTimeEmployee fte1= new FullTimeEmployee("Saket", 112113030, 1500000);
        PartTimeEmployee pte1= new PartTimeEmployee("Soham", 112113020, 20, 5000);
        ps.addEmployee(fte1);
        ps.addEmployee(pte1);

        System.out.println("Initial Employee Details");
        ps.displayEmployees();

        System.out.println(pte1.calculateSalary());

        System.out.println("Removing Employee");
        ps.removeEmployee(112113020);

        System.out.println("Remaining Employee Details");
        ps.displayEmployees();
    }
}