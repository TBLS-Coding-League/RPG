package me.alex.teacher;

public class XYVector
{
	private double _xChange, _yChange;
	
	public XYVector(double xChange, double yChange)
	{
		_xChange = xChange;
		_yChange = yChange;
	}
	
	/**
	 * @return The change in x position over time caused by this vector
	 */
	public double getXChange()
	{
		return _xChange;
	}
	
	/**
	 * @return The change in y position over time caused by this vector
	 */
	public double getYChange()
	{
		return _yChange;
	}
	
	/**
	 * Adds another vector to this vector
	 * @param vector The vector being added
	 * @return The vector resulting from this addition
	 */
	public XYVector add(XYVector vector)
	{
		_xChange += vector.getXChange();
		_yChange += vector.getYChange();
		
		return this;
	}
	
	/**
	 * Subtracts another vector from this vector
	 * @param vector The vector being subtracted
	 * @return The vector resulting from this subtraction
	 */
	public XYVector subtract(XYVector vector)
	{
		_xChange -= vector.getXChange();
		_yChange -= vector.getYChange();
		
		return this;
	}
	
	/**
	 * Multiplies this vector by a scalar
	 * @param multiplier The scalar being multiplied with
	 * @return The vector resulting from this multiplication
	 */
	public XYVector mult(double multiplier)
	{
		_xChange *= multiplier;
		_yChange *= multiplier;
		
		return this;
	}
	
	/**
	 * Calculates the length of this vector without square rooting it
	 * @return The length of this vector squared
	 */
	public double getLengthSquared()
	{
		return Math.pow(getXChange(), 2) + Math.pow(getYChange(), 2);
	}
	
	/**
	 * <p>Calculates the length of this vector</p>
	 * <p>WARNING: More resource intensive than {@link XYVector.getLengthSquared}</p>
	 * @return The length of this vector
	 */
	public double getLength()
	{
		return Math.sqrt(getLengthSquared());
	}
	
	/**
	 * @return The constant zero vector
	 */
	public static XYVector getZero()
	{
		return new XYVector(0, 0);
	}
}
