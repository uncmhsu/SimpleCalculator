
package simpleCalculator;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {
	private JLabel addLabel = new JLabel("Add 2 numbers: ");
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);

	private JButton additionButton = new JButton("Calculate");
	private JTextField additionSolution = new JTextField(10);
	private JLabel subtractLabel = new JLabel("Subtract 2 numbers: ");

	private JTextField thirdNumber = new JTextField(10);
	private JLabel subtractionLabel = new JLabel("-");
	private JTextField fourthNumber = new JTextField(10);

	private JButton subtractButton = new JButton("Calculate");
	private JTextField subtractionSolution = new JTextField(10);

	CalculatorView() {

		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(600, 200);
		calcPanel.add(addLabel);

		calcPanel.add(firstNumber);

		calcPanel.add(additionLabel);

		calcPanel.add(secondNumber);

		calcPanel.add(additionButton);

		calcPanel.add(additionSolution);
		calcPanel.add(subtractLabel);

		calcPanel.add(thirdNumber);

		calcPanel.add(subtractionLabel);

		calcPanel.add(fourthNumber);

		calcPanel.add(subtractButton);

		calcPanel.add(subtractionSolution);

		this.add(calcPanel);

	}

	public int getFirstNumber() {

		return Integer.parseInt(firstNumber.getText());

	}

	public int getSecondNumber() {

		return Integer.parseInt(secondNumber.getText());

	}

	public int getThirdNumber() {

		return Integer.parseInt(thirdNumber.getText());

	}

	public int getFourthNumber() {

		return Integer.parseInt(fourthNumber.getText());

	}

	public int getAdditionSolution() {

		return Integer.parseInt(additionSolution.getText());

	}

	public int getSubtractionSolution() {

		return Integer.parseInt(subtractionSolution.getText());

	}

	public void setAdditionSolution(int solution) {

		additionSolution.setText(Integer.toString(solution));

	}

	public void setSubtractionSolution(int solution) {

		subtractionSolution.setText(Integer.toString(solution));

	}

	void additionCalculateListener(ActionListener listenForAdditionButton) {

		additionButton.addActionListener(listenForAdditionButton);

	}

	void subtractionCalculateListener(ActionListener listenForSubtractionButton) {

		subtractButton.addActionListener(listenForSubtractionButton);

	}

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}

}
