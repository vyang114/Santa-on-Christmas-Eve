package street;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Star {
	private GeneralPath starPath;
	
	public Star() {
		int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
		int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };

		starPath = new GeneralPath();
		
		// set the initial coordinate of the General Path
		starPath.moveTo(xPoints[0], yPoints[0]);
		
		// create the star--this does not draw the star
		for (int index = 1; index < xPoints.length; index++) {
			starPath.lineTo(xPoints[index], yPoints[index]);
		}
		
		starPath.closePath();	// close the shape
	}
	
	public void drawStar(Graphics2D g2){
		g2.fill(starPath);
	}
}