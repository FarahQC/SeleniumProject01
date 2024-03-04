package dieukienifelse;

import java.sql.SQLOutput;

public class LearnDieuKien_IF_ELSE_IF {
    public static void main(String[] args) {
//        int DTB = 4;
//
//        if (DTB > 8) {
//            System.out.println("Xuất sắc");
//        } else if (DTB == 8) {
//            System.out.println("giỏi");
//        } else if (DTB < 8 && DTB >= 7) {
//            System.out.println("Khá");
//        } else if (DTB < 7 && DTB >=5) {
//            System.out.println("Trung Bình");
//        } else {
//            System.out.println("Yếu");
//        }
    // Automation

        String message = "Lấy từ Website";
        
        if (message == "Please fill value"){
            System.out.println("Chưa điền email");
        } else if (message == "Please include in @...") {
            System.out.println("format email chưa đúng");
        } else if (message == "Please enter a part following @...") {
            System.out.println("format email chưa đúng");
        }else  {
            System.out.println("Điền email thành công");
        }
    }

    }
