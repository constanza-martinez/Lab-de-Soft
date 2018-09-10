package laboratorio;

import robocode.JuniorRobot;

public class Estratega1 implements Strategist {

    public static final Estratega1 INSTANCE = new Estratega1();


    private class StrategyWithFullEnergy implements StrategyRobot {

        @Override
        public void run(JuniorRobot robot) {
            robot.ahead(40);
            robot.turnRight(10);
            robot.ahead(10);
            robot.turnLeft(10);
        }

        @Override
        public void onScannedRobot(JuniorRobot robot) {
            int angle = robot.scannedAngle;
            robot.fire(2);
            if (angle > 0){
                robot.turnTo(angle);
                robot.fire(3);
            }
        }

        @Override
        public void onHitByBullet(JuniorRobot robot) {
            robot.turnBackRight(10,45);
            robot.turnAheadLeft(20,10);
        }

        @Override
        public void onHitWall(JuniorRobot robot) {
            robot.back(10);
            robot.turnLeft(90);
        }
    }

    private class StrategyWithLowEnergy implements StrategyRobot{
        @Override
        public void run(JuniorRobot robot) {
            robot.ahead(5);
            robot.turnRight(5);
            robot.ahead(5);
            robot.turnLeft(5);
        }

        @Override
        public void onScannedRobot(JuniorRobot robot) {
            robot.fire(0.5);
        }

        @Override
        public void onHitByBullet(JuniorRobot robot) {
            robot.turnBackRight(20,90);
        }

        @Override
        public void onHitWall(JuniorRobot robot) {
            robot.back(20);
            robot.turnRight(180);
        }
    }

    @Override
    public StrategyRobot bestStrategy(JuniorRobot robot) {
        if(robot.energy > 70 ){
            return new StrategyWithFullEnergy();
        }else{
            return new StrategyWithLowEnergy();
        }
    }
}
