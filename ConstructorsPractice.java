package org.example;

public class ConstructorsPractice {
    public int i;
    public static void main(String[] args) {
        ConstructorsPractice cp = new ConstructorsPractice();
        System.out.println(cp.i);
    }
       public ConstructorsPractice() {
        i = 20;
        System.out.println("Constructor is called");
        }
        public ConstructorsPractice(int a) {
        i = a;
    }
}