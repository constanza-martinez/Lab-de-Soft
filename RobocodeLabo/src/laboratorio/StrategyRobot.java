package laboratorio;

import robocode.JuniorRobot;

public interface StrategyRobot {


    void run(JuniorRobot robot);

    void onScannedRobot(JuniorRobot robot);

    void onHitByBullet(JuniorRobot robot);

    void onHitWall(JuniorRobot robot);
}
