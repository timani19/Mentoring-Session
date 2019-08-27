package variables;

public class TestVar {
    public static void main(String[] args) {
        System.out.println(VariableExample.num1);
        VariableExample myVariable=new VariableExample();
        System.out.println(myVariable.addition(25, 30));
        System.out.println(myVariable.substraction());
        System.out.println(myVariable.num2);

        //System.out.println(myVariable.num5); // num5 is local variable, cannot call this variable here.

    }
}
