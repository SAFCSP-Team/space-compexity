# Space Complexity

**Objective**

In this project, we will learn how to improve the space complexity.

**Problem**

Enhance a function with Improved Space Complexity to O(1).

**Implementation**

Enhance the function without using new array.
```java
public int[] reverseArray(int[] arr) {
    int[] reversed = new int[arr.length];
    int j = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
        reversed[j] = arr[i];
        j--;
    }
    return reversed;
}
```
> create a new issue to upload your answer.
