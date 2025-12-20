public class MinMaxSingleTraversal{

    public static void findMinMax(int arr[]){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum value : "+min);
        System.out.println("Maximum value : "+max);
    }
     
    public static void main(String args[]){

        int[] arr = {4, 2, 9, 1, 7, 6};

        findMinMax(arr);

    }
}