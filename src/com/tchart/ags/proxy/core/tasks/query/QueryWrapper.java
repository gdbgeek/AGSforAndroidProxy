package com.tchart.ags.proxy.core.tasks.query;

import anywheresoftware.b4a.BA;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.tasks.SpatialRelationship;
import com.esri.core.tasks.ags.query.Query;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Query")

public class QueryWrapper  extends AbsObjectWrapper<Query>
{
	public QueryWrapper()
	{		
	}
	
	public QueryWrapper(Query pQuery)
	{
		setObject(pQuery);
	}
	
	public void Initialize()
	{
		setObject(new Query());		
	}
	
	public void setWhere(String where)
	{
		getObject().setWhere(where);
	}
	
	public String getWhere()
	{
		return getObject().getWhere();		
	}
	
	public void setReturnGeometry(boolean returnGeometry)
	{
		getObject().setReturnGeometry(returnGeometry);
	}
	
	public void setSpatialRelationship(SpatialRelationship spatialRelationship)
	{
		getObject().setSpatialRelationship(spatialRelationship);	
	}
	
	public SpatialReference	getInSpatialReference()
	{
		return getObject().getInSpatialReference();
	}
	
	public void setInSpatialReference(SpatialReference inSR)
	{
		getObject().setInSpatialReference(inSR);
	}
	
	public void setGeometry(Geometry geometry)
	{
		getObject().setGeometry(geometry);
	}
	
	public Geometry getGeometry()
	{
		return getObject().getGeometry();
	}
	
	public void setMaxAllowableOffset(double maxAllowableOffset)
	{
		getObject().setMaxAllowableOffset(maxAllowableOffset);
	}
	
	public double getMaxAllowableOffset()
	{
		return getObject().getMaxAllowableOffset();
	}
	
}
