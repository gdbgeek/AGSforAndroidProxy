package com.tchart.ags.proxy.android.map;

//import com.esri.android.map.Layer;
import com.esri.android.map.Callout;
import com.esri.android.map.Grid;
import com.esri.android.map.Layer;
import com.esri.android.map.LocationService;
import com.esri.android.map.MapOptions;
import com.esri.android.map.MapView;
import com.esri.android.map.event.*;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Polygon;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.symbol.Symbol;
//import com.esri.android.map.ags.ArcGISFeatureLayer;
//import com.esri.android.map.ags.ArcGISFeatureLayer.MODE;
//import com.esri.android.map.ags.ArcGISFeatureLayer.Options;
//import com.esri.core.symbol.SimpleFillSymbol;
//import com.esri.core.symbol.SimpleLineSymbol;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
//import android.graphics.Color;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BA.DependsOn;
import anywheresoftware.b4a.BA.Permissions;
import anywheresoftware.b4a.objects.ViewWrapper;
import anywheresoftware.b4a.objects.collections.List;

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

	/**
	* Adds the child Layer at the given index.
	*/
	public int addLayer(Layer layer, int index)
	{
		return getObject().addLayer(layer, index);
	}

	/**
	* Adds the child Layer.
	*/
	public int addLayer1(Layer layer)
	{
		return getObject().addLayer(layer);
	}

	/**
	* Adds the Layer array.
	*/
	public void addLayers(Layer[] layerArray)
	{
		getObject().addLayers(layerArray);
		return;
	}
  
//  public Point toMapPoint(float screenx, float screeny)
//  {	  
//	  return ((MapView)getObject()).toMapPoint(screenx, screeny);	  
//  }
//  
//  public SpatialReference getSpatialReference()
//  {
//	  return getObject().getSpatialReference();
//  }
//  
//  public LocationService getLocationService()
//  {
//	  return getObject().getLocationService();
//  }
//  
//  public boolean isLoaded()
//  {
//	  return getObject().isLoaded();
//  }
//  
//  public double getScale()
//  {
//	  return getObject().getScale();
//  }
//  
//  public void setScale(double scale)
//  {
//	  getObject().setScale(scale);
//  }
//  
//  public void setExtent(Geometry geometry, int padding)
//  {
//	  getObject().setExtent(geometry, padding); 
//  }
//  
//  public Polygon getExtent()
//  {
//	  return getObject().getExtent(); 
//  }
  
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
	/**
	* If the MapView is initialized, centers the map at the given latitude and longitude and zoom the map based on the given factor.
	*/
	public void centerAndZoom(double lat, double lon, float levelOrFactor)
	{
		getObject().centerAndZoom(lat, lon, levelOrFactor);
		return;
	}

	/**
	* If the MapView is initialized, centers the map at the given latitude and longitude.
	*/
	public void centerAt(double lat, double lon, boolean animated)
	{
		getObject().centerAt(lat, lon, animated);
		return;
	}

	/**
	* If the MapView is initialized, centers the map at the given point.
	*/
	public void centerAt(Point centerPt, boolean animated)
	{
		getObject().centerAt(centerPt, animated);
		return;
	}

	/**
	* Returns a swatch image of the given geometry rendered with the specified symbol.
	*/
	public Bitmap createSymbolImage(Symbol symbol, Geometry geometry, int width, int height, int color)
	{
		return getObject().createSymbolImage(symbol, geometry, width, height, color);
	}

	/**
	* Returns a swatch image array of for the given geometries rendered with the symbols.
	*/
	public Bitmap[] createSymbolImages(Symbol[] symbol, Geometry[] geometry, int width, int height, int color)
	{
		return getObject().createSymbolImages(symbol, geometry, width, height, color);
	}

	/**
	* Enable or disable the map wrap around feature.
	*/
	public void enableWrapAround(boolean enable)
	{
		getObject().enableWrapAround(enable);
		return;
	}

	/**
	* 
	*/
//	public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs)
//	{
//		return getObject().generateLayoutParams(attrs);
//	}

	/**
	* Returns a callout window.
	*/
	public Callout getCallout()
	{
		return getObject().getCallout();
	}

	/**
	* Returns the center of the MapView as an ArcGIS geometry Point.
	*/
	public Point getCenter()
	{
		return getObject().getCenter();
	}

	/**
	* Creates a drawing cache of the map in the given screen coordinates.
	*/
	public Bitmap getDrawingMapCache(float x, float y, int w, int h)
	{
		return getObject().getDrawingMapCache(x, y, w, h);
	}

	/**
	* Returns a polygon comprising of four corners of map in map coordinates.
	*/
	public Polygon getExtent()
	{
		return getObject().getExtent();
	}

	/**
	* Returns the Grid instance of the map which allows for the type and visibility of the grid to be controlled.
	*/
	public Grid getGrid()
	{
		return getObject().getGrid();
	}

	/**
	* Gets a layer at the given index.
	*/
	public Layer getLayer(int index)
	{
		return getObject().getLayer(index);
	}

	/**
	* Gets a layer by its ID.
	*/
	public Layer getLayerByID(long layerID)
	{
		return getObject().getLayerByID(layerID);
	}

	/**
	* Gets a layer by its service URL.
	*/
	public Layer getLayerByURL(String url)
	{
		return getObject().getLayerByURL(url);
	}

	/**
	* Returns all child Layers that are added to the MapView.
	*/
	public List getLayers()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getLayers()) L.Add(o);
		return L;
	}

	/**
	* Returns the unique instance of the location service.
	*/
	public LocationService getLocationService()
	{
		return getObject().getLocationService();
	}

	/**
	* Returns the boundary extent of the map.
	*/
	public Envelope getMapBoundaryExtent()
	{
		return getObject().getMapBoundaryExtent();
	}

	/**
	* Gets the maximum resolution of the MapView.
	*/
	public double getMaxResolution()
	{
		return getObject().getMaxResolution();
	}

	/**
	* Gets the minimum resolution of the map.
	*/
	public double getMinResolution()
	{
		return getObject().getMinResolution();
	}

	/**
	* Gets the OnLongPressListener of the MapView.
	*/
	public OnLongPressListener getOnLongPressListener()
	{
		return getObject().getOnLongPressListener();
	}

	/**
	* Gets the OnPanListener of the MapView.
	*/
	public OnPanListener getOnPanListener()
	{
		return getObject().getOnPanListener();
	}

	/**
	* Gets the OnPinchListener of the MapView.
	*/
	public OnPinchListener getOnPinchListener()
	{
		return getObject().getOnPinchListener();
	}

	/**
	* Gets the onSingleTapListener of the MapView.
	*/
	public OnSingleTapListener getOnSingleTapListener()
	{
		return getObject().getOnSingleTapListener();
	}

	/**
	* Gets the OnStatusChangedListener of the MapView.
	*/
	public OnStatusChangedListener getOnStatusChangedListener()
	{
		return getObject().getOnStatusChangedListener();
	}

	/**
	* Gets the OnZoomListener of the MapView.
	*/
	public OnZoomListener getOnZoomListener()
	{
		return getObject().getOnZoomListener();
	}

	/**
	* Returns the resolution of the MapView.
	*/
	public double getResolution()
	{
		return getObject().getResolution();
	}

	/**
	* Returns the current map rotation angle(in degree
	*/
	public double getRotationAngle()
	{
		return getObject().getRotationAngle();
	}

	/**
	* A convenience method for obtaining the current map scale .
	*/
	public double getScale()
	{
		return getObject().getScale();
	}

	/**
	* Returns the spatial coordinate system being used by the MapView.
	*/
	public SpatialReference getSpatialReference()
	{
		return getObject().getSpatialReference();
	}

	/**
	* Returns true if the rotation by pinch is allowed.
	*/
	public boolean isAllowRotationByPinch()
	{
		return getObject().isAllowRotationByPinch();
	}

	/**
	* Returns true if the MapView is initialized.
	*/
	public boolean isLoaded()
	{
		return getObject().isLoaded();
	}

	/**
	* Returns true if the MapView has been recycled.
	*/
	public boolean isRecycled()
	{
		return getObject().isRecycled();
	}

	/**
	* This method checks whether the map will show the magnifier when the user performs a tap and hold gesture on the map.
	*/
	public boolean isShowMagnifierOnLongPress()
	{
		return getObject().isShowMagnifierOnLongPress();
	}

	/**
	* 
	*/
	public void onChildViewAdded(View parent, View child)
	{
		getObject().onChildViewAdded(parent, child);
		return;
	}

	/**
	* 
	*/
	public void onChildViewRemoved(View parent, View child)
	{
		getObject().onChildViewRemoved(parent, child);
		return;
	}

	/**
	* Pauses the map.
	*/
	public void pause()
	{
		getObject().pause();
		return;
	}

	/**
	* Releases the resources referenced by the MapView so that they can be recycled.
	*/
	public void recycle()
	{
		getObject().recycle();
		return;
	}

	/**
	* Removes all child layers from the map.
	*/
	public void removeAll()
	{
		getObject().removeAll();
		return;
	}

	/**
	* Removes a child layer at the given index.
	*/
	public void removeLayer(int index)
	{
		getObject().removeLayer(index);
		return;
	}

	/**
	* Removes the child Layer from the parent MapView.
	*/
	public void removeLayer(Layer layer)
	{
		getObject().removeLayer(layer);
		return;
	}

	/**
	* Restores the center and resolution of the MapView from the given String that is typically setup in an Activity's onPause()
	*/
	public void restoreState(String state)
	{
		getObject().restoreState(state);
		return;
	}

	/**
	* The MapView's state should be persisted using a String object.
	*/
	public String retainState()
	{
		return getObject().retainState();
	}

	/**
	* Flag to indicate if the map should pan when the magnifier gets near the edge  of the map's bounds.
	*/
	public void setAllowMagnifierToPanMap(boolean allow)
	{
		getObject().setAllowMagnifierToPanMap(allow);
		return;
	}

	/**
	* Allows/disallow pinch to rotate.
	*/
	public void setAllowRotationByPinch(boolean allowRotationByPinch)
	{
		getObject().setAllowRotationByPinch(allowRotationByPinch);
		return;
	}

	/**
	* Turns on or off the ESRI logo.
	*/
	public void setEsriLogoVisible(boolean visible)
	{
		getObject().setEsriLogoVisible(visible);
		return;
	}

	/**
	* Zooms into the given geometry so that geometry fits the bounds of the map.
	*/
	public void setExtent(Geometry geometry, int padding)
	{
		getObject().setExtent(geometry, padding);
		return;
	}

	/**
	* This method will zoom map into the given geometry and use its bound as current map extent.
	*/
	public void setExtent(Geometry geometry)
	{
		getObject().setExtent(geometry);
		return;
	}

	/**
	* Sets the map background with color and grid.
	*/
	public void setMapBackground(int bkColor, int gridColor, float gridSize, float gridLineSize)
	{
		getObject().setMapBackground(bkColor, gridColor, gridSize, gridLineSize);
		return;
	}

	/**
	* Switches basemap by the given options.
	*/
	public boolean setMapOptions(MapOptions options)
	{
		return getObject().setMapOptions(options);
	}

	/**
	* Sets the maximum resolution of the MapView.
	*/
	public void setMaxResolution(double maxResolution)
	{
		getObject().setMaxResolution(maxResolution);
		return;
	}

	/**
	* Sets the minimum resolution of the map.
	*/
	public void setMinResolution(double minResolution)
	{
		getObject().setMinResolution(minResolution);
		return;
	}

	/**
	* Sets the OnLongPressListener of the MapView.
	*/
	public void setOnLongPressListener(OnLongPressListener onLongPressListener)
	{
		getObject().setOnLongPressListener(onLongPressListener);
		return;
	}

	/**
	* Sets the OnPanListener of the MapView.
	*/
	public void setOnPanListener(OnPanListener onPanListener)
	{
		getObject().setOnPanListener(onPanListener);
		return;
	}

	/**
	* Sets the onPinchListener of the MapView.
	*/
	public void setOnPinchListener(OnPinchListener onPinchListener)
	{
		getObject().setOnPinchListener(onPinchListener);
		return;
	}

	/**
	* Sets the onSingleTapListener of the MapView.
	*/
	public void setOnSingleTapListener(OnSingleTapListener onSingleTapListener)
	{
		getObject().setOnSingleTapListener(onSingleTapListener);
		return;
	}

	/**
	* Sets the OnStatusChangedListener of the MapView.
	*/
	public void setOnStatusChangedListener(OnStatusChangedListener onStatusChangedListener)
	{
		getObject().setOnStatusChangedListener(onStatusChangedListener);
		return;
	}

	/**
	* Sets the OnZoomListener of the MapView.
	*/
	public void setOnZoomListener(OnZoomListener onZoomListener)
	{
		getObject().setOnZoomListener(onZoomListener);
		return;
	}

	/**
	* Sets the resolution of the MapView.
	*/
	public void setResolution(double res)
	{
		getObject().setResolution(res);
		return;
	}

	/**
	* The method will rotate the map in the given angle(in degree
	*/
	public void setRotationAngle(double degree, Point centerPt, boolean animated)
	{
		getObject().setRotationAngle(degree, centerPt, animated);
		return;
	}

	/**
	* The method will rotate the map in the given angle(in degree
	*/
	public void setRotationAngle(double degree)
	{
		getObject().setRotationAngle(degree);
		return;
	}

	/**
	* The method will rotate the map in the given angle(in degree
	*/
	public void setRotationAngle(double degree, float pivotX, float pivotY)
	{
		getObject().setRotationAngle(degree, pivotX, pivotY);
		return;
	}

	/**
	* A convenience method for setting the map scale .
	*/
	public void setScale(double scale)
	{
		getObject().setScale(scale);
		return;
	}

	/**
	* This methods sets whether or not the map should show the magnifier  when the user performs a tap and hold gesture on the map.
	*/
	public void setShowMagnifierOnLongPress(boolean showMagnifier)
	{
		getObject().setShowMagnifierOnLongPress(showMagnifier);
		return;
	}

	/**
	* A convenience method that will convert a device's screen coordinates to an ArcGIS geometry Point that has the same spatial coordinate system as the MapView's.
	*/
	public Point toMapPoint(float screenx, float screeny)
	{
		return getObject().toMapPoint(screenx, screeny);
	}

	/**
	* A convenience method that will convert a device's screen coordinates into an ArcGIS geometry Point that has the same spatial coordinate system as the MapView's.
	*/
	public Point toMapPoint(Point src)
	{
		return getObject().toMapPoint(src);
	}

	/**
	* A convenience method that will convert an ArcGIS geometry Point from the MapView's spatial coordinate system into the device's screen coordinates.
	*/
	public Point toScreenPoint(Point src)
	{
		return getObject().toScreenPoint(src);
	}

	/**
	* Unpauses the map.
	*/
	public void unpause()
	{
		getObject().unpause();
		return;
	}

	/**
	* If the MapView is initialized, zooms the map by a factor to the given center point.
	*/
	public void zoomTo(Point centerPt, float factor)
	{
		getObject().zoomTo(centerPt, factor);
		return;
	}

	/**
	* Centers the map on the given point and zoom into the given resolution level.
	*/
	public void zoomToResolution(Point centerPt, double res)
	{
		getObject().zoomToResolution(centerPt, res);
		return;
	}

	/**
	* Centers the map on the given point and zoom into the given scale level.
	*/
	public void zoomToScale(Point centerPt, double scale)
	{
		getObject().zoomToScale(centerPt, scale);
		return;
	}

	/**
	* Zooms in one level from current map resolution.
	*/
	public void zoomin()
	{
		getObject().zoomin();
		return;
	}

	/**
	* Zooms out one level from current map resolution.
	*/
	public void zoomout()
	{
		getObject().zoomout();
		return;
	}	
}
