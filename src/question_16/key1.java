package question_16;

public class key1 {
	String key;
	  Key1(String key)
	  {
	    this.key = key;
	  }
	  
	  @Override
	  public int hashCode() 
	  {
	     return (int)key.charAt(0);
	  }

	  @Override
	  public boolean equals(Object obj)
	  {
	    return key.equals((String)obj);
	  }

}
