import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class work16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);

        System.out.println("Initial HashMap:");
        System.out.println(map);

        System.out.println("Enter the threshold value:");
        int threshold = scanner.nextInt();

        removeKeysLessThanValue(map, threshold);

        System.out.println("HashMap after removing keys with values less than " + threshold + ":");
        System.out.println(map);
    }

    public static void removeKeysLessThanValue(HashMap<String, Integer> map, int threshold) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if (entry.getValue() < threshold) {
                iterator.remove();
            }
        }
    }
}

