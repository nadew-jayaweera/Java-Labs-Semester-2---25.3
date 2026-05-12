class Calculator{
	//
	int num1;
	int num2;
	
	//non param construction
	Calculator(){
		num1 = 10;
		num2 = 5;
	}
	//non prama - non return type method
	void printMag(){
		System.out.println("Welcome 25.3 VU Batch Calculator");
	}
	//non param - return type method
	int addNumbers(){
		int sum = num1 + num2;
		return sum;
	}
	//param - non return type methods
	void subNumber(int num1,int num2){
		int sub = num1-num2;
		System.out.println("Sub is " + sub);
	}
	//param - return type method
	int multiplyNumber(int num1, int num2){
		int mul = num1 * num2;
		return mul;
	}
}