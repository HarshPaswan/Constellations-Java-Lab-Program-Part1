
public class Star {
	//Instance Variables
	private double XCord;
	private double YCord;
	private int HenryDraper;
	private double magnitude;
	private int HarvardRev;
	private String name;
	public Star(double x, double y, int H, double m, int Harvard, String n) {
		XCord = x;
		YCord = y;
		HenryDraper = H;
		magnitude = m;
		HarvardRev = Harvard;
		name = n;
	}
	public double getXCord() {
		return XCord;
	}
	public double getYCord() {
		return YCord;
	}
	public int getHenryDraper() {
		return HenryDraper;
	}
	public double getMagnitude() {
		return magnitude;
	}
	public int getHarvardRev() {
		return HarvardRev;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		if (name == "") {
			return "[XCord=" + XCord + ", YCord=" + YCord + ", HenryDraper=" + HenryDraper + ", magnitude=" + magnitude
					+ ", HarvardRev=" + HarvardRev + "]";
		}
		return "[XCord=" + XCord + ", YCord=" + YCord + ", HenryDraper=" + HenryDraper + ", magnitude=" + magnitude
				+ ", HarvardRev=" + HarvardRev + ", name=" + name + "]";
	}
}
