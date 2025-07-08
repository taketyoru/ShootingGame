
public class DropEnemy extends Enemy{

	public DropEnemy (double x, double y, double vx, double vy) {
		// TODO 自動生成されたメソッド・スタブ
		super(x,y,vx,vy);
	}
	public void move() {
		super.move();
		vy=vy+0.1;
	}
}
