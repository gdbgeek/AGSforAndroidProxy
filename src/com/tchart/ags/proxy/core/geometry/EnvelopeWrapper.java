package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Transformation2D;

@BA.Author("Trevor Hart")
@BA.ShortName("Envelope")

public class EnvelopeWrapper  extends AbsObjectWrapper<Envelope>
{
	public EnvelopeWrapper()
	{
	}

	public EnvelopeWrapper(Envelope pEnvelope)
	{
		setObject(pEnvelope);
	}

	/**
	* Creates an envelope by defining its center, width, and height.
	*/
	public void Initialize(Point center, double width, double height)
	{
		setObject(new Envelope(center, width, height));
	}

	/**
	* Constructs an empty envelope.
	*/
	public void Initialize1()
	{
		setObject(new Envelope());
	}

	/**
	* Constructs an envelope that covers the given point.
	*/
	public void Initialize2(Point point)
	{
		setObject(new Envelope(point));
	}

	/**
	* Constructs an envelope with the specified X and Y extents.
	*/
	public void Initialize3(double xmin, double ymin, double xmax, double ymax)
	{
		setObject(new Envelope(xmin, ymin, xmax, ymax));
	}



	/**
	* Applies 2D affine transformation in XY plane.
	*/
	public void applyTransformation(Transformation2D transform)
	{
		getObject().applyTransformation(transform);
		return;
	}

	/**
	* Calculates the area of the geometry.
	*/
	public double calculateArea2D()
	{
		return getObject().calculateArea2D();
	}

	/**
	* Calculates the length of the geometry.
	*/
	public double calculateLength2D()
	{
		return getObject().calculateLength2D();
	}

	/**
	* Sets the envelope's corners to be centered around the specified point, using it's center, width, and height.
	*/
	public void centerAt(Point c, double w, double h)
	{
		getObject().centerAt(c, w, h);
		return;
	}

	/**
	* Centers the envelope around the specified point preserving the envelope's width and height.
	*/
	public void centerAt(Point c)
	{
		getObject().centerAt(c);
		return;
	}

	/**
	* Checks if this envelope contains (covers
	*/
	public boolean contains(Envelope env)
	{
		return getObject().contains(env);
	}

	/**
	* Checks if this envelope contains (covers
	*/
	public boolean contains(Point p)
	{
		return getObject().contains(p);
	}

	/**
	* Copies this geometry to another geometry of the same type.
	*/
	public void copyTo(Geometry dst)
	{
		getObject().copyTo(dst);
		return;
	}

	/**
	* Creates an instance of an empty geometry of the same type.
	*/
	public Geometry createInstance()
	{
		return getObject().createInstance();
	}

	/**
	* Returns TRUE when this geometry has exactly same type, properties, and coordinates as the other geometry.
	*/
	public boolean equals(Object _other)
	{
		return getObject().equals(_other);
	}

	/**
	* Returns the center point of the envelope.
	*/
	public Point getCenter()
	{
		return getObject().getCenter();
	}

	/**
	* The X coordinate of center of the envelope.
	*/
	public double getCenterX()
	{
		return getObject().getCenterX();
	}

	/**
	* The Y coordinate fo the center of the envelope.
	*/
	public double getCenterY()
	{
		return getObject().getCenterY();
	}

	/**
	* Returns the topological dimension of the geometry object based on the geometry's type.
	*/
	public int getDimension()
	{
		return getObject().getDimension();
	}

	/**
	* The height of the envelope.
	*/
	public double getHeight()
	{
		return getObject().getHeight();
	}

	/**
	* Returns the envelope's lower left corner point.
	*/
	public Point getLowerLeft()
	{
		return getObject().getLowerLeft();
	}

	/**
	* Returns the envelope's lower right corner point.
	*/
	public Point getLowerRight()
	{
		return getObject().getLowerRight();
	}

	/**
	* Returns the geometry type.
	*/
	public Geometry.Type getType()
	{
		return getObject().getType();
	}

	/**
	* Returns the envelope's upper left corner point.
	*/
	public Point getUpperLeft()
	{
		return getObject().getUpperLeft();
	}

	/**
	* Returns the envelope's upper right corner point.
	*/
	public Point getUpperRight()
	{
		return getObject().getUpperRight();
	}

	/**
	* The width of the envelope.
	*/
	public double getWidth()
	{
		return getObject().getWidth();
	}

	/**
	* Returns the X coordinate of the right corners of the envelope.
	*/
	public final   double getXMax()
	{
		return getObject().getXMax();
	}

	/**
	* Returns the X coordinate of the left corners of the envelope.
	*/
	public final   double getXMin()
	{
		return getObject().getXMin();
	}

	/**
	* Returns the Y coordinate of the top corners of the envelope.
	*/
	public final   double getYMax()
	{
		return getObject().getYMax();
	}

	/**
	* Returns the Y coordinate of the bottom corners of the envelope.
	*/
	public final   double getYMin()
	{
		return getObject().getYMin();
	}

	/**
	* Returns a hash code value for this envelope.
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* Changes the dimensions of the envelope, preserving the center.
	*/
	public void inflate(double dx, double dy)
	{
		getObject().inflate(dx, dy);
		return;
	}

	/**
	* Changes this envelope to be the intersection of itself with the other envelope.
	*/
	public boolean intersect(Envelope other)
	{
		return getObject().intersect(other);
	}

	/**
	* Indicates whether this envelope contains any points.
	*/
	public boolean isEmpty()
	{
		return getObject().isEmpty();
	}

	/**
	* Returns true if the envelope and the other given envelope intersect.
	*/
	public boolean isIntersecting(Envelope other)
	{
		return getObject().isIntersecting(other);
	}

	/**
	* Merges this envelope with the point.
	*/
	public void merge(Point point)
	{
		getObject().merge(point);
		return;
	}

	/**
	* Merges this envelope with the extent of the given envelope.
	*/
	public void merge(Envelope other)
	{
		getObject().merge(other);
		return;
	}

	/**
	* Normalizes envelopes if the minimum dimension is larger then then the maximum dimension.
	*/
	public void normalize()
	{
		getObject().normalize();
		return;
	}

	/**
	* Offsets the envelope by the specified distances along x and y coordinates.
	*/
	public void offset(double dx, double dy)
	{
		getObject().offset(dx, dy);
		return;
	}

	/**
	* Sets the point's coordinates to the coordinates of the envelope at the given corner.
	*/
	public void queryCornerByVal(int index, Point ptDst)
	{
		getObject().queryCornerByVal(index, ptDst);
		return;
	}

	/**
	* Gets the axis aligned bounding box of the geometry.
	*/
	public void queryEnvelope(Envelope env)
	{
		getObject().queryEnvelope(env);
		return;
	}

	/**
	* Re-aspects this envelope to fit within the specified width and height.
	*/
	public void reaspect(double arWidth, double arHeight)
	{
		getObject().reaspect(arWidth, arHeight);
		return;
	}

	/**
	* Sets the 2 dimensional extents of the envelope.
	*/
	public void setCoords(double xmin, double ymin, double xmax, double ymax)
	{
		getObject().setCoords(xmin, ymin, xmax, ymax);
		return;
	}

	/**
	* Removes all points from this geometry.
	*/
	public void setEmpty()
	{
		getObject().setEmpty();
		return;
	}

	/**
	* Sets the right X coordinate.
	*/
	public void setXMax(double x)
	{
		getObject().setXMax(x);
		return;
	}

	/**
	* Sets the left X coordinate.
	*/
	public void setXMin(double x)
	{
		getObject().setXMin(x);
		return;
	}

	/**
	* Sets the top Y coordinate.
	*/
	public void setYMax(double y)
	{
		getObject().setYMax(y);
		return;
	}

	/**
	* Sets the bottom Y coordinate.
	*/
	public void setYMin(double y)
	{
		getObject().setYMin(y);
		return;
	}

	/**
	* Returns string representation of the class for debugging purposes.
	*/
	public String toString()
	{
		return getObject().toString();
	}


}
