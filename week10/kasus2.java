/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

/**
 *
 * @author Bendra
 */
import java.util.*;
import java.io.*;
public class kasus2 {
    public static void main(String[] args){
  String nama; 
  double rata; 

  int[] nilai = new int[100]; 
  Scanner input = new Scanner(System.in) 

  
  System.out.print("Nama : ");
  nama = input.nextLine();

  System.out.print("Jumlah MK: ");
  double jml = input.nextInt();

  
  int sum = 0; 
  for (int i=1; i<= jml ;i++ ) {
   try{
    System.out.print("Nilai MK"+i+": "); 
    nilai[i] = input.nextInt(); 
    sum += nilai[i]; 
   } catch (Exception e){
    e.printStackTrace();
    break;
   }
  }

  rata = sum/jml; 
  int jmls = (int)(jml); 

  
  
  System.out.println("dengan rata-rata= "+rata); 
 }
}
    
    

