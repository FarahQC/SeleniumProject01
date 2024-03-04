package switchcase;

public class SwitchExampleBreak {

    public static void main(String[] args) {
        int number = 50;
        switch (number) {
            case 10:
                System.out.println("Case 10");
                int a = 4;
                int b = 3;
                System.out.println(a + b);
                break;
            case 20:
                System.out.println("Case 20");
                break;
            case 30:
                System.out.println("Case 30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}



