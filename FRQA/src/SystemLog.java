import java.util.List;
import java.util.ArrayList;

public class SystemLog
{
  private List<LogMessage> messageList;

  public SystemLog(String[] messages)
  {
    messageList = new ArrayList<LogMessage>();
    for (String s : messages)
      messageList.add(new LogMessage(s));
  }

  /* Part (c) */

  public List<LogMessage> removeMessages(String keyword)
  {
    List<LogMessage> removed = new ArrayList<LogMessage>();
    int i = 0;
    while(i < messageList.size())
    {
      LogMessage msg = messageList.get(i);
      if (msg.containsWord(keyword))
      {
        removed.add(msg);
        messageList.remove(i);
      }
      else
        i++;
    }
    return removed;
  }

  public String toString()
  {
    String s = "";
    for (LogMessage msg : messageList)
      s += msg + "\n";
    return s;
  }

}
