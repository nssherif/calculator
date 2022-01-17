package calculator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitListener implements ActionListener {
	
	Model myModel;
	View myView;
	int d;
	
	public DigitListener(View view, Model model, int i) {
		this.myModel = model;
		this.myView = view;
		this.d = i;
	}

	@Override
	public void actionPerformed (ActionEvent e) {
		myModel.digit(this.d);
		myView.refresh();
	}
	
//	public DigitListener (ActionEvent) {
//		myModel.digit(this.d);
//		myView.refresh();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
