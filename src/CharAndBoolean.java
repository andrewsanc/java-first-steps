public class CharAndBoolean {
    public static void main(String[] args) {
        /*
            char
                - Holds one, and only one, character
                - Literal enclosed in Single Quotes
            String
                - Can hold multiple characters
                - Literal enclosed in Double Quotes
         */

        char myChar = 'D';
        String myString = "Hello World";

//        char mySecondChar = 'DD', Throws an error due to char only allowing a single character

        char unicodeChar = '\u0044';
        System.out.println(unicodeChar);
        // We can represent chars as Unicode, The above is unicode for the character 'D'

        // We can assign a char as a decimalCode with the following
        char myDecimalCode = 68;
        System.out.println(myDecimalCode);
        // ^ The following will print out character 'D'

        // * Challenge *
        /*
            - Create 3 char variables
                - mySimpleChar should be assigned the literal question-mark character '?'
                - myUnicodeChar should be assigned the unicode value for the question-mark '?'
                - myDecimalChar should be assigned the decimal value for question-mark '?'
            - Print all 3 variables in one statement, that starts with the label "My values are"
        */

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f';
        char myDecimalChar = 63;
        System.out.println("My values are: " + mySimpleChar + ", " + myUnicodeChar + ", " + myDecimalChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        // Example of boolean use
        boolean isOverTwentyOne = true;
        System.out.println(isOverTwentyOne);
    }
}
