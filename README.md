# Space Complexity

**Objective**

In this project, we will learn how to improve the space complexity.

**Problem**

Enhance the space complexity of `reverseArray` function.

**Implementation**

* Eliminate the creation of the new array.

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
> Create a fork of the project and submit a pull request containing your solution.

