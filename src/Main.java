class Main{

public static void reverseArray(int[] arr) {
    int start = 0;
    int end  = arr.length - 1;
    while (start < end) {
       int temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;
       start++;
       end --;
    }
}
public static void main(String[] args) {
    int[] i = {1,2,3,4,5};
    reverseArray(i);
    for(int x=0; x<i.length; x++){
        System.out.print(i[x] +" ");
    }
}
}
