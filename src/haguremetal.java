
public class haguremetal extends Enemy{

	public haguremetal(double x, double y, double vx, double vy) {
		// TODO 自動生成されたメソッド・スタブ
		super(x,y,vx,vy); 
		life=4;
		score=10050;
	}
	public void move() {
		super .move();
		vy=vy+GameWorld.stage;
		vx=Math.random()*100-50;
	}
	public void draw(MyFrame f) {
		f.setColor(200, 200, 200);
		f.fillRect(x-5, y, 30, 10);
		f.setColor(200, 200, 200);
		f.fillRect(x, y-5, 10, 5);
		f.setColor(0, 0, 0);
		f.fillRect(x+2, y, 2, 2);
		f.setColor(0, 0, 0);
		f.fillRect(x-2, y, 2, 2);
	}
}
