import processing.core.PApplet;

public class FourBallChallenge extends PApplet {
    private static final int WIDTH_OF_FRAME = 640;
    private static final int HEIGHT_OF_FRAME = 480;
    private static final int DIAMETER_OF_CIRCLE = 10;
    private static final int SPEED_OF_BALL = 1;
    private int distanceFromTopOfFrame;
    private int distanceFromLeftForBall1,distanceFromLeftForBall2,
            distanceFromLeftForBall3,distanceFromLeftForBall4;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH_OF_FRAME, HEIGHT_OF_FRAME);
    }

    @Override
    public void setup() {
        distanceFromTopOfFrame = HEIGHT_OF_FRAME / 5;
        distanceFromLeftForBall1 = 0;
        distanceFromLeftForBall2 = 0;
        distanceFromLeftForBall3 = 0;
        distanceFromLeftForBall4 = 0;
    }

    @Override
    public void draw() {
        drawBall1();
        drawBall2();
        drawBall3();
        drawBall4();
    }

    private void drawBall1() {
        int speedOfBall = SPEED_OF_BALL;
        ellipse(distanceFromLeftForBall1,distanceFromTopOfFrame,DIAMETER_OF_CIRCLE ,DIAMETER_OF_CIRCLE);
        distanceFromLeftForBall1 = distanceFromLeftForBall1 + speedOfBall;
    }

    private void drawBall2() {
        int distanceFromTopOfFrameForBall2 = 2 * distanceFromTopOfFrame;
        int speedOfBall = 2 * SPEED_OF_BALL;
        ellipse(distanceFromLeftForBall2,distanceFromTopOfFrameForBall2,DIAMETER_OF_CIRCLE ,DIAMETER_OF_CIRCLE);
        distanceFromLeftForBall2 = distanceFromLeftForBall2 + speedOfBall;
    }

    private void drawBall3() {
        int distanceFromTopOfFrameForBall3 = 3 * distanceFromTopOfFrame;
        int speedOfBall = 3 * SPEED_OF_BALL;
        ellipse(distanceFromLeftForBall3,distanceFromTopOfFrameForBall3,DIAMETER_OF_CIRCLE ,DIAMETER_OF_CIRCLE);
        distanceFromLeftForBall3 = distanceFromLeftForBall3 + speedOfBall;
    }

    private void drawBall4() {
        int distanceFromTopOfFrameForBall4 = 4 * distanceFromTopOfFrame;
        int speedOfBall = 4 * SPEED_OF_BALL;
        ellipse(distanceFromLeftForBall4,distanceFromTopOfFrameForBall4,DIAMETER_OF_CIRCLE ,DIAMETER_OF_CIRCLE);
        distanceFromLeftForBall4 = distanceFromLeftForBall4 + speedOfBall;
    }
}
