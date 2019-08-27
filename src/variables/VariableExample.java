package variables;

public class VariableExample {
        static int num1=20;               // static varibale/ independent/ can be access from any class/ methods
        int num2=25;                      //instance variable// can only access from other class/methods if we create a object of the class
        int num3=30;                      // cannot access a non-static variable from a static method. so always create object of the class

        public int addition(int num2, int num3){
            int result= num1+num2;
            return result;
        }
        public int substraction(){            // loal variable/ cannot be accesses outside the method, we cannot call num4, num5 in our TestVar
            int num4=30;
            int num5=40;
            int result=num5-num4;
            return result;



        }

    }


