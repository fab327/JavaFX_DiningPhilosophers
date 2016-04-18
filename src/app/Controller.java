package app;

import app.Model.Chopstick;
import app.Model.Philosopher;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static boolean running;

    //Philosophers
    public ImageView aristotle;
    private Image[] aristotleImgs = new Image[3];
    public ImageView buddha;
    private Image[] buddhaImgs = new Image[3];
    public ImageView russell;
    private Image[] russellImgs = new Image[3];
    public ImageView marx;
    private Image[] marxImgs = new Image[3];
    public ImageView kant;
    private Image[] kantImgs = new Image[3];

    //Chopsticks
    public ImageView chopstick1;
    public ImageView chopstick2;
    public ImageView chopstick3;
    public ImageView chopstick4;
    public ImageView chopstick5;

    //Generate our philosophers and chopsticks
    private Philosopher[] philosophers = new Philosopher[5];
    private Chopstick[] chopsticks = new Chopstick[5];

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        aristotleImgs[0] = new Image(getClass().getResourceAsStream("img/Aristotle-Thinking.png"));
        aristotleImgs[1] = new Image(getClass().getResourceAsStream("img/Aristotle-Hungry.png"));
        aristotleImgs[2] = new Image(getClass().getResourceAsStream("img/Aristotle-Eating.png"));

        buddhaImgs[0] = new Image(getClass().getResourceAsStream("img/Buddha-Thinking.png"));
        buddhaImgs[1] = new Image(getClass().getResourceAsStream("img/Buddha-Hungry.png"));
        buddhaImgs[2] = new Image(getClass().getResourceAsStream("img/Buddha-Eating.png"));

        russellImgs[0] = new Image(getClass().getResourceAsStream("img/Russell-Thinking.png"));
        russellImgs[1] = new Image(getClass().getResourceAsStream("img/Russell-Hungry.png"));
        russellImgs[2] = new Image(getClass().getResourceAsStream("img/Russell-Eating.png"));

        marxImgs[0] = new Image(getClass().getResourceAsStream("img/Marx-Thinking.png"));
        marxImgs[1] = new Image(getClass().getResourceAsStream("img/Marx-Hungry.png"));
        marxImgs[2] = new Image(getClass().getResourceAsStream("img/Marx-Eating.png"));

        kantImgs[0] = new Image(getClass().getResourceAsStream("img/Kant-Thinking.png"));
        kantImgs[1] = new Image(getClass().getResourceAsStream("img/Kant-Hungry.png"));
        kantImgs[2] = new Image(getClass().getResourceAsStream("img/Kant-Eating.png"));

        for (int i = 0; i < 5; i++) {
            chopsticks[i] = new Chopstick(i);
        }
        assignChopstickToItsView();

        //Create philosophers
        philosophers[0] = new Philosopher(chopsticks[0], chopsticks[1], 0, "aristotle", aristotle, aristotleImgs[0], aristotleImgs[1], aristotleImgs[2]);
        philosophers[1] = new Philosopher(chopsticks[1], chopsticks[2], 1, "buddha", buddha, buddhaImgs[0], buddhaImgs[1], buddhaImgs[2]);
        philosophers[2] = new Philosopher(chopsticks[2], chopsticks[3], 2, "russel", russell, russellImgs[0], russellImgs[1], russellImgs[2]);
        philosophers[3] = new Philosopher(chopsticks[3], chopsticks[4], 3, "marx", marx, marxImgs[0], marxImgs[1], marxImgs[2]);
        philosophers[4] = new Philosopher(chopsticks[4], chopsticks[0], 4, "kant", kant, kantImgs[0], kantImgs[1], kantImgs[2]);
    }

    public void startAction(ActionEvent actionEvent) {
        System.out.println("Started Simulation");
        running = true;

        for (Philosopher p : philosophers) {
            new Thread(p).start();
        }
    }

    public void stopAction(ActionEvent actionEvent) {
        running = false;
    }

    private void assignChopstickToItsView() {
        chopsticks[0].setChopstickView(chopstick5);
        chopsticks[1].setChopstickView(chopstick1);
        chopsticks[2].setChopstickView(chopstick2);
        chopsticks[3].setChopstickView(chopstick3);
        chopsticks[4].setChopstickView(chopstick4);
    }

}
