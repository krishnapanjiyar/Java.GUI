import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.io.*;


public class NumberView extends JPanel
{
    private static final long serialVersionUID = 2L;
	private JTextField field1, field2, field3;
	private JButton but1;
	private JPanel panel;
	public NumberView()
	{
		JLabel lab1 = new JLabel("Red");
        field1 = new JTextField("100", 30); 
        JLabel lab2 = new JLabel("Green");
        field2 = new JTextField("8", 30);
        JLabel lab3 = new JLabel("Blue");
        field3 = new JTextField("54", 30);
        but1 = new JButton("Update");
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.add(lab1);
        panel.add(field1);
        panel.add(lab2);
        panel.add(field2);
        panel.add(lab3);
        panel.add(field3);
        panel.add(but1);
	}

	public int getRed()
	{
		try
		{
			return Integer.parseInt(field1.getText());
		}
		catch(Exception ex)
		{
			return 0;
		}
		
	}

	public int getBlue()
	{
		try
		{
			return Integer.parseInt(field3.getText());
		}
		catch(Exception ex)
		{
			return 0;
		}
		
	}

	public int getGreen()
	{
		try
		{
			return Integer.parseInt(field2.getText());
		}
		catch(Exception ex)
		{
			return 0;
		}
		
	}

	public JButton getButton()
	{
		return but1;
	}

	public JPanel getPanel()
	{
		return panel;
	}
}
