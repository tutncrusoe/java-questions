public class NullAsArgument {

    /**
    According to Java specs, in case of overloading, the compiler picks the most specific function.
    Obviously String class is more specific than Object class, hence it will print “String argument”.
     **/
    /**
     * In this case, the Java compiler will throw an error as “The method foo(String) is ambiguous for the type Test”.
     * String and StringBuffer have no inheritance hierarchy. So none of them are more specific to others.
     * A method is more specific than another if any invocation handled by the first method could be passed on to the other one without a compile-time type error.
     * We can pass String as a parameter to Object argument and String argument but not to the StringBuffer argument method.
     *
     * @Ref https://www.digitalocean.com/community/tutorials/java-tricky-interview-questions
     */
    public static void foo(Object o) {
        System.out.println("Object argument");
    }
    public static void foo(String s) {
        System.out.println("String argument"); // => return
    }

//    public static void foo(StringBuffer i){
//        System.out.println("StringBuffer impl");
//    }
}
