package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import com.esri.core.geometry.CompositeGeographicTransformation;
import com.esri.core.geometry.GeographicTransformation;

@BA.Author("Trevor Hart")
@BA.ShortName("CompositeGeographicTransformation")

public class CompositeGeographicTransformationWrapper  extends AbsObjectWrapper<CompositeGeographicTransformation>
{
	public CompositeGeographicTransformationWrapper()
	{
	}

	public CompositeGeographicTransformationWrapper(CompositeGeographicTransformation pCompositeGeographicTransformation)
	{
		setObject(pCompositeGeographicTransformation);
	}




	/**
	* Adds a GeographicTransformation.
	*/
	public CompositeGeographicTransformation add(GeographicTransformation tx)
	{
		return getObject().add(tx);
	}

	/**
	* Returns the list of transformation.
	*/
	public List getTransformations()
	{
		return (List) getObject().getTransformations();
	}

	/**
	* Returns string representation of the class for debugging purposes.
	*/
	public String toString()
	{
		return getObject().toString();
	}


}
