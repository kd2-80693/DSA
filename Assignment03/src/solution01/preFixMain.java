package solution01;

public class preFixMain {

	public static int preFixEvaluation(String prefix) {
		String[] arr = prefix.split(",");
		int result = 0;
		Stack st = new Stack(50);
		for (int i = arr.length - 1; i >= 0; i--) {
			String s = arr[i];
			if (isNumeric(s)) {
				st.push(s);
			} else {
				int operator1 = Integer.parseInt(st.pop());
				int operator2 = Integer.parseInt(st.pop());
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
		String prefix = "-,+,+,4,/,*,5,6,3,9,7";

		System.out.println("Prefix : " + prefix);
		int result = preFixEvaluation(prefix);
		System.out.println("Result : " + result);
	}
}
