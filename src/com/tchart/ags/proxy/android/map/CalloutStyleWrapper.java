package com.tchart.ags.proxy.android.map;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.map.CalloutStyle;

@BA.Author("Trevor Hart")
@BA.ShortName("CalloutStyle")

public class CalloutStyleWrapper  extends AbsObjectWrapper<CalloutStyle>
{
	public CalloutStyleWrapper()
	{
	}

	public CalloutStyleWrapper(CalloutStyle pCalloutStyle)
	{
		setObject(pCalloutStyle);
	}

	/**
	* default constructor taking no input parameter.
	*/
	public void Initialize()
	{
		setObject(new CalloutStyle());
	}

	/**
	* constructor taking an Context object and an AttributeSet object.
	*/
	public void Initialize1(Context context, AttributeSet attrs)
	{
		setObject(new CalloutStyle(context, attrs));
	}



	/**
	* Returns the anchor position style of the callout window.
	*/
	public int getAnchor()
	{
		return getObject().getAnchor();
	}

	/**
	* Returns the background color alpha of the callout window.
	*/
	public int getBackgroundAlpha()
	{
		return getObject().getBackgroundAlpha();
	}

	/**
	* Returns the background color of the callout window.
	*/
	public int getBackgroundColor()
	{
		return getObject().getBackgroundColor();
	}

	/**
	* Returns the corner curve of the callout window.
	*/
	public int getCornerCurve()
	{
		return getObject().getCornerCurve();
	}

	/**
	* Returns the frame color of the callout window.
	*/
	public int getFrameColor()
	{
		return getObject().getFrameColor();
	}

	/**
	* Returns the maximum height the callout window can stretch to.
	*/
	public int getMaxHeight()
	{
		return getObject().getMaxHeight();
	}

	/**
	* Returns the maximum width the callout window can stretch to.
	*/
	public int getMaxWidth()
	{
		return getObject().getMaxWidth();
	}

	/**
	* Returns the color of title text of the callout window.
	*/
	public int getTitleTextColor()
	{
		return getObject().getTitleTextColor();
	}

	/**
	* Returns the size of title text of the callout window.
	*/
	public int getTitleTextSize()
	{
		return getObject().getTitleTextSize();
	}

	/**
	* Returns the style of title text of the callout window.
	*/
	public int getTitleTextStyle()
	{
		return getObject().getTitleTextStyle();
	}

	/**
	* Returns the type face of title text of the callout window.
	*/
	public Typeface getTitleTextTypeFace()
	{
		return getObject().getTitleTextTypeFace();
	}

	/**
	* Sets the position style of the anchor of callout window.
	*/
	public void setAnchor(int newAnchor)
	{
		getObject().setAnchor(newAnchor);
		return;
	}

	/**
	* Sets the background alpha of the callout window.
	*/
	public void setBackgroundAlpha(int backgroundAlpha)
	{
		getObject().setBackgroundAlpha(backgroundAlpha);
		return;
	}

	/**
	* Sets the background color of the callout window.
	*/
	public void setBackgroundColor(int backgroundColor)
	{
		getObject().setBackgroundColor(backgroundColor);
		return;
	}

	/**
	* Sets the corner curve of the callout window.
	*/
	public void setCornerCurve(int cornerCurve)
	{
		getObject().setCornerCurve(cornerCurve);
		return;
	}

	/**
	* Sets the frame color of the callout window.
	*/
	public void setFrameColor(int frameColor)
	{
		getObject().setFrameColor(frameColor);
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
	* Sets the color of title text of the callout window.
	*/
	public void setTitleTextColor(int titleTextColor)
	{
		getObject().setTitleTextColor(titleTextColor);
		return;
	}

	/**
	* Sets the size of title text of the callout window.
	*/
	public void setTitleTextSize(int titleTextSize)
	{
		getObject().setTitleTextSize(titleTextSize);
		return;
	}

	/**
	* Sets the color of title text of the callout window.
	*/
	public void setTitleTextStyle(int titleTextStyle)
	{
		getObject().setTitleTextStyle(titleTextStyle);
		return;
	}

	/**
	* Returns the type face of title text of the callout window.
	*/
	public void setTitleTextTypeFace(Typeface titleTextTypeFace)
	{
		getObject().setTitleTextTypeFace(titleTextTypeFace);
		return;
	}


}
