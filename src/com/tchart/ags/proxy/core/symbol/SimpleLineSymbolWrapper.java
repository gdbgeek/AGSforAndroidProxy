package com.tchart.ags.proxy.core.symbol;

import org.codehaus.jackson.JsonNode;

import anywheresoftware.b4a.BA;

import com.esri.core.symbol.SimpleLineSymbol;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("SimpleLineSymbol")

public class SimpleLineSymbolWrapper  extends AbsObjectWrapper<SimpleLineSymbol>
{
	public SimpleLineSymbolWrapper()
	{		
	}
	
	public SimpleLineSymbolWrapper(SimpleLineSymbol pSimpleLineSymbol)
	{
		setObject(pSimpleLineSymbol);
	}
	
	public void Initialize(int color, float width)
	{
		setObject(new SimpleLineSymbol(color,width));		
	}
	
	public void Initialize2(int color, float width, SimpleLineSymbol.STYLE style)
	{
		setObject(new SimpleLineSymbol(color,width,style));		
	}
	
	public void Initialize3(JsonNode node)
	{
		try {
			setObject(new SimpleLineSymbol(node));
		} catch (Exception e) {
			setObject(null);
		}		
	}
}