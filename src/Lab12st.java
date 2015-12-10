// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.Scanner;
import java.util.ArrayList;

public class Lab12st
{
   public static void main(String[] args)
   {
      MagpieLab12a maggie = new MagpieLab12a();

      System.out.println (maggie.getGreeting());
      Scanner in = new Scanner (System.in);
      String statement = in.nextLine();

      while (!statement.equals("Bye"))
      {
         System.out.println (maggie.getResponse(statement));
         statement = in.nextLine();
      }
   }
}


class MagpieLab12a
{
   public String getGreeting()
   {
      return "Hello, let's talk.";
   }
   public String getResponse(String statement)
   {
	  ArrayList responses = new ArrayList();
      String response = "";
      if (statement.indexOf("no") >= 0)
      {
         response = "Why so negative?";
      }
      else if (statement.indexOf("mother") >= 0
            || statement.indexOf("father") >= 0
            || statement.indexOf("sister") >= 0
            || statement.indexOf("brother") >= 0
    	    || statement.indexOf("parent") >= 0
    	    || statement.indexOf("family") >= 0)
      {
    	  final int number_OF_RESPONSES = 10;
          double R = Math.random();
          int whichResponse = (int)(R * number_OF_RESPONSES);
    	  responses.add("Tell me more about your family");
    	  responses.add("Your father sounds like a nice man");
    	  responses.add("I would love to meet your family one day");
    	  responses.add("Did you see them on Thanksgiving?");
    	  responses.add("How old is your father?");
    	  responses.add("How old is your mother");
    	  responses.add("How old is your sister?");
    	  responses.add("Are you going to be with your family for Christmas");
    	  responses.add("How many people are in your family");
    	  responses.add("That sounds really awesome");
          response =(String) responses.get(whichResponse);
      }
      else
      {
         response = getRandomResponse();
      }
      return response;
   }

   private String getRandomResponse()
   {
	  String[] Responses = new String[10];
      final int NUMBER_OF_RESPONSES = 10;
      double r = Math.random();
      int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
      Responses[0] = "Interesting, tell me more.";
      Responses[1] = "Hmmm.";
      Responses[2] = "Do you really think so?";
      Responses[3] = "You don't say.";
      Responses[4] = "How is it going?";
      Responses[5] = "I wish I could go to Europe";
      Responses[6] = "My favorite food is pizza";
      Responses[7] = "My favorite sport is soccer";
   	  Responses[8] = "How is school going for you?";
      Responses[9] = "I love to go swimming in the summer";
      
      return Responses[whichResponse];
   }
}
