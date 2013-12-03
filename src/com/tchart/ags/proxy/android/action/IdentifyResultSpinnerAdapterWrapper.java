package com.tchart.ags.proxy.android.action;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.action.IdentifyResultSpinnerAdapter;

@BA.Author("Trevor Hart")
@BA.ShortName("IdentifyResultSpinnerAdapter")

public class IdentifyResultSpinnerAdapterWrapper  extends AbsObjectWrapper<IdentifyResultSpinnerAdapter>
{
	public IdentifyResultSpinnerAdapterWrapper()
	{
	}

	public IdentifyResultSpinnerAdapterWrapper(IdentifyResultSpinnerAdapter pIdentifyResultSpinnerAdapter)
	{
		setObject(pIdentifyResultSpinnerAdapter);
	}

//	/**
//	* Constructor taking in a List of results intended to be displayed in a IdentifyResultSpinner.
//	*/
//	public void Initialize(Context context, List results)
//	{
//		setObject(new IdentifyResultSpinnerAdapter(context, results));
//	}



	/**
	* 
	*/
	public int getCount()
	{
		return getObject().getCount();
	}

	/**
	* 
	*/
	public View getDropDownView(int position, View convertView, ViewGroup parent)
	{
		return getObject().getDropDownView(position, convertView, parent);
	}

	/**
	* 
	*/
	public Object getItem(int position)
	{
		return getObject().getItem(position);
	}

	/**
	* 
	*/
	public long getItemId(int position)
	{
		return getObject().getItemId(position);
	}

	/**
	* 
	*/
	public int getItemViewType(int position)
	{
		return getObject().getItemViewType(position);
	}

	/**
	* 
	*/
	public View getView(int position, View convertView, ViewGroup parent)
	{
		return getObject().getView(position, convertView, parent);
	}

	/**
	* 
	*/
	public int getViewTypeCount()
	{
		return getObject().getViewTypeCount();
	}

	/**
	* 
	*/
	public boolean hasStableIds()
	{
		return getObject().hasStableIds();
	}

	/**
	* 
	*/
	public boolean isEmpty()
	{
		return getObject().isEmpty();
	}

	/**
	* 
	*/
	public void registerDataSetObserver(DataSetObserver observer)
	{
		getObject().registerDataSetObserver(observer);
		return;
	}

	/**
	* 
	*/
	public void unregisterDataSetObserver(DataSetObserver observer)
	{
		getObject().unregisterDataSetObserver(observer);
		return;
	}


}
