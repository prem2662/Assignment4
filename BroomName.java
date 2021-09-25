
/**
 * Write a description of class BroomName here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BroomName implements BroomContainer {
   public String names[] = {"Smooth" , "Strong" ,"Long" , "Short"};

   @Override
   public BroomIterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements BroomIterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }		
   }
}