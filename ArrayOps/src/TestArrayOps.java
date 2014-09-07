import tester.Tester;


public class TestArrayOps
{

	public static void main(String[] args)
	{
		Tester.run(new TestArrayOps());
	}

	public void test (Tester t)
	{
		try
		{
			try
			{
				int[] a = null;
				double value = ArrayOps.sum(a);
				t.fail("null array argument not caught");
			}
			catch (IllegalArgumentException e)
			{
				t.success();
			}
			
			try
			{
				int[] a = new int[0];
				double value = ArrayOps.sum(a);
				t.fail("zero length array argument not caught");
			}
			catch (IllegalArgumentException e)
			{
				t.success();
			}
			
			int[] a1 = {2};
			double value = ArrayOps.sum(a1);
			t.checkExpect(value, 2.0);
			
			int a2[] = {2, 5, 8, 13};
			value = ArrayOps.sum(a2);
			t.checkExpect(value, 7.0);
		}
		catch (Exception e)
		{
			t.fail("unknown error");
		}
	}
}