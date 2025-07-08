public class Character {
	double x,y,vx,vy;
	public Character(double x, double y, double vx, double vy) {
		// TODO 自動生成されたメソッド・スタブ
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	public void move() {
		x+=vx;
		y+=vy;
	}
	public void draw(MyFrame f) {
		f.setColor(0,0,0);					//練習問題１０ー１
		f.fillRect(x+10, y, 10, 20);
	}

}
