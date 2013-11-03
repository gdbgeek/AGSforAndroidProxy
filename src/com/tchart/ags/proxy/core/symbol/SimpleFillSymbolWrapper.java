package com.tchart.ags.proxy.core.symbol;

import org.codehaus.jackson.JsonNode;

import anywheresoftware.b4a.BA;

import com.esri.core.symbol.LineSymbol;
import com.esri.core.symbol.SimpleFillSymbol;
//import com.esri.core.symbol.SimpleLineSymbol;

import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("SimpleFillSymbol")

public class SimpleFillSymbolWrapper  extends AbsObjectWrapper<SimpleFillSymbol>
{
	public SimpleFillSymbolWrapper()
	{		
	}
	
	public SimpleFillSymbolWrapper(SimpleFillSymbol pSimpleFillSymbol)
	{
		setObject(pSimpleFillSymbol);
	}
	
	public void Initialize(int color)
	{
		setObject(new SimpleFillSymbol(color));		
	}
	
	public void Initialize2(int color, SimpleFillSymbol.STYLE style)
	{
		setObject(new SimpleFillSymbol(color,style));		
	}
	
	public void Initialize3(JsonNode node)
	{
		try {
			setObject(new SimpleFillSymbol(node));
		} catch (Exception e) {
			setObject(null);
		}		
	}
	
	public void setOutline(LineSymbol outline)
	{
		getObject().setOutline(outline);
	}
	
	public LineSymbol getOutline()
	{
		return getObject().getOutline();
	}
}
