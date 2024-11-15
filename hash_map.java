
//FIND THE SUM OF GIVEN TARGET(HOW MANY PAIRS CAN COME BY ADDING) FROM THE ARRAY

import java.util.*;
public class hash_map {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap(); //1st integer is key, and other one is value
        System.out.println("Enter the size of the Array :");
        int a = s.nextInt();
        int[] n = new int[a];
        System.out.println("Enter the elements : ");
        for(int i=0;i<a;i++){
            n[i] = s.nextInt();
        }
        System.out.println("Enter the target :");
        int target = s.nextInt();
        for(int i=0;i<a;i++){
            int check = target - n[i];
            if(map.containsKey(check)){                     
                System.out.println("Pair found: " + n[i] + " and " + check);
            }
            map.put(n[i],i);
        }       
    }
}

// Time complexity : O(n)

// put(key, value): Add or update a key-value pair in the map.
// get(key): Retrieve the value associated with a key.
// getOrDefault(key, defaultValue): Return the value if the key exists, otherwise return the default value.
// containsKey(key): Check if a key exists in the map.
