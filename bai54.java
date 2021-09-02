/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Non Sleeping
 */
public class bai54 {
    public static Scanner sc = new Scanner(System.in);
    public static boolean ktra(String s){
        StringBuilder st =new StringBuilder(s);
        return s.equals(st.reverse().toString());        
    }
    public static void main(String[] args){
        Map<String,Integer> m = new LinkedHashMap<>();
        int count = 0;
        while (sc.hasNext()){
            String s = sc.next();
            if(ktra(s)){
                count = Math.max(count, s.length());
                if(m.containsKey(s)){
                    int value = m.get(s)+1;
                    m.replace(s, value);
                }else{
                    m.put(s, 1);
                }
            }
        }
        System.out.println("ptit.bai54.main()");
        for(Map.Entry<String,Integer> enry: m.entrySet()){
            String k = enry.getKey();
            Integer value = enry.getValue();
            if(count == k.length()){
                System.out.println(k + " " + value);
            }
        }
    }
}
