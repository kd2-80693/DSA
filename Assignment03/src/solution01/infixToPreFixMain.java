package solution01;

public class infixToPreFixMain {

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
		String infix = "1,+,2,-,3,*,4,+,(,5,$,6,),*,7,/,8,/,9,*,10,+,11";

		System.out.println("Infix : " + infix);
		String prefix = infixToPrefix(infix);
		System.out.println("Prefix : " + prefix);
	}

	private static String infixToPrefix(String infix) {
		String[] arr = infix.split(",");
		Stack st = new Stack(50);
		StringBuilder prefix = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			String s = arr[i];
			if (isNumeric(s)) {
				prefix.insert(0,s);
			} 
			
			else if(s.equals(")"))
			{
				st.push(s);
			}
			else if(s.equals("("))
			{
				while(!(st.peek().equals(")")))
				{
					prefix.insert(0,st.pop());
				}
				st.pop();
			}
			
			else {
				while(!st.isEmpty() && (prior(st.peek()) > prior(s)))
				{
					prefix.insert(0,st.pop());
				}
				st.push(s);
			}
			

		}
		while(!st.isEmpty())
		{
			prefix.insert(0,st.pop());

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
