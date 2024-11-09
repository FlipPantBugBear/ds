import java.util.*;
public class linear_search {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int a = s.nextInt();
        int[] n = new int[a];
        System.out.println("enter the numbers in the array :");
        for(int i=0;i<a;i++){
            n[i] = s.nextInt();
        }
        System.out.println("enter the number to be searched :");
        int b = s.nextInt();
        for(int i=0;i<a;i++){
            if(n[i]==b){
                System.out.println("The elment found "+b);                        
            }
        }     
        s.close();
    }
}
