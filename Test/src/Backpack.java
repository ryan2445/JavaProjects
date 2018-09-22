
//Niraek Jain-Sharma Period 4 AP Java
public class Backpack {
    private String textbook1;
    private String textbook2;
    private String pencil1;
    private String pencil2;
    private int weight; //pounds
    private String Brandname;
    private boolean zipped;
    
    public Backpack()  //Default constructor
	{
     	textbook1 = "";
     	textbook2 = "";
     	pencil1 = "";
     	pencil2 = "";
     	weight = 0;
     	Brandname = "";
     	zipped = true;
	}
    public Backpack(String _textbook1, String _textbook2, String _pencil1, String _pencil2, int _weight, String _Brandname, boolean _zipped)  //Default constructor
    {
   	 textbook1 = _textbook1;
   	 textbook2 = _textbook2;
   	 pencil1 = _pencil1;
   	 pencil2 = _pencil2;
   	 weight = _weight;
   	 Brandname = _Brandname;
   	 zipped =_zipped;
    }    
    public String getTextbook1()
	{
    	return textbook1;
	}
    public String getTextbook2()
	{
    	return textbook2;
	}
    public String getPencil1()
	{
    	return pencil1;
	}
    public String getPencil2()
	{
    	return pencil2;
	}
    
    public String getBrandname()
	{
    	return Brandname;
	}
    
    public int getWeight()
	{
    	return weight;
	}
    public int getMaterials() //1 means you can get materials, 0 means you cannot get materials (since zipped)
	{
    	if(zipped == true)
        	return 0;
    	else
        	return 1;
	}
    
      public boolean getZippedOrNot()
    	{
        	return zipped;
    	}
      
      public void setTextbook1(String _textbook1)
    	{
        	textbook1 = _textbook1;
    	}
    	public void setTextbook2(String _textbook2)
    	{
        	textbook2 = _textbook2;
    	}
    	public void setPencil1(String _pencil1)
    	{
        	pencil1 = _pencil1;
    	}
    	public void setPencil2(String _pencil2)
    	{
        	pencil2 = _pencil2;
    	}

    	public void setWeight(int _weight)
    	{
        	weight = _weight;
    	}
   	 
    	public void setBrandname(String _Brandname)
    	{
        	Brandname = _Brandname;
    	}
   	 
   	 
    	public void setZipped(boolean _zipped)
    	{
        	zipped = _zipped;
    	}
   	 
    	public String gettextbook1()
   	 {
   		 return textbook1;
   	 }
   	 
   	 public String gettextbook2()
   	 {
   		 return textbook2;
   	 }
   	 
   	 public String getpencil1()
   	 {
   		 return pencil1;
   	 }
   	 
   	 public String getpencil2()
   	 {
   		 return pencil2;
   	 }
   	 
   	 public int getweight()
   	 {
   		 return weight;
   	 }
   	 
   	 public String ToString()
   	 {
   		 return "Textbook1: " + textbook1 + "\n Textbook2: "+ textbook2 +"\n pencil1: "+pencil1
   	 + "\n pencil2: " + pencil2 + "\n weight: " + weight
   	 + "\n Brand Name: " + Brandname + "\n Zipped or not?: " + zipped;
   	 }
}
