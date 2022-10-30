public class Main {

    public static void main(String[] args) {

        NullAsArgument.foo(null);


        UseLforLong useLforLong = new UseLforLong();
        System.out.println(useLforLong.longWithL);
        System.out.println(useLforLong.longWithoutL);

        /**
         * Java is always pass-by-value.
         * Unfortunately, when we pass the value of an object, we are passing the reference to it.
         * There is no such thing as "pass-by-reference" in Java.
         * This is confusing to beginners.
         * The key to understanding this is that something like:
         */
        NullPointerExceptionImpl nullPointerException_;
        // is not a NullPointerExceptionImpl; it's actually a pointer to a NullPointerExceptionImpl.

        /**
         * So when you have:
         */
        NullPointerExceptionImpl nullPointerException = new NullPointerExceptionImpl();
        nullPointerException.printString(null, 3);
        // you're essentially passing the address of the created UseLforLong object to the printString method.


    }
}
