package solution01;

public class postFixMain {



	public static int postFixEvaluation(String postfix) {
		String[] arr = postfix.split(",");
		int result = 0;
		Stack st = new Stack(50);
		for (int i = 0 ; i < arr.length -1; i--){
			String s = arr[i];
			if (isNumeric(s)) {
				st.push(s);
			} else {
				int operator2 = Integer.parseInt(st.pop());
				int operator1 = Integer.parseInt(st.pop());
				result = cal(operator1, s, operator2);
				st.push(String.valueOf(result));
			}

		}

		return Integer.parseInt(st.pop());

	}
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}

	private static int cal(int operator1, String ch, int operator2) {
		switch (ch) {
		case "*":
			return operator1 * operator2;
		case "%":
			return operator1 % operator2;
		case "/":
			return operator1 / operator2;
		case "+":
			return operator1 + operator2;
		case "-":
			return operator1 - operator2;
		}
		return 0;
	}

	public static void main(String[] args) {

		String postfix = "456*3/+9+7-";

		System.out.println("Postfix : " + postfix);
		int result = postFixEvaluation(postfix);
		System.out.println("Result : " + result);

	}

}
