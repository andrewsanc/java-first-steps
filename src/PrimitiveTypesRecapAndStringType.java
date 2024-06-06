public class PrimitiveTypesRecapAndStringType {
    public static void main(String[] args) {
        /*
            * Commonly used primitive date types
            Whole number
                - byte, short, *int*, long
            Real Number(Floating point or decimal)
                - float, *double*
            Single character
                - char
            Boolean value
                - *boolean*
         */

        /*
            A String is a built-in class that contains a sequence of characters.
            Strings are also immutable. but the StringBuilder is mutable;
         */

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString); // We concatenate two strings, which will output "250.5549.45"

//        int myInt = "10";
        // ^ The above throws an error because we are assigning a string to an integer value

        String lastString = "10"; int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString); // The addition symbol, acts as addition as well as a concatenate operator. The output is "1050"


    }
}
