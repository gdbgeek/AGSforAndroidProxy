package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;
import com.esri.android.map.ags.ArcGISDynamicMapServiceLayer;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISDynamicMapServiceLayer")

public class ArcGISDynamicMapServiceLayerWrapper  extends AbsObjectWrapper<ArcGISDynamicMapServiceLayer>
{
	public void Initialize (String url)
	{
		setObject(new ArcGISDynamicMapServiceLayer(url));	
	}	
	
}
