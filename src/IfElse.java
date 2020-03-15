public class IfElse {
    public static void main(String[] args){
        int x = 40;
        int y = 1;
        int z = 2;
        if(x==10){
            System.out.println("x的值为："+x);
        }
        else if(x==20){
            System.out.println("x的值为："+x);
        }
        else if(x==30){
            System.out.println("x的值为："+x);
        }
        else{
            System.out.println(x+"不是10、20、30中的一个");
        }
        //嵌套
        if(y==1){
            if(z==2){
                System.out.println("y等于1且z等于2");
            }
        }
    }
}
