package com.tchart.ags.proxy.android.map;

import android.view.View;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.map.Callout;
import com.esri.android.map.CalloutStyle;
import com.esri.android.map.MapView;
import com.esri.core.geometry.Point;

@BA.Author("Trevor Hart")
@BA.ShortName("Callout")

public class CalloutWrapper  extends AbsObjectWrapper<Callout>
{
	public CalloutWrapper()
	{
	}

	public CalloutWrapper(Callout pCallout)
	{
		setObject(pCallout);
	}

	/**
	* Constructor taking in MapView on which the callout window will be displayed.
	*/
	public void Initialize(MapView map)
	{
		setObject(new Callout(map));
	}



	/**
	* Hides the callout window with animation.
	*/
	public void animatedHide()
	{
		getObject().animatedHide();
		return;
	}

	/**
	* Displays the callout window with animation at the given coordinates with the provided content.
	*/
	public void animatedShow(Point coordinates, View newContent)
	{
		getObject().animatedShow(coordinates, newContent);
		return;
	}

	/**
	* Returns the map coordinates of the anchor point.
	*/
	public Point getCoordinates()
	{
		return getObject().getCoordinates();
	}

	/**
	* Returns the maximum height the callout window can stretch.
	*/
	public int getMaxHeight()
	{
		return getObject().getMaxHeight();
	}

	/**
	* Returns the maximum width the callout window can stretch.
	*/
	public int getMaxWidth()
	{
		return getObject().getMaxWidth();
	}

	/**
	* Returns an array of 2 integer values representing respectively the vertical and the horizontal offset of the anchor point relatively to the coordinates set for the anchor.
	*/
	public int[] getOffset()
	{
		return getObject().getOffset();
	}

	/**
	* Returns the style of current callout.
	*/
	public CalloutStyle getStyle()
	{
		return getObject().getStyle();
	}

	/**
	* Hides the callout window.
	*/
	public void hide()
	{
		getObject().hide();
		return;
	}

	/**
	* Returns whether the callout is currently displayed or not.
	*/
	public boolean isShowing()
	{
		return getObject().isShowing();
	}

	/**
	* Moves the callout window to the provided coordinates.
	*/
	public void move(Point newCoordinates)
	{
		getObject().move(newCoordinates);
		return;
	}

	/**
	* This method refreshes the content of the callout window for the content's change or update.
	*/
	public void refresh()
	{
		getObject().refresh();
		return;
	}

	/**
	* Sets the content of the callout window to display in callout window.
	*/
	public void setContent(View v)
	{
		getObject().setContent(v);
		return;
	}

	/**
	* Sets the anchor of the callout window to the given point in the map spatial reference.
	*/
	public void setCoordinates(Point coordinates)
	{
		getObject().setCoordinates(coordinates);
		return;
	}

	/**
	* Sets the maximum height the callout window can stretch to.
	*/
	public void setMaxHeight(int maxHeight)
	{
		getObject().setMaxHeight(maxHeight);
		return;
	}

	/**
	* Sets the maximum width the callout window can stretch to.
	*/
	public void setMaxWidth(int maxWidth)
	{
		getObject().setMaxWidth(maxWidth);
		return;
	}

	/**
	* Sets the vertical and the horizontal offset of the anchor point relatively to the coordinates set for the anchor.
	*/
	public void setOffset(int x, int y)
	{
		getObject().setOffset(x, y);
		return;
	}

	/**
	* Sts the style of the callout.
	*/
	public void setStyle(CalloutStyle style)
	{
		getObject().setStyle(style);
		return;
	}

	/**
	* Sets the style of the callout window from an XML resource id.
	*/
	public void setStyle(int xmlId)
	{
		getObject().setStyle(xmlId);
		return;
	}

	/**
	* Displays the callout window at the given point with the provided content.
	*/
	public void show(Point coordinates, View newContent)
	{
		getObject().show(coordinates, newContent);
		return;
	}

	/**
	* Displays the callout window.
	*/
	public void show()
	{
		getObject().show();
		return;
	}

	/**
	* Displays the callout window at the given point in the spatial reference of map view.
	*/
	public void show(Point coordinates)
	{
		getObject().show(coordinates);
		return;
	}


}
