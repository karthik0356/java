class tut_09
{
	public static void main(String[] args)
	{
		//Precedence & Associatvity
		int a = 6*5-34/2;
		/*
			* and / has highest Precedence and these two r then evaluate on the basis of Associatvity i.e 
* and / has left to right associatvity. 
			=30-34/2
			=30-17
			=13
		*/
		int b = 60/5-34*2;
		/*
			=12-34*2
			=12-68
			=-56
		*/
		System.out.println(a);
		System.out.println(b);

		int v = 2;
		int u = 1;
		int x = v*v - u*u;
		System.out.println(x);

	}
}
