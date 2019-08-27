package datatypes;

public class DataTypesDec {

    // different types of data is declared in a variable;
    // we can define the it as a instance variable with class, but then we have to create object in main method to call them

    byte byteVar=-128;
    short shortVar= 30809;
    int intVar=-2147483648;
    long longVar=9000000000L;
    float floatVariable = 260000000f ; //Suffix with f for float //default = 0
    double doubleVariable = 23323342347657656.868; //default = 0
    char chararacterVariable = '#'; //default = null

    boolean isSick = false; //default = false

    public static void main(NonPrimitive[] args) {                 // or we can declare them here, so we do not need to create object to call the variables
        DataTypesDec testType= new DataTypesDec();
        System.out.println("byte value: " + testType.byteVar);
        System.out.println("short value: " + testType.shortVar);
        System.out.println("integer value: " + testType.intVar);
        System.out.println("long value: " + testType.longVar);
        System.out.println("floatvalue: " + testType.floatVariable);
        System.out.println("double value: " + testType.doubleVariable);
        System.out.println("char value: " + testType.chararacterVariable);
        System.out.println("boolean value: " + testType.isSick);


    }




}
