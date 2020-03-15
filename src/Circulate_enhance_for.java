public class Circulate_enhance_for {
    public static void main(String[] args){
        int [] shuzu1 = {1,2,3,4,5};
        for(int x:shuzu1){
            if(x == 3){
                break;
            }
            System.out.println(x);
            System.out.println(",");
        }
        System.out.println("\n");
        String [] shuzu2 = {"苹果","香蕉","火龙果"};
        for(String y:shuzu2){
            if(y == "香蕉"){
                continue;
            }
            System.out.println(y);
            System.out.println(",");
        }
    }
}
