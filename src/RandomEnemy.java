
public class RandomEnemy extends Enemy{

	public RandomEnemy(double x, double y, double vx, double vy) {
		// TODO 自動生成されたメソッド・スタブ
		super(x,y,vx,vy);
		life=1+GameWorld.stage;
	}
	public void move() {
		super.move();
		vx=Math.random()*(4+GameWorld.stage)-(2+GameWorld.stage);//練習問題13-1
	}
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x-10, y, 10, 20);
		f.setColor(0, 128, 0);
		f.fillRect(x+10, y, 10, 20);
		f.setColor(0, 128, 0);
		f.fillRect(x, y+20, 10, 10);
	}
}
