import biuoop.GUI;
import biuoop.Sleeper;
import biuoop.DrawSurface;
/**
 * Forced to create this JDOC due to checkstyles.
 */
public class BallsTest1 {
    /**
     * Draws an animation.
     * @param start the starting point
     * @param dx the dx
     * @param dy the dy
     */
    public static void drawAnimation(Point start, double dx, double dy) {
        GUI gui = new GUI("title", 200, 200);
        Sleeper sleeper = new Sleeper();
        Ball ball = new Ball(start.getX(), start.getY(), 30, java.awt.Color.BLACK);
        ball.setVelocity(dx, dy);
        while (true) {
            ball.moveOneStep();
            DrawSurface d = gui.getDrawSurface();
            ball.drawOn(d);
            gui.show(d);
            sleeper.sleepFor(50); // wait for 50 milliseconds.
        }
    }
    /**
     * Bafoonery.
     */
    public static void main(String[] args) {
        drawAnimation(new Point(100, 100), 1, 1);
        return;
        //GUI gui = new GUI("Balls Test 1",  400,  400);
        //DrawSurface d = gui.getDrawSurface();
        //Ball b1 = new Ball(new Point(100, 100), 30, java.awt.Color.RED);
        //Ball b2 = new Ball(new Point(100, 150), 10, java.awt.Color.BLUE);
        //Ball b3 = new Ball(new Point(80, 249), 50, java.awt.Color.GREEN);
        //b1.drawOn(d);
        //b2.drawOn(d);
        //b3.drawOn(d);
        //gui.show(d);
    }
}