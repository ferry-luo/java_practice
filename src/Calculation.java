public class Calculation {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 25;
        int d = 25;
        System.out.println("a加b等于" + (a + b));
        System.out.println("a减b等于" + (a - b));
        System.out.println("a乘以b等于" + (a * b));
        System.out.println("a除以b等于" + (a / b));
        System.out.println("c对b求余等于" + (c % b));
        System.out.println("a先表达式运算，再自增" + (a++));
        System.out.println("a先表达式运算，再自减" + (a--));
        System.out.println("d先表达式计算，再自增" + (d++));
        System.out.println("d先自增，再表达式运算" + (++d));
    }
}
