public class bt1 {
    public static void main(String[] args) {
        char ch1='A';
        char ch2='5';
        char ch3=' ';
        char ch4='b';
        System.out.println("is letter "+Character.isLetter(ch1));
        System.out.println("is Diget " +Character.isDigit(ch2));
        System.out.println("is Whitespace " +Character.isWhitespace(ch3));
        System.out.println("is UpperCase " +Character.isUpperCase(ch1));
        System.out.println("is LowerCase " +Character.isLowerCase(ch4));
        System.out.println("to UpperCase  " +Character.toUpperCase(ch4));
        System.out.println("to LowerCase  " +Character.toLowerCase(ch1));
        System.out.println("is letterOrDigit "+ Character.isLetterOrDigit(ch2));
        System.out.println("is spaceChar "+ Character.isSpaceChar(ch3));
        System.out.println("getNumericValue "+ Character.getNumericValue(ch2));



    }
}
