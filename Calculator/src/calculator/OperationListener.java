package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationListener implements ActionListener {
	
	Model myModel;
	View myView;
	int d;
	Op op;
	
	public OperationListener(View view, Model model, Op op) {
		this.myModel = model;
		this.myView = view;
		this.op = op;
	}

	@Override
	public void actionPerformed (ActionEvent e) {
		myModel.operation(op);
		myView.refresh();
	}

}
