# Space Complexity

**Objective**

In this project, we will learn how to improve the space complexity.

**Problem**

Enhance a function with Improved Space Complexity.

**Implementation**


```java
public class ArrayDuplicates {
    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
```
