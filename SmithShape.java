import java.awt.geom.Rectangle2D;

public interface SmithShape {

	// The lower left x coordinate
	public int getX();

	// The lower left y coordinate
	public int getY();

	// The width of the shape
	public int getWidth();

	// The height of the shape
	public int getHeight();

	// The overall area of the shape
	public double getArea();

	public Rectangle2D toSquare();

}
