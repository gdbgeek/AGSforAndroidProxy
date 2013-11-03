package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;

import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Transformation2D;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Point")

public class PointWrapper  extends AbsObjectWrapper<Point>
{
	public PointWrapper()
	{		
	}
	
	public PointWrapper(Point pPoint)
	{
		setObject(pPoint);
	}
	  
	/**
	* Creates an empty 2D point.
	*/
	public void Initialize()
	{
		setObject(new Point());
	}

	/**
	* Creates a 2D Point with specified X and Y coordinates.
	*/
	public void Initialize1(double x, double y)
	{
		setObject(new Point(x, y));
	}

	/**
	* Creates a 3D point with specified X, Y and Z coordinates.
	*/
	public void Initialize2(double x, double y, double z)
	{
		setObject(new Point(x, y, z));
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
	* Returns the topological dimension of the geometry object based on the geometry's type.
	*/
	public int getDimension()
	{
		return getObject().getDimension();
	}

	/**
	* Returns the attribute M of this point.
	*/
	public double getM()
	{
		return getObject().getM();
	}

	/**
	* Returns the geometry type.
	*/
	public Geometry.Type getType()
	{
		return getObject().getType();
	}

	/**
	* Returns the X coordinate of the point.
	*/
	public final   double getX()
	{
		return getObject().getX();
	}

	/**
	* Returns the Y coordinate of this point.
	*/
	public final   double getY()
	{
		return getObject().getY();
	}

	/**
	* Returns the Z coordinate of this point.
	*/
	public double getZ()
	{
		return getObject().getZ();
	}

	/**
	* Returns the hash code for the point.
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* Indicates if the geometry object contains geometric information.
	*/
	public boolean isEmpty()
	{
		return getObject().isEmpty();
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
	* Sets the geometry to its original initialization state by releasing all data referenced by the geometry.
	*/
	public void setEmpty()
	{
		getObject().setEmpty();
		return;
	}

	/**
	* Sets the M coordinate of this point.
	*/
	public void setM(double m)
	{
		getObject().setM(m);
		return;
	}

	/**
	* Sets the X coordinate of the point.
	*/
	public void setX(double x)
	{
		getObject().setX(x);
		return;
	}

	/**
	* Set the X and Y coordinate of the point.
	*/
	public void setXY(double x, double y)
	{
		getObject().setXY(x, y);
		return;
	}

	/**
	* Sets the Y coordinate of this point.
	*/
	public void setY(double y)
	{
		getObject().setY(y);
		return;
	}

	/**
	* Sets the Z coordinate of this point.
	*/
	public void setZ(double z)
	{
		getObject().setZ(z);
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
