package abstract_class_interface;

public class ComputerUse {

	public static void main(String[] args) {
		appleComputer ac = new appleComputer();
		samsungComputer sc = new samsungComputer();
		
		ac.Display();
		ac.WebSurfing();
		ac.Typing();
		
		sc.Display();
		sc.WebSurfing();
		sc.Typing();

		
	}

}
