package streamsapi;

@FunctionalInterface
public interface greetings {

	void perform();
	
	default void add() {
		System.out.println("default");
	}
	
	static void mystatic() {
		System.out.println("static");
	}
}
