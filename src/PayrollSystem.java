import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    
    public void removeEmployee(int id){
        Employee employeetoRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getID()==id){
                employeetoRemove = employee;
                break;
            }
        }
        if (employeetoRemove!=null){
            employeeList.remove(employeetoRemove);
        }
    }

    public void displayEmployees(){
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
