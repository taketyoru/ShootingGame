
public class CurveEnemy extends Enemy{

	public CurveEnemy(double x, double y,double vx, double vy) {
		// TODO 自動生成されたメソッド・スタブ
		super(x,y,vx,vy);
		life=2+GameWorld.stage;//練習問題13-1
	}
	public void move() {
		super.move();
		if (x<GameWorld.player.x) {//練習問題13-1
			x=x+GameWorld.stage;
		}
		if (x>GameWorld.player.x) {
			x=x-GameWorld.stage;
		}
	}
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillOval(x, y, 30, 30);
		f.setColor(200, 200, 200);
		f.fillOval(x+5, y, 20, 30);
	}
}
