
/**
 * Write a description of class BroomMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BroomMain
{
    public static void main(String[] args) {
      BroomName namesRepository = new BroomName();
      
      System.out.println("Iterator Pattern Outcome");
      System.out.println("--------------------------");
      int i=1;
      for(BroomIterator myit = namesRepository.getIterator(); myit.hasNext();){
         String brmName = (String)myit.next();
         System.out.println("Iteration :"+i);
         System.out.println("Broom Name : " + brmName);
         i++;
      } 	
   }
}
