package com.tchart.ags.proxy.core.symbol;

import android.graphics.drawable.Drawable;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.PictureMarkerSymbol;

@BA.Author("Trevor Hart")
@BA.ShortName("PictureMarkerSymbol")

public class PictureMarkerSymbolWrapper  extends AbsObjectWrapper<PictureMarkerSymbol>
{
	public PictureMarkerSymbolWrapper()
	{
	}

	public PictureMarkerSymbolWrapper(PictureMarkerSymbol pPictureMarkerSymbol)
	{
		setObject(pPictureMarkerSymbol);
	}

//	/**
//	* Instantiates an object of PictureMarkerSymbol from a JsonNode.
//	*/
//	public void Initialize(JsonNode node)
//	{
//		setObject(new PictureMarkerSymbol(node));
//	}

//	/**
//	* If you have multiple drawables to support different screen sizes and densities, use the constructor to instantiates a PictureMarkerSymbol to make image size same cross the different devices.
//	*/
//	public void Initialize1(Context context, Drawable drawable)
//	{
//		setObject(new PictureMarkerSymbol(context, drawable));
//	}

//	/**
//	* Instantiates a PictureMarkerSymbol with a Drawable image.
//	*/
//	public void Initialize2(Drawable drawable)
//	{
//		setObject(new PictureMarkerSymbol(drawable));
//	}

	/**
	* The Constructor.
	*/
	public void Initialize3(PictureMarkerSymbol symbol)
	{
		setObject(new PictureMarkerSymbol(symbol));
	}

//	/**
//	* Instantiates a PictureMarkerSymbol with a URL of an image.
//	*/
//	public void Initialize4(String pictureUrl)
//	{
//		setObject(new PictureMarkerSymbol(pictureUrl));
//	}



//	/**
//	* 
//	*/
//	public Symbol copy()
//	{
//		return getObject().copy();
//	}

	/**
	* 
	*/
	public boolean equals(Object obj)
	{
		return getObject().equals(obj);
	}

	/**
	* Returns the Drawable of the PictureMarkerSymbol.
	*/
	public Drawable getDrawable()
	{
		return getObject().getDrawable();
	}

	/**
	* 
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

//	/**
//	* 
//	*/
//	public String toJson()
//	{
//		return getObject().toJson();
//	}


}
