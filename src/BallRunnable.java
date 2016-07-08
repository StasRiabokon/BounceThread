import java.awt.*;

public class BallRunnable implements Runnable {
    private Ball ball;
    private Component comp;
    public static final int STEPS = 10000;
    public static final int DELAY = 5;

    public BallRunnable(Ball ball, Component comp){
        this.ball = ball;
        this.comp = comp;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i <= STEPS; i++) {
                ball.move(comp.getBounds());
                comp.repaint();
                Thread.sleep(DELAY);
            }

        } catch (InterruptedException e) {

        }

    }
}
