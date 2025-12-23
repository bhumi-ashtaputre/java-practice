public class PrefixSum {

    public static int[] buildPrefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        return prefix;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {2, 4, 1, 3};
        int prefix[] = buildPrefixSum(arr);
        System.out.print("Prefix sum array: ");
        printArray(prefix);

    }
}
