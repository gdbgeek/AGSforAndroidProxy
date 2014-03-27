package com.tchart.ags.proxy.android.map;

import android.graphics.Bitmap;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
//import anywheresoftware.b4a.objects.collections.List;
//import anywheresoftware.b4a.objects.collections.Map;
import com.esri.android.map.GraphicsLayer;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.SpatialReference;
import com.esri.core.map.Graphic;
import com.esri.core.map.popup.PopupInfo;
import com.esri.core.renderer.Renderer;
import com.esri.core.symbol.Symbol;

@BA.Author("Trevor Hart")
@BA.ShortName("GraphicsLayer")

public class GraphicsLayerWrapper  extends AbsObjectWrapper<GraphicsLayer>
{
	public GraphicsLayerWrapper()
	{
	}

	public GraphicsLayerWrapper(GraphicsLayer pGraphicsLayer)
	{
		setObject(pGraphicsLayer);
	}

	/**
	* The constructor is used if your are instantiating an empty GraphicsLayer (see the class description for an example of this usage)
	*/
	public void Initialize()
	{
		setObject(new GraphicsLayer());
	}

	/**
	* Constructs the graphic layer with specific rendering mode.
	*/
	public void Initialize1(GraphicsLayer.RenderingMode mode)
	{
		setObject(new GraphicsLayer(mode));
	}

	/**
	* Constructs a Graphic layer with specific rotation mode for marker symbol, its rendering mode is dynamic.
	*/
	public void Initialize2(GraphicsLayer.MarkerRotationMode rotationMode)
	{
		setObject(new GraphicsLayer(rotationMode));
	}

	/**
	* The constructor with spatial reference, full extent and default dynamic rendering mode.
	*/
	public void Initialize3(SpatialReference sr, Envelope fullextent)
	{
		setObject(new GraphicsLayer(sr, fullextent));
	}

	/**
	* The constructor with spatial reference and full extent, and rendering mode.
	*/
	public void Initialize4(SpatialReference sr, Envelope fullextent, GraphicsLayer.RenderingMode mode)
	{
		setObject(new GraphicsLayer(sr, fullextent, mode));
	}



	/**
	* Adds a graphic into GraphicsLayer.
	*/
	public int addGraphic(Graphic graphic)
	{
		return getObject().addGraphic(graphic);
	}

	/**
	* Adds an array of Graphic.
	*/
	public int[] addGraphics(Graphic[] graphics)
	{
		return getObject().addGraphics(graphics);
	}

	/**
	* Brings the graphic to front.
	*/
	public void bringToFront(int id)
	{
		getObject().bringToFront(id);
		return;
	}

	/**
	* Clears the current selection.
	*/
	public void clearSelection()
	{
		getObject().clearSelection();
		return;
	}

	/**
	* 
	*/
	public PopupInfo createPopupInfo(Graphic graphic)
	{
		return getObject().createPopupInfo(graphic);
	}

	/**
	* Returns a swatch image of the given geometry rendered with the specified symbol.
	*/
	@SuppressWarnings("deprecation")
	public Bitmap createSymbolImage(Symbol symbol, Geometry geometry, int width, int height, int color)
	{
		return getObject().createSymbolImage(symbol, geometry, width, height, color);
	}

	/**
	* Returns a swatch image array of for the given geometries rendered with the symbols.
	*/
	@SuppressWarnings("deprecation")
	public Bitmap[] createSymbolImages(Symbol[] symbol, Geometry[] geometry, int width, int height, int color)
	{
		return getObject().createSymbolImages(symbol, geometry, width, height, color);
	}

	/**
	* Returns current draw order for the given graphic.
	*/
	public int getDrawOrder(int uid)
	{
		return getObject().getDrawOrder(uid);
	}

	/**
	* Retrives a graphic instance using a unique ID.
	*/
	public Graphic getGraphic(int uid)
	{
		return getObject().getGraphic(uid);
	}

	/**
	* Returns the graphics near the Point.
	*/
	public int[] getGraphicIDs(float x, float y, int tolerance)
	{
		return getObject().getGraphicIDs(x, y, tolerance);
	}

	/**
	* Retrieves an array of unique IDs representing all graphics in this layer.
	*/
	public int[] getGraphicIDs()
	{
		return getObject().getGraphicIDs();
	}

	/**
	* Returns the graphics near the Point.
	*/
	public int[] getGraphicIDs(float x, float y, int tolerance, int numberOfResults)
	{
		return getObject().getGraphicIDs(x, y, tolerance, numberOfResults);
	}

	/**
	* Returns the current maximum draw order of the graphics.
	*/
	public int getMaxDrawOrder()
	{
		return getObject().getMaxDrawOrder();
	}

	/**
	* Returns the current minimum draw order of the graphics.
	*/
	public int getMinDrawOrder()
	{
		return getObject().getMinDrawOrder();
	}

	/**
	* Returns number of graphics.
	*/
	public int getNumberOfGraphics()
	{
		return getObject().getNumberOfGraphics();
	}

	/**
	* Gets the renderer of the GraphicsLayer.
	*/
	public Renderer getRenderer()
	{
		return getObject().getRenderer();
	}

	/**
	* Returns the color applied to a selected feature.
	*/
	public int getSelectionColor()
	{
		return getObject().getSelectionColor();
	}

	/**
	* Returns an array of selected graphic ids.
	*/
	public int[] getSelectionIDs()
	{
		return getObject().getSelectionIDs();
	}

	/**
	* Returns true if the graphic with the supplied id is selected.
	*/
	public boolean isGraphicSelected(int id)
	{
		return getObject().isGraphicSelected(id);
	}

	/**
	* Removes all graphics.
	*/
	public void removeAll()
	{
		getObject().removeAll();
		return;
	}

	/**
	* Removes graphic using a unique ID.
	*/
	public void removeGraphic(int id)
	{
		getObject().removeGraphic(id);
		return;
	}

	/**
	* Sends the graphic to back.
	*/
	public void sendToBack(int id)
	{
		getObject().sendToBack(id);
		return;
	}

	/**
	* Sets visibility of a graphic with a unique id.
	*/
	public void setGraphicVisible(int uid, boolean visible)
	{
		getObject().setGraphicVisible(uid, visible);
		return;
	}

	/**
	* Sets the renderer of the GraphicsLayer.
	*/
	public void setRenderer(Renderer renderer)
	{
		getObject().setRenderer(renderer);
		return;
	}

	/**
	* Selects the graphics with the supplied ids.
	*/
	public void setSelectedGraphics(int[] ids, boolean selected)
	{
		getObject().setSelectedGraphics(ids, selected);
		return;
	}

	/**
	* Sets the color that is applied to a selected feature.
	*/
	public void setSelectionColor(int selectionColor)
	{
		getObject().setSelectionColor(selectionColor);
		return;
	}

	/**
	* Sets selection color width.
	*/
	public void setSelectionColorWidth(int highlightWidth)
	{
		getObject().setSelectionColorWidth(highlightWidth);
		return;
	}

	/**
	* Updates the attributes of a graphic specified by id with an attribute map.
	*/
//	public void updateGraphic(int id, Map<String, Object> attributes)
//	{
//		getObject().updateGraphic(id, attributes);
//		return;
//	}

	/**
	* Updates the draw order of the graphic.
	*/
	public void updateGraphic(int id, int drawOrder)
	{
		getObject().updateGraphic(id, drawOrder);
		return;
	}

	/**
	* Updates the geometry of a graphic specified by id with a geometry.
	*/
	public void updateGraphic(int id, Geometry geometry)
	{
		getObject().updateGraphic(id, geometry);
		return;
	}

	/**
	* Updates the symbol attribute of a graphic specified by id with a symbol.
	*/
	public void updateGraphic(int id, Symbol symbol)
	{
		getObject().updateGraphic(id, symbol);
		return;
	}

	/**
	* Updates a graphic specified by an id with attributes of another graphic instance.
	*/
	public void updateGraphic(int id, Graphic graphic)
	{
		getObject().updateGraphic(id, graphic);
		return;
	}

	/**
	* Updates an array of graphics with the corresponding draw order.
	*/
	public void updateGraphics(int[] ids, int[] drawOrder)
	{
		getObject().updateGraphics(ids, drawOrder);
		return;
	}

	/**
	* Updates the draw order of for a group graphics.
	*/
	public void updateGraphics(int[] ids, int drawOrder)
	{
		getObject().updateGraphics(ids, drawOrder);
		return;
	}


}
