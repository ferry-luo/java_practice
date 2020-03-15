public class METHOD {
    public static void main(String[] args){
        int i = 5;
        int j = 5;
        int k = max(i,j);
        System.out.println(i+"和"+j+"相比，最大值是："+k);
        int num1 = 1;
        int num2 = 2;
        swap(num1,num2);
        System.out.println("num1的值为"+num1+",num2的值为"+num2); //  注意：swap方法被调用后，实参num1和num2并没有改变，所以这里输出 num1的值为1,num2的值为2
    }
    //构造函数判断两个数的最大值。由于要返回值，则不能用void类型。当不需要返回值，则用void类型
    public static int max(int x1,int x2){
        int maxvalue;
        if(x1>x2){
            maxvalue = x1;
        }
        else if(x1==x2){
            maxvalue = x1;
            System.out.println("两个数相等");
        }
        else{
            maxvalue = x2;
        }
        return maxvalue;
    }
    //构造函数
    public static void swap(int y1,int y2){
        int t = y1;
        y1 = y2;
        y2 = t;
        System.out.println("num1的值为"+y1+",num2的值为"+y2);
    }
}
