package com.tchart.ags.proxy.core.symbol;

import org.codehaus.jackson.JsonNode;

import anywheresoftware.b4a.BA;

//import com.esri.core.geometry.Point;
import com.esri.core.symbol.SimpleMarkerSymbol;
//import com.esri.core.symbol.Symbol;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("SimpleMarkerSymbol")

public class SimpleMarkerSymbolWrapper  extends AbsObjectWrapper<SimpleMarkerSymbol>
{
	public SimpleMarkerSymbolWrapper()
	{		
	}
	
	public SimpleMarkerSymbolWrapper(SimpleMarkerSymbol pSimpleMarkerSymbol)
	{
		setObject(pSimpleMarkerSymbol);
	}
	
	public void Initialize (int color, int size, SimpleMarkerSymbol.STYLE style)
	{
		setObject(new SimpleMarkerSymbol(color,size,style));		
	}
	
	public void Initialize2 (JsonNode node)
	{
		try {
			setObject(new SimpleMarkerSymbol(node));
		} catch (Exception e) {
			setObject(null);
		}		
	}
}
