import java.util.ArrayList;
import java.util.List;

public class Subject {

        private List<Observer> observers = new ArrayList<Observer> ();
        private int red, green, blue;

        public int getRed() {
                return red;
        }

        public int getGreen() {
                return green;
        }

        public int getBlue() {
                return blue;
        }

        public void setState(int red, int green, int blue) {
                this.red = red;
                this.green = green;
                this.blue = blue;
                notifyAllObservers();
        }

        public void attach(Observer observer) {
                observers.add(observer);
        }

        public void notifyAllObservers() {
                for (Observer observer: observers) {
                        observer.update();
                }
        }
}