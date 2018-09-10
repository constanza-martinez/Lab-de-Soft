package laboratorio;

import robocode.JuniorRobot;

public class Estratega2 implements Strategist{

    public static final Estratega2 INSTANCE = new Estratega2();

    private class StrategyForManyRobots implements StrategyRobot{
        @Override
        public void run(JuniorRobot robot) {
            robot.turnAheadLeft(90,45);
            robot.turnAheadRight(90,45);
            robot.ahead(100);
            robot.turnLeft(45);
        }

        @Override
        public void onScannedRobot(JuniorRobot robot) {
            robot.fire(3);
        }

        @Override
        public void onHitByBullet(JuniorRobot robot) {
            robot.turnAheadRight(90,90);
            robot.turnGunRight(45);
        }

        @Override
        public void onHitWall(JuniorRobot robot) {
            robot.back(100);
            robot.turnAheadLeft(90,90);
            robot.ahead(10);
        }
    }

    private class StrategyForFewRobots implements StrategyRobot{
        @Override
        public void run(JuniorRobot robot) {
            robot.turnAheadLeft(20,90);
            robot.ahead(100);
            robot.turnLeft(20);
        }

        @Override
        public void onScannedRobot(JuniorRobot robot) {
            robot.fire(2);
        }

        @Override
        public void onHitByBullet(JuniorRobot robot) {
            robot.turnAheadRight(20,45);
        }

        @Override
        public void onHitWall(JuniorRobot robot) {
            robot.back(60);
            robot.turnRight(90);
            robot.ahead(5);
        }
    }

    @Override
    public StrategyRobot bestStrategy(JuniorRobot robot) {
        if (robot.others > 5 ){
            return new StrategyForManyRobots();
        }else{
            return new StrategyForFewRobots();
        }
    }
}
