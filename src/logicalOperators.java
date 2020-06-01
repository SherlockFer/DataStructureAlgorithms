/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class logicalOperators {
    	public static void main(String[] args) {
		int a=1;
                int b=2;
                int c=1;
                if(a==1 & c==1){
                    System.out.println("true & true " + "true");
                }
                if(a==1 && c==1){
                    System.out.println("true && true " + "true");
                }
                if(a==1 & b==1){
                   
                }else{
                     System.out.println("true & false " + "false");
                }
                if(a==1 && b==1){
                   
                }else{
                     System.out.println("true && false " + "false");
                }
                
                if(a==1 | c==1){
                    System.out.println("true | true " + "true");
                }
                if(a==1 || c==1){
                    System.out.println("true || true " + "true");
                }
                if(a==1 | b==1){
                   System.out.println("true | false " + "true");
                }else{
                     
                }
                if(a==1 && b==1){
                   
                }else{
                     System.out.println("true || false " + "false");
                }
	}
        
        
//        boolean a, b;

//Operation     Meaning                       Note
//---------     -------                       ----
//   a && b     logical AND                    short-circuiting
//   a || b     logical OR                     short-circuiting
//   a &  b     boolean logical AND            not short-circuiting
//   a |  b     boolean logical OR             not short-circuiting
//   a ^  b     boolean logical exclusive OR
//  !a          logical NOT
//
//short-circuiting        (x != 0) && (1/x > 1)   SAFE
//not short-circuiting    (x != 0) &  (1/x > 1)   NOT SAFE
}
