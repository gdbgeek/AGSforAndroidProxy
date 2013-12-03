package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.FontDecoration;

@BA.Author("Trevor Hart")
@BA.ShortName("FontDecoration")

public class FontDecorationWrapper  extends AbsObjectWrapper<FontDecoration>
{
	public FontDecorationWrapper()
	{
	}

	public FontDecorationWrapper(FontDecoration pFontDecoration)
	{
		setObject(pFontDecoration);
	}

//	/**
//	* 
//	*/
//	public static  FontDecoration fromString(String decoration)
//	{
//		return getObject().fromString(decoration);
//	}

	/**
	* 
	*/
	public String toString()
	{
		return getObject().toString();
	}

//	/**
//	* 
//	*/
//	public static  FontDecoration valueOf(String name)
//	{
//		return getObject().valueOf(name);
//	}

//	/**
//	* 
//	*/
//	public List values()
//	{
//		List L = new List();
//		L.Initialize();
//		for (Object o : getObject().values()) L.Add(o);
//		return L;
//	}


}
