package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.FontDecoration;
import com.esri.core.symbol.FontStyle;
import com.esri.core.symbol.FontWeight;
import com.esri.core.symbol.TextSymbol;

@BA.Author("Trevor Hart")
@BA.ShortName("TextSymbol")

public class TextSymbolWrapper  extends AbsObjectWrapper<TextSymbol>
{
	public TextSymbolWrapper()
	{
	}

	public TextSymbolWrapper(TextSymbol pTextSymbol)
	{
		setObject(pTextSymbol);
	}

//	/**
//	* Instantiates an object of TextSymbol from a JsonNode.
//	*/
//	public void Initialize(JsonNode node)
//	{
//		setObject(new TextSymbol(node));
//	}

	/**
	* Instantiates an object of TextSymbol in the specified size and color.
	*/
	public void Initialize1(int size, String text, int color, TextSymbol.HorizontalAlignment halign, TextSymbol.VerticalAlignment valign)
	{
		setObject(new TextSymbol(size, text, color, halign, valign));
	}

	/**
	* Instantiates an object of TextSymbol in the specified size and color.
	*/
	public void Initialize2(int size, String text, int color)
	{
		setObject(new TextSymbol(size, text, color));
	}

	/**
	* Instantiates an object of TextSymbol in the specified size and color.
	*/
	public void Initialize3(String fontFamily, String text, int color)
	{
		setObject(new TextSymbol(fontFamily, text, color));
	}

	/**
	* The Constructor.
	*/
	public void Initialize4(TextSymbol textSymbol)
	{
		setObject(new TextSymbol(textSymbol));
	}



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
	* Returns the color of the TextSymbol.
	*/
	public int getColor()
	{
		return getObject().getColor();
	}

	/**
	* 
	*/
	public FontDecoration getFontDecoration()
	{
		return getObject().getFontDecoration();
	}

	/**
	* 
	*/
	public String getFontFamily()
	{
		return getObject().getFontFamily();
	}

	/**
	* 
	*/
	public FontStyle getFontStyle()
	{
		return getObject().getFontStyle();
	}

	/**
	* 
	*/
	public FontWeight getFontWeight()
	{
		return getObject().getFontWeight();
	}

	/**
	* Gets the horizontalAlignment of the TextSymbol.
	*/
	public TextSymbol.HorizontalAlignment getHorizontalAlignment()
	{
		return getObject().getHorizontalAlignment();
	}

	/**
	* Returns the font size in pixels.
	*/
	public float getSize()
	{
		return getObject().getSize();
	}

	/**
	* Returns the text content of the symbol.
	*/
	public String getText()
	{
		return getObject().getText();
	}

	/**
	* Gets the verticalAlignment of the TextSymbol.
	*/
	public TextSymbol.VerticalAlignment getVerticalAlignment()
	{
		return getObject().getVerticalAlignment();
	}

	/**
	* 
	*/
	public int hashCode()
	{
		return getObject().hashCode();
	}

	/**
	* Sets the color to render the TextSymbol with.
	*/
	public void setColor(int color)
	{
		getObject().setColor(color);
		return;
	}

	/**
	* 
	*/
	public TextSymbol setFontDecoration(FontDecoration fontDecoration)
	{
		return getObject().setFontDecoration(fontDecoration);
	}

	/**
	* 
	*/
	public TextSymbol setFontFamily(String fontFamily)
	{
		return getObject().setFontFamily(fontFamily);
	}

	/**
	* 
	*/
	public TextSymbol setFontStyle(FontStyle fontStyle)
	{
		return getObject().setFontStyle(fontStyle);
	}

	/**
	* 
	*/
	public TextSymbol setFontWeight(FontWeight fontWeight)
	{
		return getObject().setFontWeight(fontWeight);
	}

	/**
	* Sets the horizontalAlignment of the TextSymbol.
	*/
	public TextSymbol setHorizontalAlignment(TextSymbol.HorizontalAlignment horizontalAlignment)
	{
		return getObject().setHorizontalAlignment(horizontalAlignment);
	}

	/**
	* Sets the font size.
	*/
	public TextSymbol setSize(float size)
	{
		return getObject().setSize(size);
	}

	/**
	* Sets the text content of the symbol.
	*/
	public TextSymbol setText(String text)
	{
		return getObject().setText(text);
	}

	/**
	* Sets the verticalAlignment of the TextSymbol.
	*/
	public TextSymbol setVerticalAlignment(TextSymbol.VerticalAlignment verticalAlignment)
	{
		return getObject().setVerticalAlignment(verticalAlignment);
	}

//	/**
//	* 
//	*/
//	public String toJson()
//	{
//		return getObject().toJson();
//	}


}
