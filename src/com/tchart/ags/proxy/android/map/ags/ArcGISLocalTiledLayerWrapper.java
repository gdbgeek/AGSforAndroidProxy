package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

import com.esri.android.map.ags.ArcGISLayerInfo;
import com.esri.android.map.ags.ArcGISLocalTiledLayer;
import com.esri.core.io.UserCredentials;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISLocalTiledLayer")

public class ArcGISLocalTiledLayerWrapper  extends AbsObjectWrapper<ArcGISLocalTiledLayer>
{
	public ArcGISLocalTiledLayerWrapper()
	{
	}

	public ArcGISLocalTiledLayerWrapper(ArcGISLocalTiledLayer pArcGISLocalTiledLayer)
	{
		setObject(pArcGISLocalTiledLayer);
	}

	/**
	* This constructor is used if you're instantiating the ArcGISLocalTiledLayer using Java code (see the class description for an example of this usage)
	*/
	public void Initialize(String path)
	{
		setObject(new ArcGISLocalTiledLayer(path));
	}

	/**
	* Instantiates an object of ArcGISLocalTiledLayer.
	*/
	public void Initialize1(String path, boolean initlayer)
	{
		setObject(new ArcGISLocalTiledLayer(path, initlayer));
	}


	/**
	* Returns a list of ArcGISLayerInfo objects.
	*/
	public List getLayers()
	{
		List L = new List();		
		L.Initialize();		
		for (ArcGISLayerInfo f : getObject().getLayers())
		{
			L.Add(f);
		}
		return L;
	}

	/**
	* Re-initializes the layer.
	*/
	public void reinitializeLayer(UserCredentials usercredentials)
	{
		getObject().reinitializeLayer(usercredentials);
		return;
	}

	/**
	* Re-initializes the layer with the given path.
	*/
	public void reinitializeLayer(String path)
	{
		getObject().reinitializeLayer(path);
		return;
	}

}
