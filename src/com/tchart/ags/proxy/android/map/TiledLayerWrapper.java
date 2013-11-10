package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.map.TiledLayer;
import com.esri.core.map.Feature;

@BA.Author("Trevor Hart")
@BA.ShortName("TiledLayer")

public class TiledLayerWrapper  extends AbsObjectWrapper<TiledLayer>
{
	public TiledLayerWrapper()
	{
	}

	public TiledLayerWrapper(TiledLayer pTiledLayer)
	{
		setObject(pTiledLayer);
	}

	/**
	* Constructs a tiled layer.
	*/
//	public void Initialize(String url, boolean initLayer)
//	{
//		setObject(new TiledLayer(url, initLayer));
//	}

	/**
	* Constructs a tiled layer.
	*/
//	public void Initialize1(boolean initLayer)
//	{
//		setObject(TiledLayer(initLayer));
//		
//		TiledLayer x = TiledLayer
//	}



	/**
	* Cancels all current tile request.
	*/
	public void clearTiles()
	{
		getObject().clearTiles();
		return;
	}

	/**
	* Gets the brightness of the ArcGISTiledMapCacheLayer.
	*/
	public float getBrightness()
	{
		return getObject().getBrightness();
	}

	/**
	* Gets the contrast of the ArcGISTiledMapCacheLayer.
	*/
	public float getContrast()
	{
		return getObject().getContrast();
	}

	/**
	* Returns the current the level of detail(LOD
	*/
	public int getCurrentLevel()
	{
		return getObject().getCurrentLevel();
	}

	/**
	* Gets the gamma of the ArcGISTiledMapCacheLayer.
	*/
	public float getGamma()
	{
		return getObject().getGamma();
	}

	/**
	* Returns true if the popup allow the geometry to be updated, potentially based on some information carried by the Feature provided.
	*/
	public boolean isPopupAllowGeometryUpdate(Feature feature)
	{
		return getObject().isPopupAllowGeometryUpdate(feature);
	}

	/**
	* Returns true if the popup created is deletable, potentially based on some information carried by the Feature provided.
	*/
	public boolean isPopupDeletable(Feature feature)
	{
		return getObject().isPopupDeletable(feature);
	}

	/**
	* Returns true if the popup created is editable, potentially based on some information carried by the Feature provided.
	*/
	public boolean isPopupEditable(Feature feature)
	{
		return getObject().isPopupEditable(feature);
	}

	/**
	* Sets the brightness of the ArcGISTiledMapCacheLayer.
	*/
	public void setBrightness(float brightness)
	{
		getObject().setBrightness(brightness);
		return;
	}

	/**
	* Sets the contrast of the ArcGISTiledMapCacheLayer.
	*/
	public void setContrast(float contrast)
	{
		getObject().setContrast(contrast);
		return;
	}

	/**
	* Sets the gamma of the ArcGISTiledMapCacheLayer.
	*/
	public void setGamma(float gamma)
	{
		getObject().setGamma(gamma);
		return;
	}

	/**
	* Sets to true to render the tiled layer in native resolution.
	*/
	public void setRenderNativeResolution(boolean renderNativeResolution)
	{
		getObject().setRenderNativeResolution(renderNativeResolution);
		return;
	}


}
