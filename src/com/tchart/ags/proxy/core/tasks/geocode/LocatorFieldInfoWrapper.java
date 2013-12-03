package com.tchart.ags.proxy.core.tasks.geocode;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.tasks.geocode.LocatorFieldInfo;

@BA.Author("Trevor Hart")
@BA.ShortName("LocatorFieldInfo")

public class LocatorFieldInfoWrapper  extends AbsObjectWrapper<LocatorFieldInfo>
{
	public LocatorFieldInfoWrapper()
	{
	}

	public LocatorFieldInfoWrapper(LocatorFieldInfo pLocatorFieldInfo)
	{
		setObject(pLocatorFieldInfo);
	}




	/**
	* Returns the alias of this field
	*/
	public String getAlias()
	{
		return getObject().getAlias();
	}

	/**
	* Returns the name of the field
	*/
	public String getName()
	{
		return getObject().getName();
	}

	/**
	* Returns the type of the field.
	*/
	public String getType()
	{
		return getObject().getType();
	}

	/**
	* Returns whether this field is required or not.
	*/
	public boolean isRequired()
	{
		return getObject().isRequired();
	}

	/**
	* 
	*/
	public String toString()
	{
		return getObject().toString();
	}


}
