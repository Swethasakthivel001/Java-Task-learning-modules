import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {

    private Map<Integer, String> cache;

    public Cache() {
        cache = new LinkedHashMap<>();
    }

    public void addData(int key, String value) {
        cache.put(key, value);
        System.out.println("Data added successfully!");
    }

    public void displayCache() {

        if (cache.isEmpty()) {
            System.out.println("Cache is empty.");
            return;
        }

        System.out.println("\nCache Contents:");

        for (Map.Entry<Integer, String> entry : cache.entrySet()) {
            System.out.println(
                "Key: " + entry.getKey()
                + ", Value: " + entry.getValue()
            );
        }
    }

    public void getData(int key) {

        if (cache.containsKey(key)) {
            System.out.println("Cached Value: " + cache.get(key));
        } else {
            System.out.println("Data not found in cache.");
        }
    }
}
