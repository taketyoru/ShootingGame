
public class DropEnemy extends Enemy{

	public DropEnemy (double x, double y, double vx, double vy) {
		// TODO 自動生成されたメソッド・スタブ
		super(x,y,vx,vy);
		life=0+GameWorld.stage;
	}
	public void move() {
		super.move();
		vy=vy+GameWorld.stage-0.6;//練習問題13-1
	}
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x, y, 30, 10);
		f.setColor(0, 128, 0);
		f.fillRect(x+10, y+10, 10, 20);
	}
}
