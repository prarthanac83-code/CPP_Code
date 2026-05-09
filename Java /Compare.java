public class Compare {
    public static void main(String args[]){
        String s1 = "Ram";
        String s2 = "rAm";
        boolean equalResult = s1.equals(s2);
        System.out.println("Using equals() method:"+equalResult);

        boolean equalsIgnoreCaseResult = s1.equalsIgnoreCase(s2);
        System.out.println("Using equalIgnoreCaseResult() method:"+ equalsIgnoreCaseResult);
    }
}
