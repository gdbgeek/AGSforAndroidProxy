package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.Map;
import com.esri.android.map.Layer;
import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISPopupInfo;
import com.esri.android.map.event.OnStatusChangedListener;
import com.esri.android.map.popup.Popup;
import com.esri.android.map.popup.PopupLayoutInfo;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Polygon;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.io.UserCredentials;
import com.esri.core.map.Feature;

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

//	/**
//	* Instantiates an object of Layer.
//	*/
//	public void Initialize()
//	{
//		setObject(new Layer());
//	}



	/**
	* Creates a popup for a feature with the given layout.
	*/
	public Popup createPopup(MapView mapView, int sublayerId, Feature feature, PopupLayoutInfo layout, boolean useDefaultViews)
	{
		return getObject().createPopup(mapView, sublayerId, feature, layout, useDefaultViews);
	}

	/**
	* Creates a popup for a feature with the default layout.
	*/
	public Popup createPopup(MapView mapView, int sublayerId, Feature feature)
	{
		return getObject().createPopup(mapView, sublayerId, feature);
	}

	/**
	* Gets a copy of the credentials attached to the Layer.
	*/
	public UserCredentials getCredentials()
	{
		return getObject().getCredentials();
	}

	/**
	* Gets the defaultSpatialReference of the Layer.
	*/
	public SpatialReference getDefaultSpatialReference()
	{
		return getObject().getDefaultSpatialReference();
	}

	/**
	* Gets the current extent.
	*/
	public Polygon getExtent()
	{
		return getObject().getExtent();
	}

	/**
	* Returns the full extent of the layer.
	*/
	public Envelope getFullExtent()
	{
		return getObject().getFullExtent();
	}

	/**
	* Gets the height of the Layer in screen units.
	*/
	public int getHeight()
	{
		return getObject().getHeight();
	}

	/**
	* Return the Layer runtime ID which is a long integer.
	*/
	public long getID()
	{
		return getObject().getID();
	}

	/**
	* Gets max scale.
	*/
	public double getMaxScale()
	{
		return getObject().getMaxScale();
	}

	/**
	* Gets min scale.
	*/
	public double getMinScale()
	{
		return getObject().getMinScale();
	}

	/**
	* Gets the name of the layer.
	*/
	public String getName()
	{
		return getObject().getName();
	}

	/**
	* Gets the opacity of the Layer.
	*/
	public float getOpacity()
	{
		return getObject().getOpacity();
	}

	/**
	* Returns parent layer if the layer is in a group layer otherwise returning null.
	*/
	public Layer getParent()
	{
		return getObject().getParent();
	}

	/**
	* Gets the PopupInfo associated with the sub-layer id.
	*/
	public ArcGISPopupInfo getPopupInfo(int sublayerId)
	{
		return getObject().getPopupInfo(sublayerId);
	}

	/**
	* Gets the popup infos.
	*/
	public Map getPopupInfos()
	{
		return (Map) getObject().getPopupInfos();
	}

	/**
	* Gets the query url.
	*/
	public String getQueryUrl(int subLayerId)
	{
		return getObject().getQueryUrl(subLayerId);
	}

	/**
	* Gets the resolution of the Layer.
	*/
	public double getResolution()
	{
		return getObject().getResolution();
	}

	/**
	* Gets the current spatial reference of the Layer.
	*/
	public SpatialReference getSpatialReference()
	{
		return getObject().getSpatialReference();
	}

	/**
	* Gets the title of the Layer.
	*/
	public String getTitle()
	{
		return getObject().getTitle();
	}

	/**
	* Gets the URL of the map service associated with the layer.
	*/
	public String getUrl()
	{
		return getObject().getUrl();
	}

	/**
	* A convenience method that returns the hash code of the map service URL.
	*/
	public int getUrlHashCode()
	{
		return getObject().getUrlHashCode();
	}

	/**
	* Gets the web map layer id.
	*/
	public String getWebMapLayerID()
	{
		return getObject().getWebMapLayerID();
	}

	/**
	* Gets the width of the Layer in screen units.
	*/
	public int getWidth()
	{
		return getObject().getWidth();
	}

	/**
	* Gets the initialized of the Layer.
	*/
	public boolean IsInitialized()
	{
		return getObject().isInitialized();
	}

	/**
	* Returns true or false if the Layer object has been recycled.
	*/
	public boolean isRecycled()
	{
		return getObject().isRecycled();
	}

	/**
	* Returns true if rendering at native resolution is enabled.
	*/
	public boolean isRenderNativeResolution()
	{
		return getObject().isRenderNativeResolution();
	}

	/**
	* Returns true if legend of the layer will be shown up; by default it is true; The property is usually defined in the web map, a operation layer legend could be on or off.
	*/
	public boolean isShowLegend()
	{
		return getObject().isShowLegend();
	}

	/**
	* Gets the visibility of the Layer.
	*/
	public boolean isVisible()
	{
		return getObject().isVisible();
	}

	/**
	* Returns true if the layer is used as base layer in a web map.
	*/
	public boolean isWebMapBaselayer()
	{
		return getObject().isWebMapBaselayer();
	}

	/**
	* Releases resources referenced by the Layer so that they can be recycled.
	*/
	public void recycle()
	{
		getObject().recycle();
		return;
	}

	/**
	* Re-initializes the layer with the given credentials.
	*/
	public void reinitializeLayer(UserCredentials usercredentials)
	{
		getObject().reinitializeLayer(usercredentials);
		return;
	}

	/**
	* Sets max scale.
	*/
	public void setMaxScale(double maxScale)
	{
		getObject().setMaxScale(maxScale);
		return;
	}

	/**
	* Sets min scale.
	*/
	public void setMinScale(double minScale)
	{
		getObject().setMinScale(minScale);
		return;
	}

	/**
	* Sets the layer name.
	*/
	public void setName(String name)
	{
		getObject().setName(name);
		return;
	}

	/**
	* Sets the onStatusChangedListener.
	*/
	public void setOnStatusChangedListener(OnStatusChangedListener onStatusChangedListener)
	{
		getObject().setOnStatusChangedListener(onStatusChangedListener);
		return;
	}

	/**
	* Sets the opacity of the Layer.
	*/
	public void setOpacity(float opacity)
	{
		getObject().setOpacity(opacity);
		return;
	}

//	/**
//	* Sets the popup infos.
//	*/
//	public void setPopupInfos(Map popUpInfos)
//	{
//		getObject().setPopupInfos(popUpInfos);
//		return;
//	}
//
//	/**
//	* Sets the query urls.
//	*/
//	public void setQueryUrls(Map queryUrls)
//	{
//		getObject().setQueryUrls(queryUrls);
//		return;
//	}

	/**
	* Sets the visibility of the Layer.
	*/
	public void setVisible(boolean visible)
	{
		getObject().setVisible(visible);
		return;
	}


}
