public int[] reverseArray(int[] arr) {
    int[] reversed = new int[arr.length];
    int j = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
        reversed[j] = arr[i];
        j--;
    }
    return reversed;
}
