package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import com.esri.android.map.Layer;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Layer")

public class LayerWrapper  extends AbsObjectWrapper<Layer>
{
	public LayerWrapper()
	{		
	}
	
	public LayerWrapper(Layer pLayer)
	{
		setObject(pLayer);
	}
	
	public String	getName()
	{
		return getObject().getName();		
	}
	
	public String	getTitle()
	{
		return getObject().getTitle();		
	}
}
