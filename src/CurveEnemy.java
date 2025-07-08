
public class CurveEnemy extends Enemy{

	public CurveEnemy(double x, double y,double vx, double vy) {
		// TODO 自動生成されたメソッド・スタブ
		super(x,y,vx,vy);
	}
	public void move() {
		super.move();
		if (x<GameWorld.player.x) {
			x++;
		}
		if (x>GameWorld.player.x) {
			x--;
		}
	}
}
