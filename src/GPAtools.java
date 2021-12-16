
public class GPAtools {

	public double calcAverage(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
		
		double result = (num1 + num2 + num3 + num4 + num5 + num6 + num7) / 7.0;
		result = (int)(result * 100) / 100.0;
		return result;
	}
	
	public int getNum(String grade) {
		int result = 0; 
		//System.out.println(">>>" + grade);

		switch (grade)
		    {

		      case "a":
		           result = 4;
		           break;
		      case "b":
			       result = 3;
		           break;
		      case "c":
			       result = 2;
		           break;
		      case "d":
			       result = 1;
		           break;
		      case "f":
			       result = 0;
		           break;
		    }
		return result;
	}
}


/*


2.574576475

257.4576475


*/