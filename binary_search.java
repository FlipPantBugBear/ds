import java.util.*;
public class binary_search {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = s.nextInt();
        int[] n = new int[a];
        System.out.println("Enter the elements in the array : ");
        for(int i=0;i<a;i++){
            n[i] = s.nextInt();
        }
        System.out.println("sorted array");
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) { 
                if (n[j] < n[i]) {
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println("The sorted array:");
        for (int j = 0; j < a; j++) {
            System.out.println(n[j]);
        } 
        // System.out.println("Enter the number to be searched");
        // int d = s.nextInt();
        // int low =0,top=a-1;
        // while(low <= top){
        //     int mid = (low+top)/2;
        //     if(n[mid] == d){
        //         System.out.println("Number found "+mid);
        //         break;
        //     }
        //     else if(n[mid] < d){
        //         low = mid+1;
        //         System.out.println("Number : "+n[mid]);
        //         break;
        //     }
        //     else{
        //         low = mid-1;
        //     }
        // }        
        // System.out.println("Enter the number to be searched : ");
        // int b = s.nextInt();
        // int mid=0;
        // for(int i=0;i<a;i++){
        //     mid = n[i]/2;
        // }
        // for(int i=0;i<a;i++){
        //     if(b > mid){
        //         for(int j=mid;j>a;j++){
        //             if(n[i]==b){
        //                 System.out.println("IS in array"+n[j]);
        //             }
        //         }
        //     }
        // }
    } 
}
