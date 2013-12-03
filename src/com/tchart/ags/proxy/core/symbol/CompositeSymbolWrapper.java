package com.tchart.ags.proxy.core.symbol;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import com.esri.core.symbol.CompositeSymbol;
import com.esri.core.symbol.Symbol;

@BA.Author("Trevor Hart")
@BA.ShortName("CompositeSymbol")

public class CompositeSymbolWrapper  extends AbsObjectWrapper<CompositeSymbol>
{
	public CompositeSymbolWrapper()
	{
	}

	public CompositeSymbolWrapper(CompositeSymbol pCompositeSymbol)
	{
		setObject(pCompositeSymbol);
	}

	/**
	* Create an empty CompositeSymbol.
	*/
	public void Initialize()
	{
		setObject(new CompositeSymbol());
	}

//	/**
//	* Creates a CompositeSymbol from the given list.
//	*/
//	public void Initialize1(List symbols)
//	{
//		setObject(new CompositeSymbol(symbols));
//	}

//	/**
//	* Creates a CompositeSymbol from Json.
//	*/
//	public void Initialize2(JsonNode tempNode)
//	{
//		setObject(new CompositeSymbol(tempNode));
//	}



	/**
	* Adds a symbol to the list of symbols in this CompositeSymbol.
	*/
	public void add(Symbol symbol)
	{
		getObject().add(symbol);
		return;
	}

	/**
	* Gets a copy of this Symbol object.
	*/
	public Symbol copy()
	{
		try {
			return getObject().copy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	* Gets the list of symbols in this CompositeSymbol.
	*/
	public List getSymbols()
	{
		return (List) getObject().getSymbols();
	}

	/**
	* Removes all symbols form the list of symbols in this CompositeSymbol.
	*/
	public void removeAll()
	{
		getObject().removeAll();
		return;
	}

//	/**
//	* Sets the list of symbols in this CompositeSymbol.
//	*/
//	public void setSymbols(List<Symbol> symbols)
//	{
//		getObject().setSymbols(symbols);
//		return;
//	}

//	/**
//	* Converts the symbol to a Json String.
//	*/
//	public String toJson()
//	{
//		return getObject().toJson();
//	}


}
