class Child extends Parent {
	int id;

	// Overriding the parent method
	// to print the signature of the
	// child class
	@Override void method()
	{
		System.out.println("Method from Child");
	}
}