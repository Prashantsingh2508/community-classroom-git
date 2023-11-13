 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class RecursionLoopPractice {

    public static void main(String args[]) {
            
            String str="abc",temp="";
            
            rec(str,temp);
        
        
    }
    public static void rec(String str,String temp){
    
        if(temp.length()==str.length()){
            System.out.println(temp);
            return;
        }
        
        
        for(int i=0;i<str.length();i++){
                System.out.println("--->"+i);
                    rec(str,temp+str.charAt(i));
        }
    
    }

}
