public class MultidimensionalArray {
    public static void main(String[] args){
        String shuzu[][] = new String[2][];
        shuzu[0] = new String[3];
        shuzu[1] = new String[3];
        shuzu[0][0] = "Good ";
        shuzu[0][1] = "luck ";
        shuzu[0][2] = "to ";
        shuzu[1][0] = "you";
        shuzu[1][1] = ",";
        shuzu[1][2] = "Ferry";
        //打印二维数组的所有元素。方案一
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(shuzu[i][j]);
            }
        }
        System.out.print('\n');
        //打印二维数组的所有元素。方案二：利用加强for循环
        for(String[] e1:shuzu){
            for(String e2:e1){
                System.out.print(e2);
            }
        }
    }
}
