import java.util.*;
public class array {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = s.nextInt();
        int[] n = new int[a];
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<a;i++){
            n[i] = s.nextInt();
        }
        System.out.println("Arrays are ");
        for(int i=0;i<a;i++){
            System.out.println(n[i]);
        }
    }
}