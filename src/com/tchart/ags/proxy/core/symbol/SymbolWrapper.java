package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import com.esri.core.symbol.Symbol;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Symbol")

public class SymbolWrapper  extends AbsObjectWrapper<Symbol>
{
	public SymbolWrapper()
	{		
	}
	
	public SymbolWrapper(Symbol pSymbol)
	{
		setObject(pSymbol);
	}
}
