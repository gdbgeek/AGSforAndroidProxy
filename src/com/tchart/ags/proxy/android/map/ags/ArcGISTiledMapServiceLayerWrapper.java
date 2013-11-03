package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISTiledMapServiceLayer")

public class ArcGISTiledMapServiceLayerWrapper  extends AbsObjectWrapper<ArcGISTiledMapServiceLayer>
{
	//public ArcGISTiledMapServiceLayerWrapper()
	//{		
	//}
	
	//public ArcGISTiledMapServiceLayerWrapper(ArcGISTiledMapServiceLayer pArcGISTiledMapServiceLayer)
	//{
	//	setObject(pArcGISTiledMapServiceLayer);
	//}
	
	public void Initialize(String url)
	{
		setObject(new ArcGISTiledMapServiceLayer(url));		
	}	
}
