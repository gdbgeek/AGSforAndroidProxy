package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import com.esri.core.geometry.Geometry;
import com.esri.core.map.Graphic;
import com.esri.core.symbol.Symbol;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Graphic")

public class GraphicWrapper  extends AbsObjectWrapper<Graphic>
{
	public GraphicWrapper()
	{		
	}
	
	public GraphicWrapper(Graphic pGraphic)
	{
		setObject(pGraphic);
	}
		
	public void Initialize (Geometry geometry, Symbol symbol)
	{
		setObject(new Graphic(geometry,symbol));		
	}
	
	public void Initialize2 (Geometry geometry, Symbol symbol, int drawOrder)
	{
		setObject(new Graphic(geometry,symbol, drawOrder));		
	}
	
	public void Initialize3 (Geometry geometry, Symbol symbol, java.util.Map<String, Object> attributes, int drawOrder)
	{
		setObject(new Graphic(geometry,symbol,attributes,drawOrder));		
	}
	
	public String[]	getAttributeNames()
	{
		return getObject().getAttributeNames();
	}
	
	public Object getAttributeValue(String key)
	{
		return getObject().getAttributeValue(key);
	}
}
