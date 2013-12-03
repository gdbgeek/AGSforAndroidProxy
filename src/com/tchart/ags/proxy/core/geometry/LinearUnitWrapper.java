package com.tchart.ags.proxy.core.geometry;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.geometry.LinearUnit;
import com.esri.core.geometry.Unit;

@BA.Author("Trevor Hart")
@BA.ShortName("LinearUnit")

public class LinearUnitWrapper  extends AbsObjectWrapper<LinearUnit>
{
	public LinearUnitWrapper()
	{
	}

	public LinearUnitWrapper(LinearUnit pLinearUnit)
	{
		setObject(pLinearUnit);
	}




	/**
	* Converts meters to this LinearUnit.
	*/
	public double convertFromMeters(double meters)
	{
		return getObject().convertFromMeters(meters);
	}

	/**
	* Converts this linear units to meters.
	*/
	public double convertToMeters(double thisUnitValue)
	{
		return getObject().convertToMeters(thisUnitValue);
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
	* Returns a conversion factor from this unit to the destination unit.
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
	* Returns the unit's well-known ID.
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
	* Returns the display name of this unit.
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
