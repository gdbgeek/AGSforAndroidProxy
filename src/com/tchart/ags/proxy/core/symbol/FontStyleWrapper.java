package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.FontStyle;

@BA.Author("Trevor Hart")
@BA.ShortName("FontStyle")

public class FontStyleWrapper  extends AbsObjectWrapper<FontStyle>
{
	public FontStyleWrapper()
	{
	}

	public FontStyleWrapper(FontStyle pFontStyle)
	{
		setObject(pFontStyle);
	}

//	/**
//	* 
//	*/
//	public static  FontStyle fromString(String style)
//	{
//		return getObject().fromString(style);
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
//	public static  FontStyle valueOf(String name)
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
