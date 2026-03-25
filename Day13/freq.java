import java.util.*;
public class Freq{
    public static void main (String args[]){
        int arr[]= {1,1,2,34,53,53,6};
        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);  //if arr of i present then arr[i]+1

            }
            else{
                hm.put(arr[i],1);
            }
        }


        for(Map.Entry entry:hm.entrySet()){
            System.out.println("Element | Frequency");
            System.out.println(entry.getKey() + "   "+ entry.getValue());
        }
    }
}