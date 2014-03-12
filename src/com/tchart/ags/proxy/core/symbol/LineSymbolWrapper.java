package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.LineSymbol;

@BA.Author("Trevor Hart")
@BA.ShortName("LineSymbol")

public class LineSymbolWrapper  extends AbsObjectWrapper<LineSymbol>
{
	public LineSymbolWrapper()
	{
	}

	public LineSymbolWrapper(LineSymbol pLineSymbol)
	{
		setObject(pLineSymbol);
	}

//	/**
//	* Instantiates an object of LineSymbol from a JsonNode.
//	*/
//	public void Initialize(JsonNode node)
//	{
//		setObject(new LineSymbol(node));
//	}
//
//	/**
//	* Instantiates an empty object of LineSymbol.
//	*/
//	public void Initialize1()
//	{
//		setObject(new LineSymbol());
//	}



	/**
	* 
	*/
	public boolean equals(Object obj)
	{
		return getObject().equals(obj);
	}

	/**
	* Helper to getColor() that just returns the color's alpha value.
	*/
	public int getAlpha()
	{
		return getObject().getAlpha();
	}

	/**
	* Returns the color of the line.
	*/
	public int getColor()
	{
		return getObject().getColor();
	}

	/**
	* Returns the line width in pixels.
	*/
	public float getWidth()
	{
		return getObject().getWidth();
	}

	/**
	* 
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* AntiAliasing smoothes out the edges of what is being drawn, but is has no impact on the interior of the shape.
	*/
	public boolean isAntiAlias()
	{
		return getObject().isAntiAlias();
	}

	/**
	* Sets the symbol transparency.
	*/
	public LineSymbol setAlpha(int alpha)
	{
		return getObject().setAlpha(alpha);
	}

	/**
	* AntiAliasing smooths out the edges of what is being drawn, but is has no impact on the interior of the shape.
	*/
	public LineSymbol setAntiAlias(boolean antiAlias)
	{
		return getObject().setAntiAlias(antiAlias);
	}

	/**
	* Sets the color of the line.
	*/
	public LineSymbol setColor(int color)
	{
		return getObject().setColor(color);
	}

	/**
	* Sets the line width in pixels.
	*/
	public LineSymbol setWidth(float width)
	{
		return getObject().setWidth(width);
	}


}
