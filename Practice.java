import java.util.*;
public class Practice{

    public static void maximumElement(int arr[]){
        int n = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > n){
                n = arr[i];
            }
        }

        System.out.println("Maximum element is : "+n);
        
    }

    public static void minimumElement(int arr[]){

        int n = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < n){
                n = arr[i];
            }
        }

        System.out.println("Minimum element is : "+n);
    }

    public static void sum(int arr[]){

        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum of all array elements is : "+sum);
    }

    public static void reverse(int arr[]){

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void search(int arr[]){

        System.out.println("\nEnter the value to search:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                System.out.println("Value found");
                return;
            }
        }

    }

    public static void occurence(int arr[]){

        int count = 0;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0 ; i<arr.length; i++){
            if(n == arr[i]){
                count++;
            }
        }
        System.out.println("Occurence: "+count);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1,4,2,5,6};

        maximumElement(arr);
        minimumElement(arr);
        sum(arr);
        reverse(arr);
        search(arr);
        occurence(arr);
    }
}