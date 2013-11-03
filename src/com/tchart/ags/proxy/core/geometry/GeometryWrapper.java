package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.Geometry;

@BA.Author("Trevor Hart")
@BA.ShortName("Geometry")

public class GeometryWrapper  extends AbsObjectWrapper<Geometry>
{
	public GeometryWrapper()
	{
	}

	public GeometryWrapper(Geometry pGeometry)
	{
		setObject(pGeometry);
	}



}