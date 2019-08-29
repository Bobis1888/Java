package codewars.jun;

public class ArithmeticMethod {
    public static int arithmetic(int a , int b ,String operator){
        switch (operator){
            default:
            case "add": return a+b;
            case "subtract": return a-b;
            case "multiply": return a*b;
            case "divide": return a/b;
        }
    }
}
