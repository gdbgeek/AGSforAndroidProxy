package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.geometry.Unit;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("SpatialReference")

public class SpatialReferenceWrapper  extends AbsObjectWrapper<SpatialReference>
{
	public SpatialReferenceWrapper()
	{		
	}
	
	public SpatialReferenceWrapper(SpatialReference pSpatialReference)
	{
		setObject(pSpatialReference);
	}
	
	//public void Initialize(String wktext)
	//{
	//	setObject(new SpatialReference(wktext));
	//}
	
	public void Initialize(int wkid)
	{
		setObject(SpatialReference.create(wkid));
	}
	
	public String getText()
	{		
		return ((SpatialReference)getObject()).getText();
	}
	
	public int getID()
	{
		return ((SpatialReference)getObject()).getID();
	}
	
	public Unit getUnit()
	{
		return getObject().getUnit();
	}	
}
