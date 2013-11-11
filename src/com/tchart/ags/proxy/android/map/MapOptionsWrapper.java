package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.map.MapOptions;

@BA.Author("Trevor Hart")
@BA.ShortName("MapOptions")

public class MapOptionsWrapper  extends AbsObjectWrapper<MapOptions>
{
	public MapOptionsWrapper()
	{
	}

	public MapOptionsWrapper(MapOptions pMapOptions)
	{
		setObject(pMapOptions);
	}

	/**
	* The constructor is used if you are instantiating the MapOptions using the give basemap.
	*/
	public void Initialize(MapOptions.MapType type)
	{
		setObject(new MapOptions(type));
	}

	/**
	* The constructor is used if you are instantiating the MapOptions using the give basemap,  map center and zoom level.
	*/
	public void Initialize1(MapOptions.MapType type, double lat, double lon, int zoom)
	{
		setObject(new MapOptions(type, lat, lon, zoom));
	}



	/**
	* Sets map center.
	*/
	public void setCenter(double lat, double lon)
	{
		getObject().setCenter(lat, lon);
		return;
	}

	/**
	* Sets zoom level.
	*/
	public void setZoom(int zoom)
	{
		getObject().setZoom(zoom);
		return;
	}


}
