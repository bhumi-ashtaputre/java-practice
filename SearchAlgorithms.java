public class SearchAlgorithms {

    public static int linearSearch(int arr[], int key){

        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key){

        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == key){
                return mid;
            } else if(arr[mid] < key){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return -1;
    }
    
    public static void main(String args[]){

        int[] arr = {1, 3, 5, 7, 9};

        int key = 7;

        int linearResult = linearSearch(arr, key);
        int binaryResult = binarySearch(arr, key);

        System.out.println("Linear Search index : "+linearResult);
        System.out.println("Binary Search index : "+binaryResult);
    }
}
