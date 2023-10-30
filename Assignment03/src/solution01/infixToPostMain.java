package solution01;

public class infixToPostMain {
	public static int prior(String ch) {
		switch (ch) {
		case "$":
			return 11;
		case "*":
			return 10;
		case "%":
			return 10;
		case "/":
			return 10;
		case "+":
			return 9;
		case "-":
			return 9;

		}
		return 0;
	}
	public static void main(String[] args) {
		String infix = "1,$,9,+,3,*,4,-,(,6,+,8,/,2,),+,7";

		System.out.println("Infix : " + infix);
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix : " + postfix);

	}

	private static String infixToPostfix(String infix) {
		String[] arr = infix.split(",");
		Stack st = new Stack(50);
		StringBuilder prefix = new StringBuilder();
		for (int i = 0 ; i < arr.length; i++) {
			String s = arr[i];
			if (isNumeric(s)) {
				prefix.append(s);
			} 
			
			else if(s.equals("("))
			{
				st.push(s);
			}
			else if(s.equals(")"))
			{
				while(!(st.peek().equals("(")))
				{
					prefix.append(st.pop());
				}
				st.pop();
			}
			
			else {
				while(!st.isEmpty() && (prior(st.peek()) >= prior(s)))
				{
					prefix.append(st.pop());
				}
				st.push(s);
			}
			

		}
		while(!st.isEmpty())
		{
			prefix.append(st.pop());
			

		}
		return prefix.toString();

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

}
