
public class Runner {
	public static final int SIZE = 1000;
	public static void main(String[] args) {
		StdDraw.setCanvasSize(SIZE, SIZE);
		StdDraw.setXscale(0, SIZE);
		StdDraw.setYscale(0, SIZE);
		StarChart x = new StarChart("stars.txt");
		x.drawStars();
	}
}
