class backwards {
	public static void main(String[] args) {
		String s = "", charout = "";
		int l = 0, i = 0, position = 0;
		s = eingabe.readString("String:");
		l = s.length();
		for (i=l;i>0;i--) {
			charout = s.substring (i-1,i);
			System.out.print(charout);
		}
		System.out.println();
	}	
}