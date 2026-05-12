class calculator {
	void add(int a, int b){
		int sum = a+b;
		
		System.out.println("Sum is: "+sum);
	}
	
	public void main(String[] arg){
		calculator cal = new calculator();
		
		cal.add(3,8);
	}
}