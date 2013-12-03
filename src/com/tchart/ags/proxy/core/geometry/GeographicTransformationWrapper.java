package com.tchart.ags.proxy.core.geometry;

import org.codehaus.jackson.JsonParser;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.GeographicTransformation;

@BA.Author("Trevor Hart")
@BA.ShortName("GeographicTransformation")

public class GeographicTransformationWrapper  extends AbsObjectWrapper<GeographicTransformation>
{
	public GeographicTransformationWrapper()
	{
	}

	public GeographicTransformationWrapper(GeographicTransformation pGeographicTransformation)
	{
		setObject(pGeographicTransformation);
	}

	/**
	* Creates an instance of geographic transformation.
	*/
	public static GeographicTransformation create(int wkid, boolean transformForward)
	{
		return GeographicTransformation.create(wkid, transformForward);
	}

	/**
	* Creates an instance of geographic transformation.
	*/
	public static GeographicTransformation create(String wkt, boolean transformForward)
	{
		return GeographicTransformation.create(wkt, transformForward);
	}

	/**
	* 
	*/
	public static  GeographicTransformation create(String wkt)
	{
		return GeographicTransformation.create(wkt);
	}

	/**
	* 
	*/
	public static  GeographicTransformation create(int wkid)
	{
		return GeographicTransformation.create(wkid);
	}

	/**
	* 
	*/
	public static  GeographicTransformation fromJson(String json)
	{
		try {
			return GeographicTransformation.fromJson(json);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	* 
	*/
	public static  GeographicTransformation fromJson(JsonParser parser)
	{
		try {
			return GeographicTransformation.fromJson(parser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	* 
	*/
	public int getLatestWkid()
	{
		return getObject().getLatestWkid();
	}

	/**
	* Gets the well-known id that was set; 0 if not set.
	*/
	public int getWkid()
	{
		return getObject().getWkid();
	}

	/**
	* Gets the well-known text.
	*/
	public String getWkt()
	{
		return getObject().getWkt();
	}

	/**
	* 
	*/
	public boolean isTransformForward()
	{
		return getObject().isTransformForward();
	}

	/**
	* 
	*/
	public String toJson()
	{
		return getObject().toJson();
	}

	/**
	* Returns string representation of the class for debugging purposes.
	*/
	public String toString()
	{
		return getObject().toString();
	}


}
