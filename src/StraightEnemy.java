
public class StraightEnemy extends Enemy{

	public StraightEnemy (double x, double y, double vx, double vy){
		// TODO 自動生成されたメソッド・スタブ
		super(x,y,vx,vy);
		life=5+GameWorld.stage;
	}
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillRect(x+2, y+15, 10, 15);
		f.setColor(0, 0, 0);
		f.fillRect(x, y, 14, 15);
	}
}
