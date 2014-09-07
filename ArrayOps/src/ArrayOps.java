
public class ArrayOps 
{
	/**
	 * precondition: array cannot be null & the size of the array must be positive
	 * @param myArray cannot be null or negative
	 * @return the average(sum/length )
	 */
	public static double sum (int[] myArray)
	{
	  if (myArray == null)
		  throw new IllegalArgumentException ("Null Array");
	  
	  if (myArray.length < 1)
		  throw new IllegalArgumentException ("The array must be positive");
	  
	  double sum = 0;
	  int length = myArray.length; 
	  for (int i= 0; i<length;i++)
	  {
		  sum +=myArray[i];
	  }
	  return sum/length;
	  
	}	

}

