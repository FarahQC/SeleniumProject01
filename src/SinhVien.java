public class SinhVien {
    //Biến Static
    public static String ten = "Lê Thị Vân";

    //Biến non-static
    public  int age = 25;
    public void showInfo(){
        System.out.println(age);
        System.out.println(ten);
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        System.out.println(ten);
        System.out.println(sv.age);



    }
}
