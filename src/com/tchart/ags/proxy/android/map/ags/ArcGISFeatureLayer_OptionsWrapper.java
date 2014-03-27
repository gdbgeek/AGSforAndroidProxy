package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
//import anywheresoftware.b4a.objects.collections.List;
//import anywheresoftware.b4a.objects.collections.Map;

import com.esri.android.map.ags.ArcGISFeatureLayer;
//import com.esri.android.map.ags.ArcGISFeatureLayer.Options;
import com.esri.android.map.ags.ArcGISFeatureLayer.MODE;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISFeatureLayer_Options")

public class ArcGISFeatureLayer_OptionsWrapper  extends AbsObjectWrapper<ArcGISFeatureLayer.Options>
{
	public static final String MODE_ONDEMAND = "ONDEMAND";
	public static final String MODE_SELECTION = "SELECTION";
	public static final String MODE_SNAPSHOT = "SNAPSHOT";	
	
	public ArcGISFeatureLayer_OptionsWrapper()
	{
	}

	public ArcGISFeatureLayer_OptionsWrapper(ArcGISFeatureLayer.Options pArcGISFeatureLayer_Options)
	{
		setObject(pArcGISFeatureLayer_Options);
	}
	
	public void Initialize()
	{			
		ArcGISFeatureLayer.Options pFO = new ArcGISFeatureLayer.Options();
		setObject(pFO);
	}

	public double getmaxAllowableOffset()
	{
		return  getObject().maxAllowableOffset;
	}
	
	public void setmaxAllowableOffset(double maxAllowableOffset)
	{
		getObject().maxAllowableOffset = maxAllowableOffset;
	}
	
	public String getmode()
	{
		return getObject().mode.toString();
	}
	
	public void setmode(String mode)
	{
		if (mode != null)
		{
			for (MODE b : MODE.values())
			{
				if (mode.equalsIgnoreCase(b.toString()))
				{
					getObject().mode = b;
				}
			}
		}
	}
	
	public String[] getoutFields()
	{
		return getObject().outFields;
	}
	
	public void setoutFields(String[] outFields)
	{
		getObject().outFields = outFields;
	}
}
