import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 


public class Tester
{
	public static void main(String[] args)
	{
        JFrame frame = new JFrame("JFR");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        
        NumberView nv = new NumberView();
		Subject subject = new Subject();
      	UpdateObserver obs =  new UpdateObserver(subject);
		
        mainPanel.add(nv.getPanel());
        mainPanel.add(obs.getGraphView());


        nv.getButton().addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
                mainPanel.remove(obs.getGraphView());
                mainPanel.revalidate();
                mainPanel.repaint();
                subject.setState(nv.getRed(), nv.getGreen(), nv.getBlue());
                mainPanel.add(obs.getGraphView());
                mainPanel.revalidate();
                mainPanel.repaint();
		    }
		});
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 600); 
        frame.setVisible(true);
	}
}
