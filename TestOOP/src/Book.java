public class Book
{
   private String title, author, publisher;
   private int copyright;

   //-----------------------------------------------------------------
   //  Sets up this Book object with the specified data.
   //-----------------------------------------------------------------
   public Book (String titleInit, String authorInit, String publisherInit,int copyrightInit)
   {
      title = titleInit;
      author = authorInit;
      publisher = publisherInit;
      copyright = copyrightInit;
   }

   //-----------------------------------------------------------------
   //  Accessors.
   //-----------------------------------------------------------------
   public String getTitle()
   {
	   return title;
   }

   public String getAuthor()
   {
	   return author;
   }

   public String getPublisher()
   {
	   return publisher;
   }

   public int getCopyright()
   {
	   return copyright;
   }

   //-----------------------------------------------------------------
   //  Mutators.
   //-----------------------------------------------------------------
   public void setTitle (String titleUpdate)
   {
	   title = titleUpdate;
   }

   public void setAuthor (String authorUpdate)
   {
	   author = authorUpdate;
   }

   public void setPublisher (String publisherUpdate)
   {
	   publisher = publisherUpdate;
   }

   public void setCopyright (int copyrightUpdate)
   {
	   copyright = copyrightUpdate;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this book.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return "Title: " + title + "\nAuthor: " + author + "\nPulbisher: " + publisher + "\nCopyright: " + copyright + "\n";
   }
}
