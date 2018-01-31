class q2 {
	public static void main(String[] args) {
		System.out.println(F(564));
		System.out.println(F(99));
	}

	static int F(int n) {
		if (n < 0)
			return F(-n);
		if (n < 10)
			return n;
		return F(n / 10);
	}

}
