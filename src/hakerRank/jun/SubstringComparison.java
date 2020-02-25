package hakerRank.jun;


public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k){
        if (s.length()==k)
            return s + "\n" + s;
        java.util.TreeSet<String> substrings = new java.util.TreeSet<>();
        for(int i=0;i<=s.length()-k;i++){
            substrings.add(s.substring(i,i+k));
        }
        return substrings.pollFirst() + " " + substrings.pollLast();
    }

    public static void main(String[] args) {
        String in = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        System.out.println(getSmallestAndLargest(in,144));
    }
}
