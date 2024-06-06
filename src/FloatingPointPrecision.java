public class FloatingPointPrecision {
    public static void main(String[] args) {
        int myIntValue = 5; float myFloatValue = 5f; double myDoubleValue = 5d;

        myIntValue = 5 / 2;
        System.out.println(myIntValue); // Since myIntValue is Integer, the decimal point will not get produced

        myFloatValue = 5f / 2f;
        System.out.println(myFloatValue); // Because we added the 'f' wrapper, Java will produce the float value

        myDoubleValue = 5d / 2d;
        System.out.println(myDoubleValue);

        myIntValue = 5 / 3;
        System.out.println(myIntValue); // Since we're working with an Integer, the decimals will get truncated to 1

        myFloatValue = 5f / 3f;
        System.out.println(myFloatValue); // Prints 7 decimal places => 1.6666666

        myDoubleValue = 5d / 3d;
        System.out.println(myDoubleValue); // Double is more precise than a float value so will output a more precise decimal point

        myDoubleValue = 5.00 / 3;
        System.out.println(myDoubleValue); // Java is able to interpret the double value being used, the 5.00 to be used a double value

//        myFloatValue = 5.00 / 3f;
//        System.out.println(myFloatValue); // You cannot assign a double value to a float value. Double should be used over float due to precision and faster processing of a double than a float

        double numOfPounds = 200;
        double kiloConversion = numOfPounds * 0.45359237;
        System.out.println("Converted Kilograms = " + kiloConversion);

        double pi = 3.1415827d;
        double anotherNumber = 3_000_000.4_567_890d; // We can use underscore to represent commas
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
