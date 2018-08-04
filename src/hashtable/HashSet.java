package hashtable;

/**
 * A hash set stores an unordered collection of objects, using a hash table
 */
public class HashSet {

    private Link[] buckets;
    private int size;

    /**
     * initialize buckets array
     * @param bucketSize is length buckets array
     */
    public HashSet(int bucketSize) {
        buckets = new Link[bucketSize];
        size = 0;
    }

    /**
     * @param obj
     * @return true if obj added to buckets, false if element already exist
     */
    public boolean add(Object obj) {
        int objHashCode = obj.hashCode();
        if (objHashCode < 0) {
            objHashCode = -objHashCode; //make unsigned
        }
        objHashCode = objHashCode % buckets.length; //find bucket index of element by hashcode and bucket size

        Link current = buckets[objHashCode];

        // Each Link object contains Link obj inside, we should iterate each element inside link object
        // and check if element already exist
        while (current != null) {
            //obj should override hashcode and equals method
            if (current.data.equals(obj)) {
                return false; // already element in the set exist
            }
            current = current.next;
        }

        //Create new Link obj and add to buckets
        Link newLinkObj = new Link();
        newLinkObj.data = obj;
        newLinkObj.next = buckets[objHashCode];
        buckets[objHashCode] = newLinkObj;
        size++;
        return true;
    }

    public boolean remove(Object obj) {
        int objHashCode = obj.hashCode();
        if (objHashCode < 0) {
            objHashCode = -objHashCode; //make unsigned
        }
        objHashCode = objHashCode % buckets.length;

        Link current = buckets[objHashCode];

        Link previous = null;

        while (current != null) {
            if (current.data.equals(obj)) { //check if object exist
                if (previous == null) {
                    buckets[objHashCode] = current.next; //remove existing object
                } else {
                    previous.next = current.next; ////remove existing object
                }
                size--;
                return true;
            }
            previous = current; // check each element on link.next
            current = current.next;
        }
        return false;
    }

    public boolean contains(Object obj) {
        int objHashCode = obj.hashCode();
        if (objHashCode < 0) {
            objHashCode = -objHashCode; //make unsigned
        }
        objHashCode = objHashCode % buckets.length;

        Link current = buckets[objHashCode];
        while (current != null) {
            if (current.data.equals(obj)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private class Link {
        public Object data;
        public Link next;
    }
}
