public class Array {
    //构造数组输出函数。数组作为函数的参数
    public static void printarray(int[] array){
        for(int p=0;p<array.length;p++){
            System.out.println(array[p]);
        }
    }
    //数组作为函数的返回值。注意：类型一定要也是整型数组类型，不能用void，因为我们需要返回一个整型数组，用void类型导致返回不了。
    public static int[] reverseorder(int[] array){
        int[] array2 = new int[array.length];   //创建一个空的整型数组
        for(int i=0,j=array.length-1;i<array.length;i++,j--){
            array2[j] = array[i];
        }
        return array2;
    }

    public static void main(String[] args){
        printarray(new int[] {1,2,3,4,5});  //调用printarray方法
        int[] shuzu = new int[5];
        shuzu[0] = 6;
        shuzu[1] = 7;
        shuzu[2] = 8;
        shuzu[3] = 9;
        shuzu[4] = 10;
        printarray(reverseorder(shuzu));    //调用reverseorder函数返回倒序了的数组，然后通过数组输出函数打印 ps:printarray函数也有自动换行

        double[] myarray = new double[5];   //如果这里将size设定为10，下面初始化时只有前5个，则后面的全部默认为double型的0
        myarray[0]=1.2;
        myarray[1]=2.3;
        myarray[2]=3.4;
        myarray[3]=4.3;
        myarray[4]=5.4;

        //打印所有元素。第一种方案
        for(int k=0;k<myarray.length;k++){
            System.out.println(myarray[k]);
        }
        //打印所有元素。第二种方案：利用加强型for循环，不用使用下标就能遍历数组
        for(double e:myarray){
            System.out.println(e);
        }
        //计算总和
        double totalvalue = 0;  //注意：声明的totalvalue要放在for循环外面，不然之后的输出函数用它会不认识。
        for(int i=0;i<5;i++){
            totalvalue += myarray[i];
        }
        System.out.println("总和："+totalvalue);
        //找出最大值
        double maxvalue = myarray[0];
        for(int j=1;j<myarray.length;j++){
            if(myarray[j]>maxvalue){
                maxvalue = myarray[j];
            }
        }
        System.out.println("最大的元素是："+maxvalue);
    }
}
