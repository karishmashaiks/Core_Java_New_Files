public class Main {
    public static void main(String[] args)
    {
        String s1="Telugu";

        String s2="Telugu";

        String s3="Tech";

        System.out.println(s1.compareTo (s2));//0

        System.out.println(s1.compareTo (s3));//1 (because s1>s3)

        System.out.println(s3.compareTo (s1));//-1 (because s3 < s1)
    }
}