package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;

import com.esri.android.map.ags.ArcGISPopupInfo;
import com.esri.android.map.ags.ArcGISTiledMapServiceLayer;
import com.esri.core.ags.MapServiceCapabilities;
import com.esri.core.ags.MapServiceInfo;
import com.esri.core.io.UserCredentials;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISTiledMapServiceLayer")

public class ArcGISTiledMapServiceLayerWrapper  extends AbsObjectWrapper<ArcGISTiledMapServiceLayer>
{
	public ArcGISTiledMapServiceLayerWrapper()
	{
	}

	public ArcGISTiledMapServiceLayerWrapper(ArcGISTiledMapServiceLayer pArcGISTiledMapServiceLayer)
	{
		setObject(pArcGISTiledMapServiceLayer);
	}

	/**
	* This constructor is used if you're instantiating the ArcGISTiledMapServiceLayer using Java code (see the class description for an example of this usage)
	*/
	public void Initialize(String url)
	{
		setObject(new ArcGISTiledMapServiceLayer(url));
	}

	/**
	* This constructor is used if you're instantiating the ArcGISTiledMapServiceLayer using Java code.
	*/
	public void Initialize1(String url, UserCredentials credentials)
	{
		setObject(new ArcGISTiledMapServiceLayer(url, credentials));
	}

	/**
	* Instantiates an object of ArcGISTiledMapServiceLayer.
	*/
	public void Initialize2(String url, UserCredentials credentials, boolean initLayer)
	{
		setObject(new ArcGISTiledMapServiceLayer(url, credentials, initLayer));
	}



	/**
	* Creates the popup info.
	*/
	public ArcGISPopupInfo createPopupInfo(int sublayerId)
	{
		return getObject().createPopupInfo(sublayerId);
	}

	/**
	* Returns the all of sub-layers of the tiled map service.
	*/
	public List getAllLayers()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getAllLayers()) L.Add(o);
		return L;
	}

	/**
	* Gets the capabilities of the map service.
	*/
	public MapServiceCapabilities getCapabilities()
	{
		return getObject().getCapabilities();
	}

	/**
	* Returns the immediate sub-layers of the tiled map service.
	*/
	public List getLayers()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getLayers()) L.Add(o);
		return L;
	}

	/**
	* 
	*/
	public MapServiceInfo getMapServiceInfo()
	{
		return getObject().getMapServiceInfo();
	}

	/**
	* Gets the PopupInfo associated with the sub-layer id.
	*/
	public ArcGISPopupInfo getPopupInfo(int sublayerId)
	{
		return getObject().getPopupInfo(sublayerId);
	}

	/**
	* Supported on ArcGIS Server 10.01 and above.
	*/
	public boolean retrieveLegendInfo()
	{
		return getObject().retrieveLegendInfo();
	}	
}
