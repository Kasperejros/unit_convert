import java.awt.*;
import javax.swing.*;

public class Interface extends JFrame{


	public Interface() {
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Converter");
		this.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JPanel unitPanel = new JPanel();
		
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputPanel.setBorder(BorderFactory.createTitledBorder("Input Unit settings"));
		inputPanel.setPreferredSize(new Dimension(200, 200));
		
		JPanel outputPanel = new JPanel(new FlowLayout());
		outputPanel.setBorder(BorderFactory.createTitledBorder("Output Unit settings"));
		outputPanel.setPreferredSize(new Dimension(200, 200));
		
		JPanel operatorPanel = new JPanel(new FlowLayout());
		operatorPanel.setBorder(BorderFactory.createTitledBorder("Converter settings"));
		operatorPanel.setPreferredSize(new Dimension(400, 200));
		
		
		
		String[] unitList = {"mm", "cm", "dm", "m", "km"};
		
		JComboBox<?> boxSelectInput = new JComboBox<Object>(unitList);
		JComboBox<?> boxSelectOutput = new JComboBox<Object>(unitList);
		
		inputPanel.add(boxSelectInput);
		outputPanel.add(boxSelectOutput);
		
		unitPanel.add(inputPanel);
		unitPanel.add(outputPanel);
		panel.add(unitPanel);
		panel.add(operatorPanel);
		
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
}