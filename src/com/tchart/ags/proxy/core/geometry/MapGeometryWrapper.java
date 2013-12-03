package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.MapGeometry;
import com.esri.core.geometry.SpatialReference;

@BA.Author("Trevor Hart")
@BA.ShortName("MapGeometry")

public class MapGeometryWrapper  extends AbsObjectWrapper<MapGeometry>
{
	public MapGeometryWrapper()
	{
	}

	public MapGeometryWrapper(MapGeometry pMapGeometry)
	{
		setObject(pMapGeometry);
	}

	/**
	* Construct a MapGeometry instance using the specified geometry instance and its corresponding spatial reference.
	*/
	public void Initialize(Geometry g, SpatialReference _sr)
	{
		setObject(new MapGeometry(g, _sr));
	}



	/**
	* Gets the only geometry without the spatial reference from the MapGeometry.
	*/
	public Geometry getGeometry()
	{
		return getObject().getGeometry();
	}

	/**
	* Gets the spatial reference for this MapGeometry.
	*/
	public SpatialReference getSpatialReference()
	{
		return getObject().getSpatialReference();
	}

	/**
	* Sets the geometry for this MapGeometry.
	*/
	public void setGeometry(Geometry geometry)
	{
		getObject().setGeometry(geometry);
		return;
	}

	/**
	* Sets the spatial reference for this MapGeometry.
	*/
	public void setSpatialReference(SpatialReference sr)
	{
		getObject().setSpatialReference(sr);
		return;
	}


}
