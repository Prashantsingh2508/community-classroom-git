/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prash
 */
public class MaxSpread {
    
    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(4);
        
        int maxSpread =5;
        
        int end=0,cnt=0;
        for(int i=0;i<list.size();i++){
            
            if(list.get(i)> end){
            
                    cnt++;
                    end=list.get(i)+maxSpread;
            }
        
        }
        
        System.out.println(cnt);
    }
    
}
