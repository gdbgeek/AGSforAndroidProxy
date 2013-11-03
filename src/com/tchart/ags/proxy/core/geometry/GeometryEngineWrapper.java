package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.GeometryEngine;
import com.esri.core.geometry.Polygon;
import com.esri.core.geometry.Unit;
//import com.esri.core.geometry.Point;
import com.esri.core.geometry.SpatialReference;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("GeometryEngine")

public class GeometryEngineWrapper  extends AbsObjectWrapper<GeometryEngine>
{
	public GeometryEngineWrapper()
	{		
	}
	
	public GeometryEngineWrapper(GeometryEngine pGeometryEngine)
	{
		setObject(pGeometryEngine);
	}	
	
	public Geometry	project(Geometry geometry, SpatialReference inputSR, SpatialReference outputSR)
	{
		return GeometryEngine.project(geometry, inputSR, outputSR);
	}
	
	public Polygon buffer(Geometry geometry, SpatialReference spatialReference, double distance, Unit unit)
	{
		return GeometryEngine.buffer(geometry, spatialReference, distance, unit);
	}
	
	
}
