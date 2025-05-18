class tut_10
{
	public static void main(String[] agrs)
	{
		// Increment and Decrement operators
		int  a = 10;
		//int b = a++; /* first b is assigned a (10) then b is incremented  */
		// int b = ++a; /* first b is incremented and then it is assigned to b (11) */
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);

		int y = 7;
		int x = ++y*8;
		System.out.println(x);
		char k = 'B';
		++k;
		System.out.println(k);
	}
}
