class MainExpresiWajah {
	public static void main(String[] args){
		ExpresiWajah objExpresi = new ExpresiWajah();
		Gembira objGembira = new Gembira();
		Sedih objSedih = new Sedih();
		Marah objMarah = new Marah();
		
		ExpresiWajah[] arrExpresi = new ExpresiWajah[4];
		arrExpresi[0] = objExpresi;
		arrExpresi[1] = objGembira;
		arrExpresi[2] = objSedih;
		arrExpresi[3] = objMarah;
		
		System.out.println("Expresi [0] : " + arrExpresi[0].respons());
		System.out.println("Expresi [1] : " + arrExpresi[1].respons());
		System.out.println("Expresi [2] : " + arrExpresi[2].respons());
		System.out.println("Expresi [3] : " + arrExpresi[3].respons());
	}
}