package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;

//import com.esri.core.geometry.Geometry;
//import com.esri.core.geometry.GeometryEngine;
//import com.esri.core.geometry.Point;
//import com.esri.core.geometry.Point;
//import com.esri.core.geometry.SpatialReference;
import com.esri.android.map.LocationService;
import com.esri.core.geometry.Point;
import com.esri.core.symbol.Symbol;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("LocationService")

public class LocationServiceWrapper  extends AbsObjectWrapper<LocationService>
{
	public LocationServiceWrapper()
	{		
	}	
	
	public LocationServiceWrapper(LocationService pLocationService)
	{
		setObject(pLocationService);
	}
	
	public void start()
	{
		getObject().start();
	}
	
	public void stop()
	{
		getObject().stop();
	}
	
	public void pause()
	{
		getObject().pause();
	}
	
	public void resume()
	{
		getObject().resume();
	}
	
	public Point getPoint()
	{
		return getObject().getPoint();		
	}
	
	public void setAccuracyCircleOn(boolean accuracyCircleOn)
	{
		getObject().setAccuracyCircleOn(accuracyCircleOn);
	}
	
	public boolean getAccuracyCircleOn()
	{
		return getObject().isAccuracyCircleOn();
	}
	
	public void setAutoPan(boolean autoPan)
	{
		getObject().setAutoPan(autoPan);
	}
	
	public boolean getAutoPan()
	{
		return getObject().isAutoPan();
	}
	
	public void setAllowNetworkLocation(boolean allowNetworkLocation)
	{
		getObject().setAllowNetworkLocation(allowNetworkLocation);
	}
	
	public boolean getAllowNetworkLocation()
	{
		return getObject().isAllowNetworkLocation();
	}
	
	public void setMaxAccuracyCircleSize(int maxSize)
	{
		getObject().setMaxAccuracyCircleSize(maxSize);
	}
	
	public int getMaxAccuracyCircleSize()
	{
		return getObject().getMaxAccuracyCircleSize();
	}
	
	public boolean isStarted()
	{
		return getObject().isStarted();
	}
	
	public Symbol getSymbol()
	{
		return getObject().getSymbol();
	}
	
	public void setSymbol(Symbol symbol)
	{
		getObject().setSymbol(symbol);
	}
}
