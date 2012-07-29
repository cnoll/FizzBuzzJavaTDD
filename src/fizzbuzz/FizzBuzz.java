package fizzbuzz;

public class FizzBuzz {

	public String getNumber(int i) {
		String returnValue = "";
		if (i % 3 == 0){
			returnValue += "Fizz";
		}
		if (i % 5 == 0){
			returnValue += "Buzz";
		}
		if(returnValue.equals("")){
			returnValue += i;
		}
		return returnValue;
	}

}
