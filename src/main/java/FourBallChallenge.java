import processing.core.PApplet;

public class FourBallChallenge extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int DISTANCE_FROM_TOP_FRAME = HEIGHT / 5;
    private static final int DIAMETER = 10;
    private static final int SPEED_OF_FRAME = 1;
    private int distanceFromLeftForBall1 = 0;
    private int distanceFromLeftForBall2 = 0;
    private int distanceFromLeftForBall3 = 0;
    private int distanceFromLeftForBall4 = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        int distanceFromTopOfFrame = DISTANCE_FROM_TOP_FRAME;
        int speedOfFrame = SPEED_OF_FRAME;
        ellipse(distanceFromLeftForBall1,distanceFromTopOfFrame,DIAMETER ,DIAMETER);
        distanceFromLeftForBall1 = distanceFromLeftForBall1 + speedOfFrame;
    }

    private void drawBall2() {
        int distanceFromTopOfFrame = 2 * DISTANCE_FROM_TOP_FRAME;
        int speedOfFrame = 2 * SPEED_OF_FRAME;
        ellipse(distanceFromLeftForBall2,distanceFromTopOfFrame,DIAMETER ,DIAMETER);
        distanceFromLeftForBall2 = distanceFromLeftForBall2 + speedOfFrame;
    }

    private void drawBall3() {
        int distanceFromTopOfFrame = 3 * DISTANCE_FROM_TOP_FRAME;
        int speedOfFrame = 3 * SPEED_OF_FRAME;
        ellipse(distanceFromLeftForBall3,distanceFromTopOfFrame,DIAMETER ,DIAMETER);
        distanceFromLeftForBall3 = distanceFromLeftForBall3 + speedOfFrame;
    }

    private void drawBall4() {
        int distanceFromTopOfFrame = 4 * DISTANCE_FROM_TOP_FRAME;
        int speedOfFrame = 4 * SPEED_OF_FRAME;
        ellipse(distanceFromLeftForBall4,distanceFromTopOfFrame,DIAMETER ,DIAMETER);
        distanceFromLeftForBall4 = distanceFromLeftForBall4 + speedOfFrame;
    }
}
