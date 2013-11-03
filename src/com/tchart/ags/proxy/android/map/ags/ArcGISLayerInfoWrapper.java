package com.tchart.ags.proxy.android.map.ags;

import org.codehaus.jackson.JsonParser;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

import com.esri.android.map.ags.ArcGISLayerInfo;
import com.esri.core.map.Legend;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISLayerInfo")

public class ArcGISLayerInfoWrapper  extends AbsObjectWrapper<ArcGISLayerInfo>
{
	public ArcGISLayerInfoWrapper()
	{
	}

	public ArcGISLayerInfoWrapper(ArcGISLayerInfo pArcGISLayerInfo)
	{
		setObject(pArcGISLayerInfo);
	}

	/**
	* Instantiates an object of ArcGISLayerInfo.
	*/
	public void Initialize()
	{
		setObject(new ArcGISLayerInfo());
	}

	/**
	* Instantiates an object of ArcGISLayerInfo.
	*/
	public void Initialize1(String name, int id)
	{
		setObject(new ArcGISLayerInfo(name, id));
	}

	/**
	* Instantiates an object of ArcGISLayerInfo.
	*/
	public void Initialize2(String name, int id, ArcGISLayerInfo parent)
	{
		setObject(new ArcGISLayerInfo(name, id, parent));
	}

	/**
	* Create a new instance.
	*/
	public void Initialize3(JsonParser parser)
	{
		try {
			getObject().equals(ArcGISLayerInfo.fromJson(parser));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	* Returns the Id of the layer.
	*/
	public int getId()
	{
		return getObject().getId();
	}

	/**
	* If the layer is a group layer, then this method returns the immediate sub-layers of the group layer;.
	*/
	public ArcGISLayerInfo[] getLayers()
	{
		return getObject().getLayers();
	}

	/**
	* Gets the legend images and labels of the ArcGISLayerInfo.
	*/
	public List getLegend()
	{
		List L = new List();		
		L.Initialize();		
		for (Legend o : getObject().getLegend())
		{
			L.Add(o);
		}
		return L;
	}

	/**
	* Gets the maxScale of the ArcGISLayerInfo.
	*/
	public double getMaxScale()
	{
		return getObject().getMaxScale();
	}

	/**
	* Gets the minScale of the ArcGISLayerInfo.
	*/
	public double getMinScale()
	{
		return getObject().getMinScale();
	}

	/**
	* Returns the name of the layer.
	*/
	public String getName()
	{
		return getObject().getName();
	}

	/**
	* Gets the parent layer.
	*/
	public ArcGISLayerInfo getParentLayer()
	{
		return getObject().getParentLayer();
	}

	/**
	* Returns true if the legend of layer is shown.
	*/
	public boolean isShowLegend()
	{
		return getObject().isShowLegend();
	}

	/**
	* Returns true if the layer is set to visible; false otherwise.
	*/
	public boolean isVisible()
	{
		return getObject().isVisible();
	}

	/**
	* Sets the legend images and labels of the ArcGISLayerInfo.
	*/
	public void setLegend(List legend)
	{
		//getObject().setLegend(legend);
		return;
	}

	/**
	* Update the visibility of a layer.
	*/
	public void setVisible(boolean visible)
	{
		getObject().setVisible(visible);
		return;
	}
}
