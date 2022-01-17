/**
 * 
 */
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author negibsherif
 *
 */
public class View extends javax.swing.JFrame {
	
	private final Model model = new Model();
	private final JLabel valueLabel = new JLabel();

	/**
	 * @param args
	 */
	private View() {
		setLayout(new FlowLayout());
		for (int i=0 ; i<10 ; ++i)
		{
			JButton digitButton = new JButton(Integer.toString(i));
			digitButton.addActionListener(new DigitListener(this,model,i));
			add (digitButton);
//			ActionListener listener = new DigitListener( this,model) ;
//			digitButton.addActionListener(listener);
		}
		JButton clearButton = new JButton("Clear");
		add (clearButton);
		JButton plusButton = new JButton("+");
		add (plusButton);
		JButton equalsButton = new JButton("=");
		add (equalsButton);
		
		add(this.valueLabel);
		
		
		setSize(300,300) ;
		setVisible( true ) ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		refresh();
	}
	
	void refresh() {
		valueLabel.setText(model.getResult());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override public void run () {
				new View();
			}
		});
	}
}
