/**
 * Write a description of class MailTesting here.
 * 
 * @author (Liu Teng - 3086750) 
 * @version (Jan.22.2018)
 */

import java.util.*;
import java.lang.*;

public class MailTesting
{
    public static void main(String[] args)
    {
        Mailbox mailbox = new Mailbox();                                // a Mailbox object for testing all the operations

        String operation = "";
        do
        {
            System.out.println("=============Mailbox=============");
            System.out.println("New Message(N)");
            System.out.println("Delete Message(D)");
            System.out.println("View Message(V)");
            System.out.println("List Message(L)");
            System.out.println("Quit(Q)");
            System.out.println("=================================");
            System.out.print("\nPlease input your selection: ");
            Scanner input = new Scanner(System.in);
            operation = input.next();
            switch(operation)                               // implement logic in each methods below
            {
                case "N": { newMessage(mailbox); break; }
                case "D": { deleteMessage(mailbox); break; }
                case "V": { viewMessage(mailbox); break; }
                case "L": { listMessage(mailbox); break; }
                case "Q": break;
            }
        } while (!operation.equals("Q"));

        System.out.println("Closing...");
    }

    public static void newMessage(Mailbox mailbox)
    {
        // require: New message - prompts the user to enter all message information
        String from = "";
        String to = "";
        String content = "";
        String textDoneMark = "DDD";                        // used when typing multiple line text Content finished!
        
        System.out.println("--------------New Message--------------");
        Scanner input = new Scanner(System.in);
        System.out.print("From: ");
        from = input.nextLine();
        System.out.print("To: ");
        to = input.nextLine();
        System.out.println("Content (multiple lines accept, type \"DDD\" to finish): ");
        String line = "";
        while(input.hasNextLine())                          // content allow to be multiple lines
        {
            line = input.nextLine();
            if(line.equals(textDoneMark))
            {
                break;
            }
            line += "\n";
            content += line;
        }
        
        Message mail = new Message(to, from);               // new an object of Message, using all the information above
        mail.setBody(content);

        mailbox.addMessage(mail);                           // add the message object to the mailbox object

        System.out.println("------------Message Saved!--------------");
        System.out.println();
    }

    public static void deleteMessage(Mailbox mailbox)
    {
        // require: Delete message - prompts for the message index and deletes that message
        // *it will output the object that was removed to inform the user

        System.out.println("------------Delete Message-------------");
        System.out.printf("Please indicate the Index of Message to delete (1 to %s): ", mailbox.totalMessageNumber());
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        if(index > 0)
        {
            Message removed = mailbox.removeMessage(index - 1);                         // index -1 is the real-index to the arrayList
            System.out.printf("!!!Remove Done. The following message was removed:\n~~~~~~~~%s~~~~~~~~\n", removed.toString());
        }
        else
        {
            System.out.println("Invalid Index!");
        }

        System.out.println("----------Message Removed!-------------");
    }

    public static void viewMessage(Mailbox mailbox)
    {
        // require: View message - prompts for the message index and then displays the message
        System.out.println("------------View Message--------------");
        System.out.printf("Please indicate the Index of Message to View (1 to %s): ", mailbox.totalMessageNumber());
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        if(index > 0)
        {
            System.out.println("--------------------------");
            System.out.println(mailbox.getMessageByIndex(index - 1).toString());        // index -1 is the read-index to the arrayList
            System.out.println("--------------------------");
        }
        else
        {
            System.out.println("Invalid Index!");
        }
    }

    public static void listMessage(Mailbox mailbox)
    {
        // require: List messages - displays all messages
        System.out.println("---------List All Messages------------");
        ArrayList<Message> mailList = mailbox.getAllMessageList();
        for(int i = 0; i < mailList.size(); i++)
        {
            System.out.println();
            System.out.println("----Mail No." + (i+1) + "----" + mailList.get(i).toString());
        }
        System.out.println("Total mail: " + mailList.size());
        System.out.println("--------------------------------------");
    }

}
