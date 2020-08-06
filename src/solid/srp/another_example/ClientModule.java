package solid.srp.another_example;

public class ClientModule {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Dmitry", "development", true);
        ClientModule.hireNewEmployee(employee);
        ClientModule.printEmployeeReport(employee, FormatType.CSV);
        ClientModule.terminateEmployee(employee);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    public static void printEmployeeReport(Employee employee, FormatType formatType) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
