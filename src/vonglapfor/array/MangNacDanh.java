package vonglapfor.array;

public class MangNacDanh {
    public static void main(String[] args) {
        //Khai báo mảng nặc danh ko đầy đủ thông tin mảng (Đố dài cụ thể

        String menu[] = {"Home", "Employee", "Core HR", "Project"};

        //Duyệt mảng nặc danh
        for (String name : menu){
            System.out.println(name);
        }
    }
}
