public class BitOperator {
    public static void main(String[] args) {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        //按位与运算：都为1时，取1，否则取0
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );
        //按位或运算：都为0时，取0，否则取1
        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );
        //相同时，取0，否则取1
        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );
        //按位取反运算：所有位全反。步骤是：0011 1100经过~后得1100 0011，由于计算机存储的是补码，所以要符号位不变取反再末位加1，得1011 1101，也就是十进制的-61
        c = ~a;          /*-61 = 1011 1101 */
        System.out.println("~a = " + c );
        //按位左移
        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );
        //按位右移
        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c );
        //按位右移，移动得到的空位补零
        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );
    }
}
