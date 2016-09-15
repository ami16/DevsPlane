package devsPlane;


public class PlaneFunc {

   public boolean isTarget(char tar){
      boolean is = false ;
      switch (tar){
         case '1' :case '2' :case '3':
            is = true ; break;
      }
      return is;
   }

   // Not created yet. Random used instead
   public String getTargetsFromDirection(char dir){
      // N
      // S
      // E
      // W
      switch( Character.toLowerCase(dir) ){ case 'n': }
      return "" ;
   }

   public void sayBye(){ System.out.println("Ok, see ya."); }
   public void sayReturning(){ System.out.println("Plane returns back home (suppose it's so...)"); }
}