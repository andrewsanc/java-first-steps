public class OperatorsOperandsAndExpressions {
    public static void main(String[] args) {
        /*
            Operators in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result
            Ex. long longTotal = 5000L + 10L * (byteValue + shortValue + intValue);

            Operands is a term used to describe any object that is manipulated by an operator.
            Ex. int myVar = 15 + 12;

            Expression is formed by combining variables, literals, method return values. They are a way of forming and combining those values to produce a result.
            The line below, 15 plus 12 is the expression, which returns 27.
            Ex. int myVar = 15 + 12;
         */

        // The following has two operators. '=' and '+'
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println(result);

        int previousResult = result;
        result = result - 1; // 3 - 1 = 2
        System.out.println(result);

        char firstChar = 'A';
        char secondChar = 'B';
        System.out.println(firstChar + secondChar);
        // The following outputs 131. When we use the addition operator with chars, it is these numbers in memory that get added together, the character values don't get concatenated

        System.out.println("" + firstChar + secondChar);
        // The following output 'AB'. By adding the "", Java will concatenate 'A' and 'B'

        result = 5;
        result = result % 3; // The remainder of (5 % 3) = 2

        // Review, the main operators are +, -, *, /, %
    }
}
