package operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a= 5;
        int b=10;
        int c=15;

        System.out.println(b>a && c>b);  //true
        System.out.println(b>a && b>c); // false because one of the condition is false
        System.out.println(a<b || a<c); // true
        System.out.println(a<b || b<a); // this one is also true, even though one of the condition is false. because in || it looks for only one condition to be true.
        System.out.println(a>b || a<c);
        System.out.println (!(a<b && b<c)); // even though both condition is true but because of logical not, it will reverse the value and make it false
    }
}
