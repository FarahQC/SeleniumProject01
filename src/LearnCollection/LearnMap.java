import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", "XP");

        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);
        System.out.println("");
        System.out.println("---------------");
        System.out.println(hashMap.get("Window"));
    }
}
