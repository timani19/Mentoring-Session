package controlflow;

public class LoopingStatments {
    public static void main(String[] args) {
        for (int i = 5; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

    }
}