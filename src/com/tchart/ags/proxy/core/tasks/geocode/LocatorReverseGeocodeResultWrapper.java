package com.tchart.ags.proxy.core.tasks.geocode;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.Map;

import com.esri.core.geometry.Point;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.tasks.geocode.LocatorReverseGeocodeResult;

@BA.Author("Trevor Hart")
@BA.ShortName("LocatorReverseGeocodeResult")

public class LocatorReverseGeocodeResultWrapper  extends AbsObjectWrapper<LocatorReverseGeocodeResult>
{
	public LocatorReverseGeocodeResultWrapper()
	{
	}

	public LocatorReverseGeocodeResultWrapper(LocatorReverseGeocodeResult pLocatorReverseGeocodeResult)
	{
		setObject(pLocatorReverseGeocodeResult);
	}




	/**
	* 
	*/
	public boolean equals(Object obj)
	{
		return getObject().equals(obj);
	}

//	/**
//	* Creates a LocatorReverseGeocodeResult object from its JSON String  representation.
//	*/
//	public static  LocatorReverseGeocodeResult fromJson(JsonParser parser)
//	{
//		return getObject().fromJson(parser);
//	}

	/**
	* Returns the address fields for this address candidate as a Map  of address field names to their corresponding values.
	*/
	public Map getAddressFields()
	{
		return (Map) getObject().getAddressFields();
	}

	/**
	* The location for this result.
	*/
	public Point getLocation()
	{
		return getObject().getLocation();
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
