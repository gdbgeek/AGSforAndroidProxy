package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.symbol.MultiLayerSymbol;

@BA.Author("Trevor Hart")
@BA.ShortName("MultiLayerSymbol")

public class MultiLayerSymbolWrapper  extends AbsObjectWrapper<MultiLayerSymbol>
{
	public MultiLayerSymbolWrapper()
	{
	}

	public MultiLayerSymbolWrapper(MultiLayerSymbol pMultiLayerSymbol)
	{
		setObject(pMultiLayerSymbol);
	}

	/**
	* The Constructor.
	*/
	public void Initialize()
	{
		setObject(new MultiLayerSymbol());
	}

//	/**
//	* The Constructor.
//	*/
//	public void Initialize1(JsonNode tempNode)
//	{
//		setObject(new MultiLayerSymbol(tempNode));
//	}

	/**
	* The Constructor.
	*/
	public void Initialize2(String jsonString)
	{
		setObject(new MultiLayerSymbol(jsonString));
	}



//	/**
//	* Gets a copy of this Symbol object.
//	*/
//	public MultiLayerSymbol copy()
//	{
//		return getObject().copy();
//	}

//	/**
//	* Converts the symbol to a Json String.
//	*/
//	public String toJson()
//	{
//		return getObject().toJson();
//	}


}
