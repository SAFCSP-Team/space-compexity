class Main{

public static int[] reverseArray(int[] arr) {
    int n = arr.length;
        
    int[] reversed = new int[n];

    for (int i = 0; i < n; i++){
    reversed[i] = arr[n - i - 1];}

    return reversed;
}
public static void main(String[] args) {
    int[] i = {1,2,3,4,5};
    int[] reversed = reverseArray(i);
    for(int x=0; x<reversed.length; x++){
        System.out.print(reversed[x] +" ");
    }
}
}
