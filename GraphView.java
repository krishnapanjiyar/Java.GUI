import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.util.LinkedHashMap;
import java.util.Map;


public class GraphView extends JPanel
{
    private static final long serialVersionUID = 1L;
    private Map<Color, Integer> bars =
            new LinkedHashMap<Color, Integer>();
	
	public void addBar(Color color, int value)
	{
		bars.put(color, value);
		repaint();
	}


	
	@Override
	protected void paintComponent(Graphics g)
	{
		int max = 100;
		
		// paint bars
		
		int width = (getWidth() / bars.size()) - 2;

		int x = 1;
		for (Color color : bars.keySet())
		{
			int value = bars.get(color);
			int height = (int) 
                            ((getHeight()-5) * ((double)value / max));
			g.setColor(color);
			g.fillRect(x, getHeight() - height, width, height);
			g.setColor(Color.black);
			g.drawRect(x, getHeight() - height, width, height);
			x += (width + 2);
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(bars.size() * 40 + 2, 300);
	}
}
