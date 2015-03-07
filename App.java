class App{
	public static  void main(String... args) {
		calcTime(Integer.parseInt(args[0]));
		// calc(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2]));
	}
	private static void calc(int m, String ops, int mm){
		if (ops.equals("*")) {
			System.err.println(m * mm);
		}else if (ops.equals("/")) {
			System.err.println(m / mm);
		}else if (ops.equals("%")) {
			System.err.println(m % mm);
		}

		
	}
	private static void calcTime(int $sumOfSeconds){
		try{
		int $houers=	( $sumOfSeconds		   ) / 3600;
		int $minutes=	( $sumOfSeconds % (3600)) / 60 ;
		int $secounds=	( $sumOfSeconds % (3600)  - $minutes * 60) ;
		System.err.println($houers+":"+$minutes+":"+$secounds);
	}catch(ArithmeticException ex){System.err.println(ex.getMessage());}
	}
}