package me.alex.teacher;

public class XYPosition
{
	private double _x, _y;
	
	public XYPosition(double x, double y)
	{
		_x = x;
		_y = y;
	}
	
	/**
	 * @return The x coordinate of this position
	 */
	public double getX()
	{
		return _x;
	}
	
	/**
	 * Sets the x coordinate of this position
	 */
	public void setX(double x)
	{
		_x = x;
	}
	
	/**
	 * @return The y coordinate of this position
	 */
	public double getY()
	{
		return _y;
	}
	
	/**
	 * Sets the y coordinate of this position
	 */
	public void setY(double y)
	{
		_y = y;
	}
	
	/**
	 * Adds a vector to modify this position
	 * @param vector The vector being added
	 * @return The position resulting from this addition
	 */
	public XYPosition add(XYVector vector)
	{
		_x += vector.getXChange();
		_y += vector.getYChange();
		
		return this;
	}
	
	/**
	 * Directly adds value to the coordinates of this position
	 * @param x The amount of x coordinates being added
	 * @param y The amount of y coordinates being added
	 * @return The position resulting from this addition
	 */
	public XYPosition add(double x, double y)
	{
		_x += x;
		_y += y;
		
		return this;
	}
	
	/**
	 * Subtracts a vector to modify this position
	 * @param vector The vector being subtracted
	 * @return The position resulting from this subtraction
	 */
	public XYPosition subtract(XYVector vector)
	{
		_x -= vector.getXChange();
		_y -= vector.getYChange();
		
		return this;
	}
	
	/**
	 * Directly subtracts value from the coordinates of this position
	 * @param x THe amount of x coordinates being subtracted
	 * @param y The amount of y coordinates being subtracted
	 * @return The position resulting from this subtraction
	 */
	public XYPosition subtract(double x, double y)
	{
		_x -= x;
		_y -= y;
		
		return this;
	}
	
	/**
	 * Calculates the distance between this position and another position without square rooting it
	 * @return The distance between this position and another position squared
	 */
	public double getDistanceSquared(XYPosition other)
	{
		return other.toPositionVector().subtract(toPositionVector()).getLengthSquared();
	}
	
	/**
	 * <p>Calculates the distance between this position and another position</p>
	 * <p>WARNING: More resource intensive than {@link XYPosition.getDistanceSquared}</p>
	 * @return The distance between this position and another position
	 */
	public double getDistance(XYPosition other)
	{
		return Math.sqrt(getDistanceSquared(other));
	}
	
	
	/**
	 * Creates a new position vector representing this position with respect to the origin
	 * @return The position vector representing this position
	 */
	public XYVector toPositionVector()
	{
		return new XYVector(getX(), getY());
	}
	
	@Override
	public String toString()
	{
	    	return "(" + getX() + ", " + getY() + ")";
	}
	
	/**
	 * @return The constant origin position
	 */
	public static XYPosition getOrigin()
	{
		return new XYPosition(0, 0);
	}
}
