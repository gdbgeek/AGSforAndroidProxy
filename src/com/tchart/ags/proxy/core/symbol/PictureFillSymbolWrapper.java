package com.tchart.ags.proxy.core.symbol;

import android.graphics.drawable.Drawable;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.PictureFillSymbol;

@BA.Author("Trevor Hart")
@BA.ShortName("PictureFillSymbol")

public class PictureFillSymbolWrapper  extends AbsObjectWrapper<PictureFillSymbol>
{
	public PictureFillSymbolWrapper()
	{
	}

	public PictureFillSymbolWrapper(PictureFillSymbol pPictureFillSymbol)
	{
		setObject(pPictureFillSymbol);
	}

//	/**
//	* Construct a new PictureFillSymbol by copying the given instance.
//	*/
//	public void Initialize(PictureFillSymbol other)
//	{
//		setObject(new PictureFillSymbol(other));
//	}

	/**
	* Creates a picture fill symbol from a drawable.
	*/
	public void Initialize1(Drawable drawable)
	{
		setObject(new PictureFillSymbol(drawable));
	}


//	/**
//	* Instantiates a new picture fill symbol from a JSON node.
//	*/
//	public void Initialize2(JsonNode node)
//	{
//		setObject(new PictureFillSymbol(node));
//	}



//	/**
//	* 
//	*/
//	public Symbol copy()
//	{
//		return getObject().copy();
//	}

	/**
	* Returns the image used to create the fill.
	*/
	public Drawable getDrawable()
	{
		return getObject().getDrawable();
	}

	/**
	* Returns the height of a tile.
	*/
	public float getHeight()
	{
		return getObject().getHeight();
	}

	/**
	* The offset specifies the distance between top left most point of the polygon to be filled and the top left hand corner of the image.
	*/
	public float getOffsetX()
	{
		return getObject().getOffsetX();
	}

	/**
	* The offset specifies the distance between top left most point of the polygon to be filled and the top left hand corner of the image.
	*/
	public float getOffsetY()
	{
		return getObject().getOffsetY();
	}

	/**
	* Returns the width of a tile.
	*/
	public float getWidth()
	{
		return getObject().getWidth();
	}

	/**
	* The offset specifies the distance between top left most point of the polygon to be filled and the top left hand corner of the image.
	*/
	public PictureFillSymbol setOffsetX(float offsetX)
	{
		return getObject().setOffsetX(offsetX);
	}

	/**
	* The offset specifies the distance between top left most point of the polygon to be filled and the top left hand corner of the image.
	*/
	public PictureFillSymbol setOffsetY(float offsetY)
	{
		return getObject().setOffsetY(offsetY);
	}

	/**
	* Sets the size.
	*/
	public PictureFillSymbol setSize(int width, int height)
	{
		return getObject().setSize(width, height);
	}

//	/**
//	* 
//	*/
//	public String toJson()
//	{
//		return getObject().toJson();
//	}


}
