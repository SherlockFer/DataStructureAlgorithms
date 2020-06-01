/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author user
 */
public class divisionEntreTiposNumeros {

 // method with byte inputs
 public void add(byte b1, byte b2) {
  System.out.println("BYTE addition result is : " + (b1 + b2));
 }
 // method with int inputs
 public void add(float f1, float f2) {
  System.out.println("FLOAT addition result is : " + (f1 + f2));
 }

 public static void main(String[] args) {
  // we will call the add method with int values
  //there is no method which accepts int values
  divisionEntreTiposNumeros te = new divisionEntreTiposNumeros();
  int a = 10, b = 10;
  te.add(a, b);
 }
}
    

