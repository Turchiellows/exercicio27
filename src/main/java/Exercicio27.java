// IMPORTS

import java.util.Random;
import java.util.Scanner;

public class Exercicio27 {

   public static void main(String[] args) {
      // INSTANTIATE
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();

      // DECLARATE
      int size = 20;
      int limit = 50;
      int db[] = new int[size];
      int search;
      boolean ok = false;

      for (int i = 0; i < size; i++) {
         db[i] = rand.nextInt(limit);
      }

      // COLLECT DATA
      System.out.print("Number to search : ");
      search = sc.nextInt();

      // OUTPUT
      System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
      System.out.println("+ DATABASE");
      System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
      for (int i = 0; i < size; i++) {
         System.out.print(db[i] + " ");
      }
      System.out.println("\n\n");

      for (int i = 0; i < size; i++) {
         if (db[i] == search) {
            System.out.println(db[i] + " found at index " + i);
            ok = true;
            break;
         }
      }

      if (ok == false) {
         System.out.println(search + " not found");
      }
   }
}
