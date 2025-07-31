package JET;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        int result = obj.calc(14,12,"*");
        System.out.println(result);
    }

    public int calc(int a ,int b ,String op){
        if(op.equals("+")){
            return (a+b);
        }
        return 0;
    }










    public String methodOne(String a){

        for(int i = 0; i < a.length(); i++){
            if("a".equals(a.charAt(i))){
                System.out.println();
            }
        }
return "";
    }

}
