package in.debasish.seleniumProgramming;

public class ReverseWord {

	public static void main(String[] args) {
		String name ="Greens Tech";
		
		String[] s=name.split(" ");
		
		String res="";
		for(int i=0;i<s.length;i++) {
			String t=s[i];
			
			for(int j=t.length()-1;j>=0;j--) {
				char ch=t.charAt(i);
				res=res+ch;
			}
			res=res+" ";
		}

		System.out.println(res);
	}

}
