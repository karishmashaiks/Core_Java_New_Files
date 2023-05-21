public class Main {
    public static void main(String[] args)
    {
        String s1="Telugu";

        String s2="Telugu";

        String s3=new String("Telugu");

        String s4="Karishma";

        String s5="telugu";

        System.out.println(s1.equals(s2));//true s1 = Telugu and s2 = Telugu

        System.out.println(s1.equals(s3));//true s1 = Telugu and s3 = Telugu

        System.out.println(s1.equalsIgnoreCase(s5));//

        System.out.println(s1.equals(s4));//false s1 = Telugu and s4 = Karishma
    }
}