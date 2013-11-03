package com.tchart.ags.proxy.core.map;

//import android.util.Log;

import org.codehaus.jackson.JsonParser;

import anywheresoftware.b4a.BA;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.map.FeatureSet;
import com.esri.core.map.Field;
import com.esri.core.map.Graphic;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import anywheresoftware.b4a.objects.collections.Map;

@BA.Author("Trevor Hart")
@BA.ShortName("FeatureSet")

public class FeatureSetWrapper extends AbsObjectWrapper<FeatureSet>
{
	public FeatureSetWrapper()
	{		
	}	
	
	public FeatureSetWrapper(FeatureSet pFeatureSet)
	{
		setObject(pFeatureSet);
	}
	
	/**
	* 
	*/
	public boolean equals(Object obj)
	{
		return getObject().equals(obj);
	}

	/**
	* Decodes objects from JSON representation.
	*/
	public FeatureSet fromJson(JsonParser parser, boolean graphicsHaveSpatialRef, int maxResultsReturned)
	{
		try
		{
			return FeatureSet.fromJson(parser, graphicsHaveSpatialRef, maxResultsReturned);
		} catch (Exception e)
		{
			return null;
		}
}

	/**
	* Decodes objects from JSON representation.
	*/
	public FeatureSet fromJson(JsonParser parser)
	{
		try
		{
			return FeatureSet.fromJson(parser);
		} catch (Exception e)
		{
			return null;
		}
	}

	/**
	* Decodes objects from JSON representation.
	*/
	public static  FeatureSet fromJson(JsonParser parser, boolean graphicsHaveSpatialRef)
	{
		try
		{
			return FeatureSet.fromJson(parser, graphicsHaveSpatialRef);
		} catch (Exception e)
		{
			return null;
		}
	}

	/**
	* Decodes objects from JSON representation.
	*/
	public static  FeatureSet fromJson(JsonParser parser, int maxResults)
	{
		try
		{
			return FeatureSet.fromJson(parser, maxResults);
		} catch (Exception e)
		{
			return null;
		}
	}

	/**
	* Gets the name of the Display field.
	*/
	public String getDisplayFieldName()
	{
		return getObject().getDisplayFieldName();
	}

	/**
	* Gets the name alias pairs of all fields.
	*/
	public Map getFieldAliases()
	{
		return (Map) getObject().getFieldAliases();
	}

	/**
	* Gets the name of all fields.
	*/
	public List getFields()
	{
		return (List) getObject().getFields();
	}

	/**
	* Gets the geometry type of the graphics.
	*/
	public Geometry.Type getGeometryType()
	{
		return getObject().getGeometryType();
	}

	/**
	* Gets the graphics in the set.
	*/
	public List getGraphics()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getGraphics()) L.Add(o);
		return L;
	}

	/**
	* Gets the name of the ObjectId field.
	*/
	public String getObjectIdFieldName()
	{
		return getObject().getObjectIdFieldName();
	}

	/**
	* Gets the array of the ObjectIds in the FeatureSet.
	*/
	public Integer[] getObjectIds()
	{
		return getObject().getObjectIds();
	}

	/**
	* Gets the spatial reference of the FeatureSet.
	*/
	public SpatialReference getSpatialReference()
	{
		return getObject().getSpatialReference();
	}

	/**
	* 
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* Sets the name of the fields.
	*/
	public void setFields(java.util.List<Field> fields)
	{
		getObject().setFields(fields);
		return;
	}

	/**
	* Sets the graphics of the FeatureSet.
	*/
	public void setGraphics(Graphic[] graphics)
	{
		getObject().setGraphics(graphics);
		return;
	}

	/**
	* Sets the spatial reference of the FeatureSet.
	*/
	public void setSpatialReference(SpatialReference spatialReference)
	{
		getObject().setSpatialReference(spatialReference);
		return;
	}

	/**
	* Serializes a FeatureSet object into a JSON String.
	*/
	public String toJson(FeatureSet featureSet)
	{
		try{
			return FeatureSet.toJson(featureSet); 
		} catch (Exception e) {
			return null;
		}
	}

	/**
	* Returns string representation of the class.
	*/
	public String toString()
	{
		return getObject().toString();
	}
}
