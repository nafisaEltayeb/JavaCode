
public class UserInput {
	public static class TextInput{
		private final StringBuilder sb = new StringBuilder();
		public void add(final char ch) {
			sb.append(ch);
		}
		
		public String getValue() {
			return sb.toString();
		}
		
	}
	
	public static class NumericInput extends TextInput{
		@Override
		public void add(final char ch) {
			if(Character.isDigit(ch)) {
				super.add(ch);
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		TextInput input= new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
		
	}


}
