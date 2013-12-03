package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.FontWeight;

@BA.Author("Trevor Hart")
@BA.ShortName("FontWeight")

public class FontWeightWrapper  extends AbsObjectWrapper<FontWeight>
{
	public FontWeightWrapper()
	{
	}

	public FontWeightWrapper(FontWeight pFontWeight)
	{
		setObject(pFontWeight);
	}

//	/**
//	* 
//	*/
//	public static  FontWeight fromString(String weight)
//	{
//		return getObject().fromString(weight);
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
//	public static  FontWeight valueOf(String name)
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
