import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
/**
   A menu from the vending machine.
*/
public class commandline
{    
   private Scanner in;
   ArrayList<Property> propertylist = new ArrayList<Property>();
   public commandline(int ownerNumber)
   {
      in = new Scanner(System.in);
   }

   public void run(Property machine)
         throws IOException
   {
      boolean more = true;
      while (more)
      { 
         System.out.println("command list: /n my payments /n property payments /n owner payments /n");
         System.out.println("type help to show explanation of commands");
         String command = in.nextLine().toUpperCase();

         if (command.equals("my payments"))
         {  
         }
         else if (command.equals("property payments"))
         { System.out.println("enter address or postcode");
           String property = in.nextLine();  
            for(Property p : propertylist){
                if((p.address == property) || (p.postcode == property)){
                    System.out.println(p.payments.toString());
                }
            }
         }
         else if (command.equals("owner payments"))
         {  System.out.println("enter address or postcode");
           String owners = in.nextLine();  
            for(Property p : propertylist){
                if(p.owners.toString() == owners){
                    System.out.println(p.payments.toString());
                }
            }
            
         }
         else if (command.equals("overdue payments"))
         {              
            
         }
         else if (command.equals("Area pay statistics"))
         {  
            
         }
         else if (command.equals("test tax changes"))
         { for(Property p : propertylist){
                
            }
           
         }
          else if (command.equals("help"))
         { 
          System.out.println("figure it out");
         }
      }
   }

   private Object getChoice(Object[] choices)
   {
      while (true)
      {
         char c = 'A';
         for (Object choice : choices)
         {
            System.out.println(c + ") " + choice); 
            c++;
         }
         String input = in.nextLine();
         int n = input.toUpperCase().charAt(0) - 'A';
         if (0 <= n && n < choices.length)
            return choices[n];
      }      
   }
}
