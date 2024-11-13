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
        System.out.println("Enter the number to be searched");
        int d = s.nextInt();
        int mid=0;
        int low=0,top=a-1;
        while(low <= top){
            mid = (low+mid)/2;
            if(n[mid] == d){
                System.out.println("number found"+mid);
                break;
            }
            else if (n[mid] < d) {
                low = mid-1;
                System.out.println("Found"+n[mid]);
                break;
            }
            else{
                top = mid+1;
            }
        }
    } 
}
