package streamsapi;

public class Greeter {

	public void greeter(greetings greet) {
		greet.perform();
	}
	
	public static void main(String[] args) {

		greetings greet= () -> System.out.println("lambda");
		
		Greeter greeter= new Greeter();
		greeter.greeter(greet);

	}

}
