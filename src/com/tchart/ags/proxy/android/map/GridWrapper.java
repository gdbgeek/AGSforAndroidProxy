package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.map.Grid;

@BA.Author("Trevor Hart")
@BA.ShortName("Grid")

public class GridWrapper  extends AbsObjectWrapper<Grid>
{
	public GridWrapper()
	{
	}

	public GridWrapper(Grid pGrid)
	{
		setObject(pGrid);
	}

	/**
	* Returns the type of the grid.
	*/
	public Grid.GridType getType()
	{
		return getObject().getType();
	}

	/**
	* Returns the visibility of the grid.
	*/
	public boolean getVisibility()
	{
		return getObject().getVisibility();
	}

	/**
	* Sets the type of grid displayed on the map.
	*/
	public void setType(Grid.GridType gridType)
	{
		getObject().setType(gridType);
		return;
	}

	/**
	* Sets the visibility of the grid.
	*/
	public void setVisibility(boolean visibility)
	{
		getObject().setVisibility(visibility);
		return;
	}


}
