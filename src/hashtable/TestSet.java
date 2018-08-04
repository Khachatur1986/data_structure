package hashtable;

/**
 * Created by Khach on 04-Aug-18.
 */
public class TestSet {
    public static void main(String[] args) {
        int bucketSize = 6;
        HashSet hashSet = new HashSet(bucketSize);

        System.out.println(hashSet.add("Valod"));
        System.out.println(hashSet.add("Valodik"));
        System.out.println(hashSet.add("Valodchik"));
        System.out.println(hashSet.add("Valodnchik"));
        System.out.println(hashSet.add("Valod"));
        System.out.println(hashSet.add("Sona"));
        System.out.println(hashSet.add("Sonik"));
        System.out.println(hashSet.add("Sonchik"));
        System.out.println(hashSet.add("Sonchka"));
        System.out.println(hashSet.add("Sona"));

        System.out.println("Size is " + hashSet.size());

        System.out.println("hashSet.remove(\"Valod\") " + hashSet.remove("Valod"));
        System.out.println("hashSet.remove(\"Sonik\") " + hashSet.remove("Sonik"));

        System.out.println(hashSet.size());

        System.out.println("hashSet.contains(\"Sonchka\") " + hashSet.contains("Sonchka"));

    }
}
