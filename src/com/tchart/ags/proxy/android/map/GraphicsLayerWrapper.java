package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;

import com.esri.android.map.GraphicsLayer;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.map.Graphic;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("GraphicsLayer")

public class GraphicsLayerWrapper  extends AbsObjectWrapper<GraphicsLayer>
{
	public GraphicsLayerWrapper()
	{		
	}
	
	public GraphicsLayerWrapper(GraphicsLayer pGraphicsLayer)
	{
		setObject(pGraphicsLayer);
	}
	
	public void Initialise()
	{
		setObject(new GraphicsLayer());
	}
	
	public void Initialise(SpatialReference sr, Envelope fullextent)
	{
		setObject(new GraphicsLayer(sr, fullextent));
	}
	
	public int addGraphic(Graphic graphic)
	{
		return getObject().addGraphic(graphic);		
	}
	
	public void removeAll()
	{
		getObject().removeAll();
	}
}
