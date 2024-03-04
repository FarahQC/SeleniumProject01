package LearnCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    //Thuộc Interface List

    public static void main(String[] args) {
        //Khai báo và khởi tạo đối tượng ArrayList
        List<String > ListMenu = new ArrayList<String>();
        //ArrayListList<String> ListMenu = new ArrayList<String>();

        //Thêm phần tử vào bộ ArrayList
        ListMenu.add("Home");
        ListMenu.add("Client");
        ListMenu.add("Project");
        ListMenu.add("Task");
        ListMenu.add("Selenium");
        ListMenu.add("Home");



        //Tính độ dài của ArrayList - dùng hàm size()
        System.out.println("Độ dài ArrayList: " + ListMenu.size());

        //Xóa 1 phần tử
        ListMenu.remove(2);

        //Set giá trị mới cho phần tử ở vị trí thứ 1 (bắt đầu từ 0)
        ListMenu.set(1, "Automation");

        //Tìm kiếm giá trị
        System.out.println(ListMenu.contains("Automation"));

        //Lấy giá trị phần tử - dùng for, foreach, interator
        for (int i = 0; i < ListMenu.size(); i++) {
            System.out.println(ListMenu.get(i));
        }
        for (String obj : ListMenu) {
            System.out.print(obj + ", ");
        }

        System.out.println("");
        System.out.println("---------------");
        Iterator<String> interator = ListMenu.iterator();
        while (interator.hasNext()) {
            System.out.print(interator.next() + ", ");
        }

        //Coppy phần tử của list1 sang list2
        //List 1: ListMenu
        //List 2: tempMenu
        ArrayList<String> tempMenu = new ArrayList<String>();

        tempMenu.addAll(ListMenu);

        System.out.println("");
        System.out.println("----------");
    }




    }

