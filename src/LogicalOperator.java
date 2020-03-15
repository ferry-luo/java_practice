public class LogicalOperator {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int c = 5;
        boolean d = (c<5)&&(c++<10);
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));
        System.out.println("使用短路逻辑运算的结果："+d);   //该程序使用到了短路逻辑运算符(&&)，首先判断 c<5 的结果为 false，则 d 的结果必定是 false，所以不再对 a++<10 进行判断
    }
}
