	import tester.Tester;


	public class TestStudentOps
	{

		public static void main(String[] args)
		{
			Tester.run (new TestStudentOps());
		}

		public void test1 (Tester t)
		{
			try //test one
			{
				char grade = StudentOps.numericalGrade(-4);
				t.fail ("not catching invalid numerical grade");
			}
			catch (IllegalArgumentException e)
			{
				t.success();
			}
			try //test two 
			{
				char grade = StudentOps.numericalGrade(104);
				t.fail ("not catching invalid numerical grade");
			}
			catch (IllegalArgumentException e)
			{
				t.success();
			}
			char grade = StudentOps.numericalGrade(0); //test three
			t.checkExpect(grade, 'F');
			
			grade = StudentOps.numericalGrade(100); //test four
			t.checkExpect(grade, 'A');
			
			grade = StudentOps.numericalGrade(47.3); //test five 
			t.checkExpect(grade, 'F');

			grade = StudentOps.numericalGrade(67.3); //test six
			t.checkExpect(grade, 'D');
			
			grade = StudentOps.numericalGrade(70); //test seven 
			t.checkExpect(grade, 'C');

			grade = StudentOps.numericalGrade(60); //test eight 
			t.checkExpect(grade, 'D');

			grade = StudentOps.numericalGrade(76.3); //test nine
			t.checkExpect(grade, 'C');

			grade = StudentOps.numericalGrade(80); //test ten 
			t.checkExpect(grade, 'B');

			grade = StudentOps.numericalGrade(89.999); //test eleven 
			t.checkExpect(grade, 'B');

			grade = StudentOps.numericalGrade(90); //test twelve 
			t.checkExpect(grade, 'A');

			grade = StudentOps.numericalGrade(97.5); //test thirteen 
			t.checkExpect(grade, 'A');
		}
		
		public void test2 (Tester t)
		{
			try //test fourteen 
			{
				boolean result = StudentOps.satisfiesMajorRequirement('E');
				t.fail ("not catching invalid letter grade");
			}
			catch (IllegalArgumentException e)
			{
				t.success();
			}
			try //test fifteen 
			{
				boolean result = StudentOps.satisfiesMajorRequirement('a');
				t.fail ("not catching invalid letter grade");
			}
			catch (IllegalArgumentException e)
			{
				t.success();
			}
			boolean result = StudentOps.satisfiesMajorRequirement('A'); //test sixteen 
			t.checkExpect(result, true);
			
			
			result = StudentOps.satisfiesMajorRequirement('B'); //test seventeen 
			t.checkExpect(result, true);
			
			result = StudentOps.satisfiesMajorRequirement('C'); //test eighteen 
			t.checkExpect(result, true);
			result = StudentOps.satisfiesMajorRequirement('D'); //test nineteen 
			t.checkExpect(result, false);

			result = StudentOps.satisfiesMajorRequirement('F'); //test twenty 
			t.checkExpect(result, false);


		}
	}
