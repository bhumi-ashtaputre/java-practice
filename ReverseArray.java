public class ReverseArray {

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArr(int arr[]){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){

        int arr[]={1,3,4,6,7,2,9};

        reverse(arr);
        printArr(arr);

    }
}
