class ch3_tut_14{
	public static void main(String[] args){

		//Strning methods

		String name = "karthik";
		System.out.println(name);

		//length()
		int value = name.length();
		System.out.println(value);
		
		//toLowerCase()
		String lstr = name.toLowerCase();
		System.out.println(lstr);
		
		//toUpperCase()
		String ustr = name.toUpperCase();
		System.out.println(ustr);

		//trim()
		String nonTrime = "   Karthik   ";
		System.out.println(nonTrime);
		String trime = nonTrime.trim();
		System.out.println(trime);

		//substring()
		//substring( , ) it includes first value and excludes second value
		System.out.println(name.substring(5));
		System.out.println(name.substring(1,7));

		//replace() more then one letter use ""
		System.out.println(name.replace( 'k' , 'g' ));
		System.out.println(name.replace( "ar" , "k" ));
		System.out.println(name.replace( "t" , "xyz" ));
		

		//startsWith() , endsWith() always use ""
		System.out.println(name.startsWith("a"));
		System.out.println(name.endsWith("k"));

		//charAt()
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));

		//indexOf() it will -1 is there is other charaters
		System.out.println(name.indexOf("k"));
		System.out.println(name.indexOf("k" , 5));
		System.out.println(name.indexOf("asdwwq"));

		//equals() use equals() when uh want check both strings r equall r not dont use = opertaor
		System.out.println(name.equals("karthik"));

		//equalsIgnoreCase()
		System.out.println(name.equalsIgnoreCase("KARthik"));
	}
}
		