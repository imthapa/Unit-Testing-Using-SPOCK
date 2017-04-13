package coreJavaTesting;

import java.util.HashMap;

/**
 * Created by ishwar on 14/3/17.
 * Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
*/
public class Question2 {
    public static void main(String[] args) {
        String str = "ishwar mani thapa is my name, ishwar";
        String arr[] = str.split(" ");
        System.out.println(new Question2().duplicateWords(arr));
    }

    public HashMap<String,Integer> duplicateWords(String arr[]){
        HashMap<String, Integer> hashMap = new HashMap();
        for (String key : arr) {
            if (!hashMap.containsKey(key))
                hashMap.put(key, 1);
            else {
                int val = (Integer) hashMap.get(key);
                hashMap.put(key, ++val);
            }
        }
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) > 1)
                System.out.println(key + " : " + hashMap.get(key));
        }
        System.out.println(hashMap);

        return hashMap;

    }
}
