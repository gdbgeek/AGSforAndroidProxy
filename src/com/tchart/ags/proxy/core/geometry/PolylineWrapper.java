package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Polyline;
import com.esri.core.geometry.Segment;

@BA.Author("Trevor Hart")
@BA.ShortName("Polyline")

public class PolylineWrapper  extends AbsObjectWrapper<Polyline>
{
	public PolylineWrapper()
	{
	}

	public PolylineWrapper(Polyline pPolyline)
	{
		setObject(pPolyline);
	}

	/**
	* Creates an empty polyline.
	*/
	public void Initialize()
	{
		setObject(new Polyline());
	}



	/**
	* Adds a new segment to this multipath.
	*/
	public void addSegment(Segment segment, boolean bStartNewPath)
	{
		getObject().addSegment(segment, bStartNewPath);
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
	public boolean equals(Object other)
	{
		return getObject().equals(other);
	}

	/**
	* Returns the topological dimension of the geometry object based on the geometry's type.
	*/
	public int getDimension()
	{
		return getObject().getDimension();
	}

	/**
	* Returns the geometry type.
	*/
	public Geometry.Type getType()
	{
		return getObject().getType();
	}

	/**
	* Returns the hash code for the polyline.
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}


}
