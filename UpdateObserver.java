import java.util.ArrayList;
import java.util.List;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

public class UpdateObserver extends Observer {

        private GraphView gv;

        public GraphView getGraphView() {
                return gv;
        }
        public UpdateObserver(Subject subject) {

        		gv = new GraphView();
        		this.subject = subject;
                this.subject.attach(this);
                subject.setState(100, 8, 54);
                
        }

        @Override
        public void update() {
        		gv = new GraphView();
                gv.addBar(Color.red, subject.getRed());
                gv.addBar(Color.green, subject.getGreen());
                gv.addBar(Color.blue, subject.getBlue());
                

        }
}