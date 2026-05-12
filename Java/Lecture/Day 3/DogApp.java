class DogApp {
	public static void main(String[] arg) {
		dog dog1;
		dog1 = new dog();
			
		dog1.name = "togo";
		dog1.age = 4;
		dog1.breed = "Husky";
		
		System.out.println("Name is: "+dog1.name);
		System.out.println("Age is: "+dog1.age);
		System.out.println("Breed name is: "+dog1.breed);
		
		dog1.run();
		dog1.sleep();
		dog1.bark();
		
		dog dog2 = new dog();
		
		dog2.name = "gemba";
		dog2.age = 2;
		dog2.breed = "frog";
		
		System.out.println("Name is: "+ dog2.name);
		System.out.println("Age is: "+ dog2.age);
		System.out.println("Breed is: "+ dog2.breed);
		
		dog("meeya", 2 , "mee")
	}
}