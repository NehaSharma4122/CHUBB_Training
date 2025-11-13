package FunctionalProgramming;

public class LambdaFunction {
	public static void main(String[] args) {
		//functional interface comes as a object of lambda function
		//they are implemented using a lambda function;
		Greet greet = (name)->System.out.println("Hello "+name+"!");
		greet.sayHello("Neha");
		Greet greetImpl = new GreetImpl();
		greetImpl.sayHello("Neha");
	}
}
