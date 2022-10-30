public class Main {

    public static void main(String[] args) {

        NullAsArgument.foo(null);

        UseLforLong useLforLong = new UseLforLong();
        System.out.println(useLforLong.longWithL);
        System.out.println(useLforLong.longWithoutL);

        NullPointerExceptionImpl nullPointerException = new NullPointerExceptionImpl();
        nullPointerException.printString(null, 3);


    }
}
