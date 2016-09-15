package devsPlane;

import java.util.Scanner;

public class Plane implements Flyable {


   public Plane() { }


   public void fly(){

      PlaneFunc func = new PlaneFunc() ;
      Scanner scan = new Scanner(System.in) ;


      System.out.println("\n>-->    Plane has took off    >-->\n");

      // DIRECTION
      System.out.println("Choose direction (N - north, S - south, E - east, W - west):");


   }
   // fly
}
// class