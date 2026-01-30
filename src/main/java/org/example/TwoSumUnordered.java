package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUnordered {
    public int []  twoSum(int [] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int remaining = target-arr[i];
            if(map.containsKey(remaining)){
                return new int []{map.get(remaining), i};
            }
            map.put(arr[i],i);
        }
        return  new int [] {};
    }
}
