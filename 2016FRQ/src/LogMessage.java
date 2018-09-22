public class LogMessage
{
  private String machineId;
  private String description;

  /* Part (a) */

  public LogMessage(String message)
  {
	  int colon = message.indexOf(":");
	  machineId = message.substring(0, colon);
	  description = message.substring(colon +1);
	  
  }

  /* Part (b) */

  public boolean containsWord(String keyword)
  {
   return (" "+description+" ").indexOf(" "+keyword+" ") >=0;
  }



  public String getMachineId()
  {
	  return machineId;
  }

  public String getDescription()
  { 
	  return description;
  }

  public String toString()
  {
	  return getMachineId() + ":" + getDescription();
  }
}
