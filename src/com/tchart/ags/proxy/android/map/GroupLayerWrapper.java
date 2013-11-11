package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import com.esri.android.map.GroupLayer;
import com.esri.android.map.Layer;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.SpatialReference;

@BA.Author("Trevor Hart")
@BA.ShortName("GroupLayer")

public class GroupLayerWrapper  extends AbsObjectWrapper<GroupLayer>
{
	public GroupLayerWrapper()
	{
	}

	public GroupLayerWrapper(GroupLayer pGroupLayer)
	{
		setObject(pGroupLayer);
	}

	/**
	* Creates a GroupLayer.
	*/
	public void Initialize()
	{
		setObject(new GroupLayer());
	}

	/**
	* The Constructor.
	*/
	public void Initialize1(boolean initLayer)
	{
		setObject(new GroupLayer(initLayer));
	}



	/**
	* Adds a layer to the current layer group by appending it to the bottom.
	*/
	public int addLayer(Layer layer)
	{
		return getObject().addLayer(layer);
	}

	/**
	* Inserts a layer object at certain position in the group layer.
	*/
	public boolean addLayer(Layer layer, int index)
	{
		return getObject().addLayer(layer, index);
	}

	/**
	* Adds an array of layers to the current layer group.
	*/
	public void addLayers(Layer[] layers)
	{
		getObject().addLayers(layers);
		return;
	}

	/**
	* Returns the size of the group layer.
	*/
	public int count()
	{
		return getObject().count();
	}

	/**
	* This method is used internally only.
	*/
	public long getAddGraphicsLayerRequestCallbackHandle()
	{
		return getObject().getAddGraphicsLayerRequestCallbackHandle();
	}

	/**
	* Gets the defaultSpatialReference of the Layer.
	*/
	public SpatialReference getDefaultSpatialReference()
	{
		return getObject().getDefaultSpatialReference();
	}

	/**
	* Returns the full extent of the layer.
	*/
	public Envelope getFullExtent()
	{
		return getObject().getFullExtent();
	}

	/**
	* Returns the layer for the given index position.
	*/
	public Layer getLayer(int index)
	{
		return getObject().getLayer(index);
	}

	/**
	* Returns the Layer object matching the given ID.
	*/
	public Layer getLayerByID(long layerId)
	{
		return getObject().getLayerByID(layerId);
	}

	/**
	* Returns the direct sublayers in an array.
	*/
	public List getLayers()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getLayers()) L.Add(o);
		return L;
	}

	/**
	* Returns all layers for the given layer name.
	*/
	public List getLayers(String layername)
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getLayers(layername)) L.Add(o);
		return L;
	}

	/**
	* Tests if the group contains the sublayer with given name.
	*/
	public boolean hasLayer(String layername)
	{
		return getObject().hasLayer(layername);
	}

	/**
	* Tests if the group contains the sublayer in the given index.
	*/
	public boolean hasLayer(int index)
	{
		return getObject().hasLayer(index);
	}

	/**
	* The initialization of a GroupLayer is depended upon if it is empty (return false
	*/
	public boolean isInitialized()
	{
		return getObject().isInitialized();
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
	* The sublayers are removed and destroyed from the group layers.
	*/
	public void removeAll()
	{
		getObject().removeAll();
		return;
	}

	/**
	* Removes the layer in the given index.
	*/
	public void removeLayer(int index)
	{
		getObject().removeLayer(index);
		return;
	}

	/**
	* Remove all layers by for the given name.
	*/
	public void removeLayers(String layerName)
	{
		getObject().removeLayers(layerName);
		return;
	}

	/**
	* Sets the opacity of the GroupLayer, it will change all opacity of it sublayers.
	*/
	public void setOpacity(float opacity)
	{
		getObject().setOpacity(opacity);
		return;
	}


}
