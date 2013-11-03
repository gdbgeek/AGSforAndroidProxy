package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Polygon;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Polygon")

public class PolygonWrapper  extends AbsObjectWrapper<Polygon>
{
	public PolygonWrapper()
	{		
	}
	
	public PolygonWrapper(Polygon pPolygon)
	{
		setObject(pPolygon);
	}	  
		
	/**
	* Creates a polygon.
	*/
	public void Initialize()
	{
		setObject(new Polygon());
	}



	/**
	* Calculates the ring area for this ring.
	*/
	public double calculateRingArea2D(int ringIndex)
	{
		return getObject().calculateRingArea2D(ringIndex);
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
	* Returns a hash code value for this polygon.
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* Sets a new vertex for the polygon.
	*/
	public void setXY(int i, double x, double y)
	{
		getObject().setXY(i, x, y);
		return;
	}
}
