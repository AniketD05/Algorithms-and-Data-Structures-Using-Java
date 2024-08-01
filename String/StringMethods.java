class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String anotherStr = "hello, world!";
        String suffix = "World!";
        String prefix = "Hello";
        String whitespace = "   Hello, World!   ";

        // static String valueOf(Object obj)
        System.out.println("valueOf: " + String.valueOf(1234)); // "1234"

        // String trim()
        System.out.println("trim: '" + whitespace.trim() + "'"); // "Hello, World!"

        // String toUpperCase()
        System.out.println("toUpperCase: " + str.toUpperCase()); // "HELLO, WORLD!"

        // String toLowerCase()
        System.out.println("toLowerCase: " + str.toLowerCase()); // "hello, world!"

        // char[] toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("toCharArray: ");
        for (char c : charArray) {
            System.out.print(c + " "); // H e l l o ,   W o r l d !
        }
        System.out.println();

        // String substring(int beginIndex, int endIndex)
        System.out.println("substring (beginIndex, endIndex): " + str.substring(7, 12)); // "World"

        // String substring(int beginIndex)
        System.out.println("substring (beginIndex): " + str.substring(7)); // "World!"

        // String[] split(String regex)
        String[] words = str.split(", ");
        System.out.println("split: ");
        for (String word : words) {
            System.out.println(word); // "Hello" and "World!"
        }

        // boolean isEmpty()
        System.out.println("isEmpty: " + str.isEmpty()); // false

        // int length()
        System.out.println("length: " + str.length()); // 13

        // String intern()
        String internedStr = str.intern();
        System.out.println("intern: " + internedStr); // "Hello, World!"

        // int lastIndexOf(String str)
        System.out.println("lastIndexOf(String): " + str.lastIndexOf("o")); // 8

        // int indexOf(String str)
        System.out.println("indexOf(String): " + str.indexOf("o")); // 4

        // int lastIndexOf(int ch)
        System.out.println("lastIndexOf(int ch): " + str.lastIndexOf('o')); // 8
       
        // int indexOf(int ch)
        System.out.println("indexOf(int ch): " + str.indexOf('o')); // 4

        // byte[] getBytes()
        byte[] byteArray = str.getBytes();
        System.out.println("getBytes: ");
        for (byte b : byteArray) {
            System.out.print(b + " "); // byte values of "Hello, World!"
        }
        System.out.println();

        // static String format(String format, Object... args)
        System.out.println("format: " + String.format("My name is %s and I'm %d years old.", "John", 30)); // "My name is John and I'm 30 years old."

        // boolean equalsIgnoreCase(String anotherString)
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(anotherStr)); // true

        // boolean equals(Object anObject)
        System.out.println("equals: " + str.equals(anotherStr)); // false

        // boolean endsWith(String suffix)
        System.out.println("endsWith: " + str.endsWith(suffix)); // true

        // boolean contains(CharSequence s)
        System.out.println("contains: " + str.contains("World")); // true

        // String concat(String str)
        System.out.println("concat: " + str.concat(" How are you?")); // "Hello, World! How are you?"

        // int compareTo(String anotherString)
        System.out.println("compareTo: " + str.compareTo(anotherStr)); // Positive because "H" > "h"

        // char charAt(int index)
        System.out.println("charAt: " + str.charAt(4)); // 'o'
    }
}
