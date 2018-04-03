import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti { 
	public static void main(String[] args) {
Robot susan = new Robot();
susan.miniaturize();
susan.setPenColor(50,50,98);
susan.setPenWidth(20);
susan.penDown();
susan.setSpeed(50);
susan.move(200);
susan.turn(155);
susan.move(210);
susan.turn(205);
susan.move(200);

	}

}
