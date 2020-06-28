import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;

public class StarChart {

	//instance variables	
	private ArrayList<Star> stars;
	
	//Constructor
	public StarChart(String fileName) {
		stars = new ArrayList<Star>();
		Scanner input = null;
		try {
			input = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		double x = 0, y = 0, m = 0;
		int H = 0, Harvard = 0;
		String n = "";
		while(input.hasNextLine()) {	
			x = input.nextDouble();
			y = input.nextDouble();
			input.nextDouble();
			H = input.nextInt();
			m = input.nextDouble();
			Harvard = input.nextInt();
			n = input.nextLine();
			stars.add(new Star(x, y, H, m, Harvard, n));
		}
	}
	public String getList(){
		return stars.toString() + "\n";
	}
	public static Point coordsToPixel(double origX, double origY, double size) {
		double stdX0 = size/2;
		double stdY0 = size/2;
		double pX = (origX*stdX0) + stdX0;
		double pY = (origY*stdY0) + stdY0;
		return new Point(pX, pY);
	}
	public void drawStars() {
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledSquare(500, 500, 500);
		StdDraw.setPenColor(255,255,255);
		double size = 0;
		for (Star i : stars) {
			size = Math.round((10.0 / (i.getMagnitude() + 2)));
			Point x = coordsToPixel(i.getXCord(), i.getYCord(), 1000);
			StdDraw.filledCircle(x.getXC(), x.getYC(), size);
		}
	}
	//Roger Scott and Robby Blanchard and 6 startup sectors book
	public void drawConstellations(String filename) {
		
	}
}
