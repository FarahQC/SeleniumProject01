package phuongthuc;

public class LearnMethod {
    static {
        System.out.println("Khối static: hello !");
    }

    public void showInfo() {
        System.out.println("Automation Test");
        System.out.println("Selenium Java");
    }

    private static String getName() {
        String name = "Vân";
        return name;
    }

    private static int getAge() {
        int age = 40;
        return age;
    }

    protected String displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
        return name;
    }

    public static void main(String[] args) {
        LearnMethod obj = new LearnMethod();
        System.out.println(getName());
        System.out.println(getAge() + 10);
    }

    }


