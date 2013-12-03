package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.AngularUnit;
import com.esri.core.geometry.Unit;

@BA.Author("Trevor Hart")
@BA.ShortName("AngularUnit")

public class AngularUnitWrapper  extends AbsObjectWrapper<AngularUnit>
{
	public AngularUnitWrapper()
	{
	}

	public AngularUnitWrapper(AngularUnit pAngularUnit)
	{
		setObject(pAngularUnit);
	}




	/**
	* Converts radian to the angular unit of the object.
	*/
	public double convertFromRadians(double radians)
	{
		return getObject().convertFromRadians(radians);
	}

	/**
	* Converts from the angular units of the object to radian units.
	*/
	public double convertToRadians(double valueToConvert)
	{
		return getObject().convertToRadians(valueToConvert);
	}

	/**
	* Indicates if this unit is the same type (linear, angular, or area
	*/
	public boolean equals(Object other)
	{
		return getObject().equals(other);
	}

	/**
	* Returns the abbreviated name of this unit.
	*/
	public String getAbbreviation()
	{
		return getObject().getAbbreviation();
	}

	/**
	* Returns the conversion factor.
	*/
	public double getConversionFactor(Unit dstUnit)
	{
		return getObject().getConversionFactor(dstUnit);
	}

	/**
	* Returns the display name of this unit.
	*/
	public String getDisplayName()
	{
		return getObject().getDisplayName();
	}

	/**
	* Returns the well-known ID.
	*/
	public int getID()
	{
		return getObject().getID();
	}

	/**
	* Returns the canonical name of the unit as defined in Projection Engine.
	*/
	public String getName()
	{
		return getObject().getName();
	}

	/**
	* Returns the plural display name of this unit.s
	*/
	public String getPluralDisplayName()
	{
		return getObject().getPluralDisplayName();
	}

	/**
	* Returns the unit type.
	*/
	public Unit.UnitType getUnitType()
	{
		return getObject().getUnitType();
	}


}
