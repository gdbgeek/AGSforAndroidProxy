package com.tchart.ags.proxy.core.tasks.geocode;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.tasks.geocode.LocatorFindParameters;

@BA.Author("Trevor Hart")
@BA.ShortName("LocatorFindParameters")

public class LocatorFindParametersWrapper  extends AbsObjectWrapper<LocatorFindParameters>
{
	public LocatorFindParametersWrapper()
	{
	}

	public LocatorFindParametersWrapper(LocatorFindParameters pLocatorFindParameters)
	{
		setObject(pLocatorFindParameters);
	}

	/**
	* Constructs a FindParameters object with the given the search text.
	*/
	public void Initialize(String text)
	{
		setObject(new LocatorFindParameters(text));
	}



	/**
	* 
	*/
	public boolean equals(Object obj)
	{
		return getObject().equals(obj);
	}

	/**
	* Returns the search distance (meters
	*/
	public double getDistance()
	{
		return getObject().getDistance();
	}

	/**
	* Returns the spatial reference of search extent.
	*/
	public SpatialReference getInSR()
	{
		return getObject().getInSR();
	}

	/**
	* Returns the search location.
	*/
	public Point getLocation()
	{
		return getObject().getLocation();
	}

	/**
	* Returns the maximum number for returned candidates.
	*/
	public int getMaxLocations()
	{
		return getObject().getMaxLocations();
	}

	/**
	* Return a list of fields to be returned in the response.
	*/
	public List getOutFields()
	{
		return (List) getObject().getOutFields();
	}

	/**
	* Returns the output spatial reference of the xy coordinates for the geocode request.
	*/
	public SpatialReference getOutSR()
	{
		return getObject().getOutSR();
	}

	/**
	* Returns search extent.
	*/
	public Envelope getSearchExtent()
	{
		return getObject().getSearchExtent();
	}

	/**
	* Returns the source country set for this parameters object.
	*/
	public String getSourceCountry()
	{
		return getObject().getSourceCountry();
	}

	/**
	* Returns the search text string.
	*/
	public String getText()
	{
		return getObject().getText();
	}

	/**
	* 
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* Sets the search distance (meters
	*/
	public void setDistance(double distance)
	{
		getObject().setDistance(distance);
		return;
	}

	/**
	* Sets the search location.
	*/
	public void setLocation(Point location, SpatialReference sr)
	{
		getObject().setLocation(location, sr);
		return;
	}

	/**
	* Sets the maximum number for returned candidates.
	*/
	public void setMaxLocations(int maxLocations)
	{
		getObject().setMaxLocations(maxLocations);
		return;
	}

	/**
	* Sets a list of fields to be returned in the response.
	*/
	@SuppressWarnings("unchecked")
	public void setOutFields(List outFields)
	{
		getObject().setOutFields((java.util.List<String>) outFields);
		return;
	}

	/**
	* Sets the spatial reference for the xy coordinates returned by the geocode request.
	*/
	public void setOutSR(SpatialReference outSR)
	{
		getObject().setOutSR(outSR);
		return;
	}

	/**
	* Sets the search extent.
	*/
	public void setSearchExtent(Envelope searchExtent, SpatialReference inSR)
	{
		getObject().setSearchExtent(searchExtent, inSR);
		return;
	}

	/**
	* Sets a string value representing the country.
	*/
	public void setSourceCountry(String sourceCountry)
	{
		getObject().setSourceCountry(sourceCountry);
		return;
	}

	/**
	* Sets the search text.
	*/
	public void setText(String text)
	{
		getObject().setText(text);
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
