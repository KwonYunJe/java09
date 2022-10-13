package abstract_class_interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button2Active implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Clicked B2");
	}

}
