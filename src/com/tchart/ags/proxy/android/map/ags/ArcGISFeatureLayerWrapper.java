package com.tchart.ags.proxy.android.map.ags;

import android.util.Log;
import anywheresoftware.b4a.BA;

import com.esri.android.map.ags.ArcGISFeatureLayer;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Polygon;
import com.esri.core.map.CallbackListener;
import com.esri.core.map.FeatureSet;
import com.esri.core.map.Field;
import com.esri.core.symbol.Symbol;
import com.esri.core.tasks.ags.query.Query;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISFeatureLayer")

public class ArcGISFeatureLayerWrapper  extends AbsObjectWrapper<ArcGISFeatureLayer>
{
	private String eventName;
	private BA eventBa;
	
	CallbackListener<FeatureSet> callback = new CallbackListener<FeatureSet>()
	{
		public void onCallback(FeatureSet fSet)
		{
			com.tchart.ags.proxy.core.map.FeatureSetWrapper fSetWrapper = new com.tchart.ags.proxy.core.map.FeatureSetWrapper();
			fSetWrapper.setObject(fSet);
			//eventBa.raiseEventFromDifferentThread(this, null,0,eventName + "_selectoncallback",false,new Object[] {fSet});
			eventBa.raiseEventFromUI(this, eventName + "_selectoncallback", new Object[] { fSetWrapper });
			Log.i("B4A", eventName + "_selectoncallback");
		}
		public void onError(Throwable arg0)
		{
			//ArcGISFeatureLayerWrapper.this.ba.raiseEventFromUI(this, eventName + "_selectonerror", new Object[] { "TEST" });
			Log.i("B4A", eventName + "_selectonerror");
		}
	};
	
	public ArcGISFeatureLayerWrapper()
	{		
	}	
	
	public ArcGISFeatureLayerWrapper(ArcGISFeatureLayer pArcGISFeatureLayer)
	{
		setObject(pArcGISFeatureLayer);
	}
	
	public void Initialize(String url, ArcGISFeatureLayer.MODE mode)
	{
		setObject(new ArcGISFeatureLayer(url, mode));	
	}
	
	public String getDisplayField ()
	{		
		return ((ArcGISFeatureLayer)getObject()).getDisplayField();
	}
	
	public Polygon getExtent()
	{
		return getObject().getExtent();
	}
	
	public Envelope getFullExtent()
	{
		return getObject().getFullExtent();
	}
	
	public void clear()
	{
		getObject().clear();
	}
	
	public void clearSelection()
	{
		getObject().clearSelection();
	}
	
	public void selectFeatures(BA ba, Query query, ArcGISFeatureLayer.SELECTION_METHOD selectionMethod, String callback_name)
	{
		eventBa = ba;
		eventName = callback_name;
		eventName = eventName.toLowerCase(BA.cul);
		getObject().selectFeatures(query, selectionMethod, callback);	
	}	
	
	public void setSelectionSymbol(Symbol selectionSymbol)
	{
		getObject().setSelectionSymbol(selectionSymbol);	
	}
	
	public List getFields()
	{
		List L = new List();		
		L.Initialize();		
		for (Field f : getObject().getFields())
		{
			L.Add(f);
		}
		return L;
	}
	
	public Field getField(String fieldName)
	{
		return getObject().getField(fieldName);
	}
	
	public void refresh()
	{
		getObject().refresh();
	}

	public void recycle()
	{
		getObject().recycle();
	}
}
