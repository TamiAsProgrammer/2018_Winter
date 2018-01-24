/**
 * Write a description of class Message here.
 * 
 * @author (Liu Teng - 3086750) 
 * @version (Jan.22.2018)
 */

import java.util.*;

public class Message
{

    private String recipient;
    private String sender;
    private String body;

    // constructors
    public Message()
    {
        recipient = "";
        sender = "";
        body = "";
    }

    // constructors - accepts recipient and sender as parameter
    public Message(String recipient, String sender)
    {
        this.recipient = recipient;
        this.sender = sender;
    }

    // the content text setter
    public void setBody(String body)                    
    {
        this.body = body;
    }

    // add one more line to the body
    public void append(String extraLine)                
    {
        body = body + "\n" + extraLine;
    }

    public String toString()
    {
        return "\nFrom: " + sender + "\nRecipient: " + recipient + "\nText: \n" + body;
    }
}
