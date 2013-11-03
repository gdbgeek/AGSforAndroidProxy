package com.tchart.ags.proxy.core.symbol;

//import org.codehaus.jackson.JsonNode;

import anywheresoftware.b4a.BA;
import com.esri.core.symbol.LineSymbol;
import anywheresoftware.b4a.AbsObjectWrapper;

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
	
	/*
	public void Initialize(JsonNode node)
	{
		try {
			setObject(new LineSymbol(node));
		} catch (Exception e) {
			setObject(null);
		}		
	}
	*/

}
