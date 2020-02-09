package Test;

public class Util {
    public int searchString(String s, String str){
        int result = 0;
        int index = s.indexOf(str);
        if (index==-1) {
            return 0;
        }else {
            result++;
        }
        while (true){
            index = s.indexOf(str,index+1);
            if (index==-1) {
                break;
            } else {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "555333687";
        String str = "3";
        Util util = new Util();
        System.out.println(util.searchString(s,str));
    }
}
