import java.util.Scanner;

public class arrayascend {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);     
        
        System.out.println("Enter the size of the array:");
        int a = s.nextInt();
        int[] n = new int[a];
        
        System.out.println("Enter numbers in the array:");
        for (int i = 0; i < a; i++) {
            n[i] = s.nextInt();
        }
        
        
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
        
        s.close();
    }
}
