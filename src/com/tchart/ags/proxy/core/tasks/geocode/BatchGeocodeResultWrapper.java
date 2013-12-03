package com.tchart.ags.proxy.core.tasks.geocode;

import org.codehaus.jackson.JsonParser;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

import com.esri.core.geometry.SpatialReference;
import com.esri.core.tasks.geocode.BatchGeocodeResult;

@BA.Author("Trevor Hart")
@BA.ShortName("BatchGeocodeResult")

public class BatchGeocodeResultWrapper  extends AbsObjectWrapper<BatchGeocodeResult>
{
	public BatchGeocodeResultWrapper()
	{
	}

	public BatchGeocodeResultWrapper(BatchGeocodeResult pBatchGeocodeResult)
	{
		setObject(pBatchGeocodeResult);
	}

	/**
	* Construct a batch geocode result object from a JSON response.
	*/
	public BatchGeocodeResult fromJson(JsonParser parser)
	{
		try {
			return BatchGeocodeResult.fromJson(parser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	* Get a list of the results for the batch geocoding operation.
	*/
	public List getLocations()
	{
		return (List) getObject().getLocations();
	}

	/**
	* Get the spatial reference of the returned geometries.
	*/
	public SpatialReference getSpatialReference()
	{
		return getObject().getSpatialReference();
	}


}
