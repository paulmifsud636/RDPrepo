
public class TypeCastUsingStringInput {

	public static void main(String[] args) {
		TypeCastUsingStringInput t = new TypeCastUsingStringInput();
		t.convertString("20");
		
		
	}
		
		private void convertString (String str) {
			int i = Integer.parseInt(str);
			float f= Float.parseFloat(str);
			long l= Long.parseLong(str);
			
			System.out.println("integer " +i);
			System.out.println("float " +f);
			System.out.println("long " +l);
			
			
		}
		

	}


