# Space Complexity

**Objective**

In this project, we will learn how to improve the space complexity.

**Problem**

Enhance a function with Improved Space Complexity.

**Implementation**


```java
public class ArrayDuplicates {
    public static boolean containsDuplicates(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
```
