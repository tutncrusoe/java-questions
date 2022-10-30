public class NullPointerExceptionImpl {
    
    void printString(String s, int count) { // Exception in thread "main" java.lang.NullPointerException if not check null
        if (s == null) return;
        for (int i = 0; i < count; i++) {
            System.out.println(s.toUpperCase());
        }
    }
}
