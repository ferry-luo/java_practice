import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee one = new Employee("华");
        Employee two = new Employee("杰");

        one.empAge(23);
        one.empDesignation("中级测试工程师");
        one.empSalary(8700);
        one.printemp();

        two.empAge(24);
        two.empDesignation("中级测试工程师");
        two.empSalary(9000);
        two.printemp();

    }
}
