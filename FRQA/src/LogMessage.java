public class LogMessage
{
  private String machineId;
  private String description;

  /* Part (a) */

  public LogMessage(String message)
  {
    int i = message.indexOf(":");
    machineId = message.substring(0, i);
    description = message.substring(i+1);
  }

  /* Part (b) */

  public boolean containsWord(String keyword)
  {
    return (" " + description + " ").indexOf(" " + keyword + " ") >= 0;
  }

/* Alternative solution:

  public boolean containsWord(String keyword)
  {
    int len = keyword.length();
    String d = description;
    while (true)
    {
      int i = d.indexOf(keyword);
      if (i < 0)
         return false;
      if ((i == 0 || d.substring(i-1, i).equals(" ")) &&
          (i == d.length() - len || d.substring(i + len, i + len + 1).equals(" ")))
            return true;
      d = d.substring(i + len);
    }
  }
*/

  public String getMachineId()
  { return machineId; }

  public String getDescription()
  { return description; }

  public String toString()
  {
    return getMachineId() + ":" + getDescription();
  }
}
