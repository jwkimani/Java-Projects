
public class StudentOps 
{
	/**
	 * precondition: The average score cannot be negative and the average score cannot also be greater than 100
	 * @param ave is the average score
	 * @param grade is the letter grade earned by the student from the average score
	 * @return the letter grade (grade)
	 * @throws IllegalArgumentException if the average score is negative
	 * @throws IllegalArgumentException if the average score is greater than 100
	 */
	
	/****************************
	 * grade is not a parameter
	 */
	public static char numericalGrade (double ave)
	{
		char grade = 'n';
		if (ave < 0)
			 throw new IllegalArgumentException ("The average score cannot be negative");
		if(ave >100)
			throw new IllegalArgumentException ("The average score cannot be greater than 100");	
		if(ave>= 90.0) 
			grade= 'A';
		else if (ave>=80)
			grade = 'B';
		else if (ave>=70)
			grade = 'C'; 
		else if (ave>=60)
			grade = 'D';
		else if (ave< 60)
			grade = 'F';
		
		return grade;
		
	}
	/**
	 * Precondition: The assigned grade entered has to be a character thats a valid letter grade.
	 * @param satisfiesMajorRequirements is a boolean that determines whether a student gets credit for a course (grade of 'C' or better) in the student's major.
	 * @param grade is the letter grade earned by the student i.e 'A','B','C','D' or 'F'
	 * @return the satisfiesMajorRequirement boolean as to whether a student gets credit for a course (grade of 'C' or better) in the student's major.
	 * @throws IllegalArgumentException if the grade entered to be evaluated is not a valid letter grade 'A','B','C','D' or 'F'
	 */
	
	/**********************************************
	 * There is only 1 parameter - grade.
	 */
	public static boolean satisfiesMajorRequirement (char grade)
	{
		char[] letterGrade = {'A','B','C','D','F'};
		
		/*******************************
		 * You are not using this array.
		 */
		boolean satisfiesMajorRequirement = false;
		
		
			if (grade != 'A' && grade != 'B'&& grade != 'C' && grade != 'D' && grade != 'F')
				throw new IllegalArgumentException ("Entry has to be a character");
			
			if (grade =='A')
				satisfiesMajorRequirement= true;
			else if(grade =='B')
				satisfiesMajorRequirement= true;
			else if (grade =='C')
				satisfiesMajorRequirement= true;
			else if(grade =='D')
				satisfiesMajorRequirement= false;
			else if(grade =='F')
				satisfiesMajorRequirement= false;
				
		
		return satisfiesMajorRequirement;
	}
}


/***************************************************
50/50 Please see my comments in your code.
*/