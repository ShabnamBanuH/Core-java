package slipt;

public class ClassDemo {
    public static void main(String[] args) {
        // int count=0;
        String s = "         hello worl hoew r u  ";
        s = s.trim();
        String[] st = s.split("\\s+");
        
        System.out.println(st.length);
    }
}
