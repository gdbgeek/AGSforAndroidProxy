package com.tchart.ags.proxy.android.map;

//import com.esri.android.map.Layer;
import com.esri.android.map.Layer;
import com.esri.android.map.LocationService;
import com.esri.android.map.MapView;
import com.esri.android.map.event.*;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Polygon;
import com.esri.core.geometry.SpatialReference;
//import com.esri.android.map.ags.ArcGISFeatureLayer;
//import com.esri.android.map.ags.ArcGISFeatureLayer.MODE;
//import com.esri.android.map.ags.ArcGISFeatureLayer.Options;
//import com.esri.core.symbol.SimpleFillSymbol;
//import com.esri.core.symbol.SimpleLineSymbol;

import android.util.Log;
//import android.graphics.Color;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.DependsOn;
import anywheresoftware.b4a.BA.Permissions;
import anywheresoftware.b4a.objects.ViewWrapper;

@BA.ActivityObject
@BA.Author("Trevor Hart")
@BA.ShortName("MapView")
@BA.Version(10.20F)

@DependsOn(values = {"arcgis-android-api","arcgis-android-app-framework","jackson-core-lgpl-1.9.5","jackson-mapper-lgpl-1.9.5","jcifs-1.3.17"})
@Permissions(values = {"android.permission.INTERNET","android.permission.WRITE_EXTERNAL_STORAGE","android.permission.ACCESS_FINE_LOCATION"})

public class MapViewWrapper extends ViewWrapper<MapView>
{	
  static
  {
	System.loadLibrary("runtimecore_java");
  }
  
  public void Initialize(BA ba, String EventName)
  {	
    super.Initialize(ba, EventName);
  }

  @BA.Hide
  public void innerInitialize(final BA pBA, final String eventName, boolean keepOldObject)
  {
    if (!keepOldObject)
    {
      MapView mapView = new MapView(pBA.context);
      setObject(mapView);
    }
    super.innerInitialize(pBA, eventName, true);
    
    if (ba.subExists(eventName + "_onsingletaplistener"))
    {    	
    	getObject().setOnSingleTapListener(new OnSingleTapListener()
    	{
    		private static final long serialVersionUID = 1L;
    		
    		@Override
    		public void onSingleTap(float x, float y)
    		{
    			ba.raiseEventFromUI(this, eventName + "_onsingletaplistener", new Object[] { x,y });
    			Log.i("B4A", eventName + "_onsingletaplistener");
    		}
    	});
    }
    
    if (ba.subExists(eventName + "_onlongpresslistener"))
    {    	
    	getObject().setOnLongPressListener(new OnLongPressListener()       	
    	{
    		private static final long serialVersionUID = 1L;
    		
    		@Override
    		public boolean onLongPress(float x, float y)
    		{
    			//ba.raiseEvent(this, eventName + "_onlongpresslistener", new Object[] { x,y });
    			ba.raiseEventFromUI(this, eventName + "_onlongpresslistener", new Object[] { x,y });
    			//ba.raiseEventFromDifferentThread(this, null, 0, eventName + "_onlongpresslistener", false, new Object[] { x,y });
    			Log.i("B4A", eventName + "_onlongpresslistener");
				return true;   			
    		}
    	});
    }
    
    if (ba.subExists(eventName + "_onstatuschangedlistener"))
    {    	
    	getObject().setOnStatusChangedListener(new OnStatusChangedListener()       	
    	{
    		private static final long serialVersionUID = 1L;
    		
    		@Override
    		public void onStatusChanged(Object source, OnStatusChangedListener.STATUS status)
    		{
    			//ba.raiseEventFromUI(this, eventName + "_onstatuschangedlistener", new Object[] { source, status.toString() });
    			ba.raiseEventFromUI(this, eventName + "_onstatuschangedlistener", new Object[] { source, status.toString() });
    			//ba.raiseEvent(this, eventName + "_onstatuschangedlistener", new Object[] { "Test" });
    			Log.i("B4A", eventName + "_onstatuschangedlistener");
    		}
    	});
    }
    
  }

  public void Invalidate()
  {
    ((MapView)getObject()).postInvalidate();
    super.Invalidate();
  }

  public void addLayer(Layer layer)
  {   
      ((MapView)getObject()).addLayer(layer);
  }
  
  public Point toMapPoint(float screenx, float screeny)
  {	  
	  return ((MapView)getObject()).toMapPoint(screenx, screeny);	  
  }
  
  public SpatialReference getSpatialReference()
  {
	  return getObject().getSpatialReference();
  }
  
  public LocationService getLocationService()
  {
	  return getObject().getLocationService();
  }
  
  public boolean isLoaded()
  {
	  return getObject().isLoaded();
  }
  
  public double getScale()
  {
	  return getObject().getScale();
  }
  
  public void setScale(double scale)
  {
	  getObject().setScale(scale);
  }
  
  public void setExtent(Geometry geometry, int padding)
  {
	  getObject().setExtent(geometry, padding); 
  }
  
  public Polygon getExtent()
  {
	  return getObject().getExtent(); 
  }
  
  /*
  public void addFeatureLayer()
  {  
	  ArcGISFeatureLayer mFeatureLayer = null; 
	  
	  Options mOptions = new Options();  
      mOptions.mode = MODE.ONDEMAND;  
      mOptions.outFields = new String[] { "OBJECTID", "description", "inspected", "type"};  
    	                           
      String featureURL = "http://mobilesampleserver.arcgisonline.com/ArcGIS/rest/services/DemoData/incidents_service/FeatureServer/0";  
    	                                  
      mFeatureLayer = new ArcGISFeatureLayer(featureURL, mOptions);  
    	                                            
      SimpleFillSymbol selectFillSymbol = new SimpleFillSymbol(Color.MAGENTA);  
      selectFillSymbol.setOutline(new SimpleLineSymbol(Color.BLACK, 1));  
      mFeatureLayer.setSelectionSymbol(selectFillSymbol); 
      
      //mFeatureLayer.set
                                       
      ((MapView)getObject()).addLayer(mFeatureLayer);  
  }*/

  /*
  public void AddTileSource(ITileSource TileSource1)
  {
    if (!TileSourceFactory.containsTileSource(TileSource1.name()))
      TileSourceFactory.addTileSource(TileSource1);
  }
  */
}
