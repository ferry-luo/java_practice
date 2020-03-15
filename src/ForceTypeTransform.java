public class ForceTypeTransform {
    public static void main(String[] args){
        int i1 = 127;
        byte x1 = (byte)i1;
        System.out.println("x1的值为："+x1);

        float i2 = 22.6f;
        int x2 = (int)i2;
        System.out.println("x2的值为："+x2);
        double x3 = (double)i2;
        System.out.println("x3的值为："+x3);
    }
}
