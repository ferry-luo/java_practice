public class tryexception {
    public static void main(String[] args){
        int[] a = new int[4];
        try{
            a[0] = 'h'; //  注意：由于声明的是整型数组，元素为字符，输出实际是字符的ASCII码
            a[1] = 'i';
            a[2] = ',';
            a[3] = 9;
            System.out.println("第5个元素是："+a[4]);
        }
        catch(Exception e){
            System.out.println("异常："+e);
        }
        finally{
            a[3] = 'a';
            System.out.println("第4个元素为："+a[3]);
        }
    }
}
//catch 不能独立于 try 存在。
//在 try/catch 后面添加 finally 块并非强制性要求的。
//try 代码后不能既没 catch 块也没 finally 块。
//try, catch, finally 块之间不能添加任何代码。
