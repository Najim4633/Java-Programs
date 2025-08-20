

import java.util.*;
public class CollectionAddDemo {
public static void main(String[] args) {
// 1. Using ArrayList (allows duplicates, insertion order preserved)
Collection<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Apple"); // duplicate allowed
System.out.println("ArrayList: " + list);
// 2. Using HashSet (no duplicates, unordered)
Collection<String> set = new HashSet<>();
set.add("Apple");
set.add("Banana");
boolean added = set.add("Apple"); // duplicate not added
System.out.println("HashSet: " + set);
System.out.println("Was 'Apple' added again? " + added);
// 3. Using TreeSet (no duplicates, sorted order)
Collection<Integer> treeSet = new TreeSet<>();
treeSet.add(30);
treeSet.add(10);
treeSet.add(20);
System.out.println("TreeSet: " + treeSet); // Sorted: [10, 20, 30]
// 4. NullPointerException example
try {
Collection<Integer> tree = new TreeSet<>();
tree.add(null); // TreeSet does not allow null
} catch (Exception e) {
System.out.println("Error: " + e);
}
}
}