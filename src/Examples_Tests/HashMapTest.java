package Examples_Tests;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {

        // 1. Create HashMap
        Map<String, Integer> bag = new HashMap<>();

        // 2. Add itens (put) -> Complexity O(1)
        bag.put("Pen", 1);
        bag.put("Pencil", 1);
        bag.put("Book", 15);

        // Change the value of the key (Book)
        bag.put("Book", 20);

        // 3. Get a value from a key (get) -> Complexity O(1)
        System.out.println("How many books I have? " + bag.get("Book"));

        // Not a valid key = NULL return
        System.out.println("Do I have rubbers? " + bag.get("Rubber"));

        // 4. Verification of valid Key (containsKey) -> Complexity O(1)
        if (bag.containsKey("Pencil")) {
            System.out.println("Lets write some stuff!");
        }

        // 5. Remove an item (remove) -> Complexity O(1)
        bag.remove("Pencil");

        // 6. See the size (size (2)) -> Complexity O(1)
        System.out.println("Different types of objects: " + bag.size());

        // 7. Go Through all HashMap (Iterate with entrySet) -> Complexity O(n)
        System.out.println("\n--- My School Bag ---");
        for (Map.Entry<String, Integer> item : bag.entrySet()) {
            System.out.println("- " + item.getKey() + ": " + item.getValue());
        }
        // Note: The order of the Bag is most likely be different from the "input" order.
    }
}
