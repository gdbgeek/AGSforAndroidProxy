package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Segment;

@BA.Author("Trevor Hart")
@BA.ShortName("Segment")

public class SegmentWrapper  extends AbsObjectWrapper<Segment>
{
	public SegmentWrapper()
	{
	}

	public SegmentWrapper(Segment pSegment)
	{
		setObject(pSegment);
	}

	///**
	//* Creates a segment with start and end points (0,0)
	//*/
	//public void Initialize()
	//{
	//	setObject(new Segment());
	//}



	/**
	* Calculates the area of the geometry.
	*/
	public double calculateArea2D()
	{
		return getObject().calculateArea2D();
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
	* Returns the topological dimension of the geometry object based on the geometry's type.
	*/
	public final   int getDimension()
	{
		return getObject().getDimension();
	}

	/**
	* Returns the X coordinate of ending point.
	*/
	public double getEndX()
	{
		return getObject().getEndX();
	}

	/**
	* Returns the Y coordinate of ending point.
	*/
	public double getEndY()
	{
		return getObject().getEndY();
	}

	/**
	* Returns the X coordinate of starting point.
	*/
	public double getStartX()
	{
		return getObject().getStartX();
	}

	/**
	* Returns the Y coordinate of starting point.
	*/
	public double getStartY()
	{
		return getObject().getStartY();
	}

	/**
	* Calculates intersection points of this segment with an infinite line, parallel to one of the axes.
	*/
	public int intersectionWithAxis2D(boolean bAxisX, double ordinate, double[] resultOrdinates, double[] parameters)
	{
		return getObject().intersectionWithAxis2D(bAxisX, ordinate, resultOrdinates, parameters);
	}

	/**
	* Indicates if the geometry object contains geometric information.
	*/
	public final   boolean isEmpty()
	{
		return getObject().isEmpty();
	}

	/**
	* Non public abstract version of the function.
	*/
	public boolean isEmptyImpl()
	{
		return getObject().isEmptyImpl();
	}

	/**
	* Returns coordinates of the end point in this segment.
	*/
	public void queryEnd(Point dstPoint)
	{
		getObject().queryEnd(dstPoint);
		return;
	}

	/**
	* Returns coordinates of the start point in a Point class.
	*/
	public void queryStart(Point dstPoint)
	{
		getObject().queryStart(dstPoint);
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
	* Sets the coordinates of the end point in a Point class.
	*/
	public void setEnd(Point srcPoint)
	{
		getObject().setEnd(srcPoint);
		return;
	}

	/**
	* Sets the coordinates of the start point in this segment.
	*/
	public void setStart(Point srcPoint)
	{
		getObject().setStart(srcPoint);
		return;
	}


}
