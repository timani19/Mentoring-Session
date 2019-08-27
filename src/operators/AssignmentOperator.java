package operators;

public class AssignmentOperator {    //used to assign value
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=2;
        int d = 4;
        System.out.println(a+b+c);
        System.out.println(c+=a);    // c=c+a=2+10=12
        System.out.println(c-=a);    // c=c-a,  12-10 = 2   //here c value is 12, because it will run previous statement where c=12
        System.out.println(d-=a);    // d=d-a, 4-10= -6
        System.out.println(c*=a);   // c is now 2 from line 11, c=c*a, 2*10= 20;
        System.out.println(c/=a);    // c is now 20, c=c/a; 20/10=2
        System.out.println(a+=4);
        System.out.println(a-=4);
        System.out.println(a*=4);
        System.out.println(a/=4);
        System.out.println(a%=4);



    }
}
