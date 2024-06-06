public class FloatsAndDoubles {
    public static void main(String[] args) {
        System.out.println("Float value range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double value range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        int myIntValue = 5; float myFloatValue = 5; double myDoubleValue = 5;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

//        float myOtherFloatValue = 5.25;
//        ^ The following produces an error because 5.25 will be interpreted as a double value. To fix the error we would have to cast/implicit tell Java that it's a float value by doing 5.25 => 5.25f
    }
}
