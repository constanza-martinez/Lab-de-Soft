package laboratorio;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html

public class Terminator extends JuniorRobot
{
	private StrategyRobot strategy;

	@Override
	public void run() {

		setColors(green, blue, white, yellow, black);

		strategy = Estratega1.INSTANCE.bestStrategy(this);

		while(true) {

			this.strategy.run(this);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		this.strategy.onScannedRobot(this);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		this.strategy.onHitByBullet(this);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		this.strategy.onHitWall(this);
	}	
}