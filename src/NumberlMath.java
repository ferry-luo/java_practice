public class NumberlMath {
    public static void t(double num){
        System.out.println("Math.floor("+num+")="+Math.floor(num));
        System.out.println("Math.ceil("+num+")="+Math.ceil(num));
        System.out.println("Math.round("+num+")="+Math.round(num));
    }
    public static void s(double x){
        System.out.print(x+"的正弦值为："+Math.sin(x));
        System.out.print(x+"的余弦值为："+Math.cos(x));
        System.out.print(x+"的正切值为："+Math.tan(x));
        System.out.print(x+"的反正切值为："+Math.atan(x));
    }
    public static void main(String[] args){
        double[] nums={1.4,1.5,1.6,-1.4,-1.5,-1.6};
        double[] san={Math.PI/2,Math.PI,0};
        for(double n:nums){
            t(n);
        }
        for(double y:san){
            s(y);
        }
    }
}
