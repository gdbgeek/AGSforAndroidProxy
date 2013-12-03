package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Line;
import com.esri.core.geometry.Transformation2D;

@BA.Author("Trevor Hart")
@BA.ShortName("Line")

public class LineWrapper  extends AbsObjectWrapper<Line>
{
	public LineWrapper()
	{
	}

	public LineWrapper(Line pLine)
	{
		setObject(pLine);
	}

	/**
	* Creates a line segment.
	*/
	public void Initialize()
	{
		setObject(new Line());
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
	* 
	*/
	public double calculateLength2D()
	{
		return getObject().calculateLength2D();
	}

	/**
	* Creates an instance of an empty geometry of the same type.
	*/
	public Geometry createInstance()
	{
		return getObject().createInstance();
	}

	/**
	* Returns the geometry type.
	*/
	public Geometry.Type getType()
	{
		return getObject().getType();
	}

	/**
	* Calculates intersection points of this segment with an infinite line, parallel to one of the axes.
	*/
	public int intersectionWithAxis2D(boolean bAxisX, double ordinate, double[] resultOrdinates, double[] parameters)
	{
		return getObject().intersectionWithAxis2D(bAxisX, ordinate, resultOrdinates, parameters);
	}

	/**
	* Indicates if the line segment is a curve.
	*/
	public boolean isCurve()
	{
		return getObject().isCurve();
	}

	/**
	* Gets the axis aligned bounding box of the geometry.
	*/
	public void queryEnvelope(Envelope env)
	{
		getObject().queryEnvelope(env);
		return;
	}


}
