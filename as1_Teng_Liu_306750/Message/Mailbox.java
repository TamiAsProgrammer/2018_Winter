/**
 * Write a description of class Mailbox here.
 * 
 * @author (Liu Teng - 3086750) 
 * @version (Jan.22.2018)
 */

import java.util.*;

public class Mailbox
{
    private ArrayList<Message> mailList;

    public Mailbox()
    {
        mailList = new ArrayList<Message>();
    }

    public void addMessage(Message m)
    {
        mailList.add(m);   
    }

    // idx must be the real index for arrayList, starts from 0
    public Message getMessageByIndex(int idx)     
    {
        return mailList.get(idx);
    }

    public ArrayList<Message> getAllMessageList()
    {
        return mailList;
    }

    // idx must be the real index for arrayList, starts from 0
    // * this removeMessage method will return the removed message object
    public Message removeMessage(int idx)         
    {
        Message removed = mailList.remove(idx);
        return removed;                         
    }

    // total message account, for user to choose to remove or view
    public int totalMessageNumber()
    {
        return this.mailList.size();
    }

}
