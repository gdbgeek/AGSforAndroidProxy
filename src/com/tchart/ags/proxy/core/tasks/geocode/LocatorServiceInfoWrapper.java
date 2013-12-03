package com.tchart.ags.proxy.core.tasks.geocode;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import anywheresoftware.b4a.objects.collections.Map;

import com.esri.core.geometry.SpatialReference;
import com.esri.core.tasks.geocode.LocatorFieldInfo;
import com.esri.core.tasks.geocode.LocatorServiceInfo;

@BA.Author("Trevor Hart")
@BA.ShortName("LocatorServiceInfo")

public class LocatorServiceInfoWrapper  extends AbsObjectWrapper<LocatorServiceInfo>
{
	public LocatorServiceInfoWrapper()
	{
	}

	public LocatorServiceInfoWrapper(LocatorServiceInfo pLocatorServiceInfo)
	{
		setObject(pLocatorServiceInfo);
	}




//	/**
//	* Parses the JSON representation pointed by JsonParser into a LocatorServiceInfo object
//	*/
//	public static  LocatorServiceInfo fromJson(JsonParser parser)
//	{
//		return getObject().fromJson(parser);
//	}

	/**
	* Returns the address fields defined for the Geocode service.
	*/
	public List getAddressFields()
	{
		return (List) getObject().getAddressFields();
	}

	/**
	* Returns the candidate fields defined for the Geocode service.
	*/
	public List getCandidateFields()
	{
		return (List) getObject().getCandidateFields();
	}

	/**
	* Gets the intersection candidate fields.
	*/
	public List getIntersectionCandidateFields()
	{
		return (List) getObject().getIntersectionCandidateFields();
	}

	/**
	* Returns the properties defined for the Geocode service.
	*/
	public Map getLocatorProperties()
	{
		return (Map) getObject().getLocatorProperties();
	}

	/**
	* Returns the description of the service, if any.
	*/
	public String getServiceDescription()
	{
		return getObject().getServiceDescription();
	}

	/**
	* Returns the single-line address field, or null if the service does not support  single-line geocoding.
	*/
	public LocatorFieldInfo getSingleLineAddressField()
	{
		return getObject().getSingleLineAddressField();
	}

	/**
	* Returns the default spatial reference defined for the Geocode service.
	*/
	public SpatialReference getSpatialReference()
	{
		return getObject().getSpatialReference();
	}

	/**
	* 
	*/
	public String toString()
	{
		return getObject().toString();
	}


}
