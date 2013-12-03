package com.tchart.ags.proxy.core.tasks.geocode;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.Map;

import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.tasks.geocode.LocatorGeocodeResult;

@BA.Author("Trevor Hart")
@BA.ShortName("LocatorGeocodeResult")

public class LocatorGeocodeResultWrapper  extends AbsObjectWrapper<LocatorGeocodeResult>
{
	public LocatorGeocodeResultWrapper()
	{
	}

	public LocatorGeocodeResultWrapper(LocatorGeocodeResult pLocatorGeocodeResult)
	{
		setObject(pLocatorGeocodeResult);
	}




	/**
	* 
	*/
	public boolean equals(Object obj)
	{
		return getObject().equals(obj);
	}

//	/**
//	* Creates a LocatorGeocodeResult object from its JSON String representation.
//	*/
//	public static  LocatorGeocodeResult fromJson(JsonParser parser)
//	{
//		return getObject().fromJson(parser);
//	}

	/**
	* Returns the formatted address.
	*/
	public String getAddress()
	{
		return getObject().getAddress();
	}

	/**
	* The attributes for this address candidate as defined in the service.
	*/
	public Map getAttributes()
	{
		return (Map) getObject().getAttributes();
	}

	/**
	* Returns the geocoding feature extent.
	*/
	public Envelope getExtent()
	{
		return getObject().getExtent();
	}

	/**
	* The location for this result.
	*/
	public Point getLocation()
	{
		return getObject().getLocation();
	}

	/**
	* Returns the score for this address candidate.
	*/
	public int getScore()
	{
		return getObject().getScore();
	}

	/**
	* The spatial reference of the location for this result.
	*/
	public SpatialReference getSpatialreference()
	{
		return getObject().getSpatialreference();
	}

	/**
	* 
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* Sets the spatial reference of the LocatorResult.
	*/
	public void setSpatialreference(SpatialReference spatialreference)
	{
		getObject().setSpatialreference(spatialreference);
		return;
	}

	/**
	* 
	*/
	public String toString()
	{
		return getObject().toString();
	}


}
