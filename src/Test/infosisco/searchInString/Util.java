package Test.infosisco.searchInString;

public class Util {
    public int searchString(String s, String str){
        int result = 0;
        int index = 0;
        while (index<=s.length()){
            index = s.indexOf(str,index);
            if (index==-1) {
                break;
            } else {
                result++;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "555333687717";
        String str = "6";
        Util util = new Util();
        System.out.println(util.searchString(s,str));
    }
}
