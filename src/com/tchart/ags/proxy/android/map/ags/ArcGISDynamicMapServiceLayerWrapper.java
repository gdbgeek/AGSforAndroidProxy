package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import anywheresoftware.b4a.objects.collections.Map;
import com.esri.android.map.ags.ArcGISDynamicMapServiceLayer;
import com.esri.android.map.ags.ArcGISPopupInfo;
import com.esri.core.ags.MapServiceCapabilities;
import com.esri.core.ags.MapServiceInfo;
import com.esri.core.io.UserCredentials;
import com.esri.core.map.TimeExtent;
import com.esri.core.map.TimeInfo;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISDynamicMapServiceLayer")

public class ArcGISDynamicMapServiceLayerWrapper  extends AbsObjectWrapper<ArcGISDynamicMapServiceLayer>
{
	public ArcGISDynamicMapServiceLayerWrapper()
	{
	}

	public ArcGISDynamicMapServiceLayerWrapper(ArcGISDynamicMapServiceLayer pArcGISDynamicMapServiceLayer)
	{
		setObject(pArcGISDynamicMapServiceLayer);
	}

	/**
	* This constructor is used if you're instantiating the ArcGISDynamicMapServiceLayer.
	*/
	public void Initialize(String url, int[] visiblelayers)
	{
		setObject(new ArcGISDynamicMapServiceLayer(url, visiblelayers));
	}

	/**
	* This constructor is used if you're instantiating the ArcGISDynamicMapServiceLayer.
	*/
	public void Initialize1(String url, int[] visiblelayers, UserCredentials credentials, boolean initLayer)
	{
		setObject(new ArcGISDynamicMapServiceLayer(url, visiblelayers, credentials, initLayer));
	}

	/**
	* This constructor is used if you're instantiating the ArcGISDynamicMapServiceLayer.
	*/
	public void Initialize2(String url, int[] visiblelayers, int[] invisibleLegendLayers, UserCredentials credentials, boolean initLayer)
	{
		setObject(new ArcGISDynamicMapServiceLayer(url, visiblelayers, invisibleLegendLayers, credentials, initLayer));
	}

	/**
	* This constructor is used if you're instantiating the ArcGISDynamicMapServiceLayer (see the class description for an example of this usage)
	*/
	public void Initialize3(String url)
	{
		setObject(new ArcGISDynamicMapServiceLayer(url));
	}

	/**
	* This constructor is used if you're instantiating the ArcGISDynamicMapServiceLayer.
	*/
	public void Initialize4(String url, int[] visiblelayers, UserCredentials credentials)
	{
		setObject(new ArcGISDynamicMapServiceLayer(url, visiblelayers, credentials));
	}

	/**
	* This constructor is used if you're instantiating the ArcGISDynamicMapServiceLayer.
	*/
//	public void Initialize5(String url, int[] visiblelayers, Map drawingOptions, UserCredentials credentials)
//	{
//		setObject(new ArcGISDynamicMapServiceLayer(url, visiblelayers, drawingOptions, credentials));
//	}



	/**
	* Returns a list of default DynamicLayerInfo objects based on map service layers.
	*/
	public List createDynamicLayerInfos()
	{
		return (List) getObject().createDynamicLayerInfos();
	}

	/**
	* Creates the popup info.
	*/
	public ArcGISPopupInfo createPopupInfo(int sublayerId)
	{
		return getObject().createPopupInfo(sublayerId);
	}

	/**
	* Returns the all of sub-layers of the dynamic map service.
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
	* Returns the current layers drawing options.
	*/
	public Map getDrawingOptions()
	{
		return (Map) getObject().getDrawingOptions();
	}

	/**
	* If this dynamic map service layer supports dynamic layer functionality,  this method will return a list of DynamicLayerInfos that can be used to modify the drawing order and data source of each layer in the service.
	*/
	public List getDynamicLayerInfos()
	{
		return (List) getObject().getDynamicLayerInfos();
	}

	/**
	* Gets the layer definitions of the ArcGISDynamicMapServiceLayer.
	*/
	public Map getLayerDefinitions()
	{
		return (Map) getObject().getLayerDefinitions();
	}

	/**
	* Returns the immediate sub-layers of the dynamic map service.
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
	* Gets the valid TimeExtent object for the Layer or null if this service does not support time based queries.
	*/
	public TimeExtent getTimeExtent()
	{
		return getObject().getTimeExtent();
	}

	/**
	* Get all the time awareness information for this layer.
	*/
	public TimeInfo getTimeInfo()
	{
		return getObject().getTimeInfo();
	}

	/**
	* Get the current date/time range that this layer is filtered by.
	*/
	public TimeExtent getTimeInterval()
	{
		return getObject().getTimeInterval();
	}

	/**
	* This method will return a list of.
	*/
	public Map getTimeOptions()
	{
		return (Map) getObject().getTimeOptions();
	}

	/**
	* Indicates whether or not this dynamic map service layer supports dynamic  layer functionality; that is the ability to change a layer's renderer and  data source.
	*/
	public boolean isDynamicLayersSupported()
	{
		return getObject().isDynamicLayersSupported();
	}

	/**
	* Indicates whether or not this particular layer instance is time aware.
	*/
	public boolean isTimeAware()
	{
		return getObject().isTimeAware();
	}

	/**
	* Supported on ArcGIS Server 10.01 and above.
	*/
	public boolean retrieveLegendInfo()
	{
		return getObject().retrieveLegendInfo();
	}

	/**
	* Specify a set of layer IDs with their DrawingInfos to override the way the layers are drawn.
	*/
//	public void setDrawingOptions(Map<Integer, DrawingInfo> drawingInfos)
//	{
//		getObject().setDrawingOptions(drawingInfos);
//		return;
//	}

	/**
	* Sets a list of DynamicLayerInfo instances that will be used to change  the drawing order and data sources of sub-layers of this dynamic map service.
	*/
//	public void setDynamicLayerInfos(List<DynamicLayerInfo> dynamicLayerInfos)
//	{
//		getObject().setDynamicLayerInfos(dynamicLayerInfos);
//		return;
//	}

	/**
	* Sets the layer definitions that are used to filter the features of individual layers in the map service.
	*/
//	public void setLayerDefinitions(Map<Integer, String> layerDefs)
//	{
//		getObject().setLayerDefinitions(layerDefs);
//		return;
//	}

	/**
	* Set the current date/time range that this layer will be filtered by.
	*/
	public void setTimeInterval(TimeExtent timeInterval)
	{
		getObject().setTimeInterval(timeInterval);
		return;
	}

	/**
	* Set a list of LayerTimeOptions.
	*/
//	public void setTimeOptions(Map<Integer, TimeOptions> timeOptions)
//	{
//		getObject().setTimeOptions(timeOptions);
//		return;
//	}


}
