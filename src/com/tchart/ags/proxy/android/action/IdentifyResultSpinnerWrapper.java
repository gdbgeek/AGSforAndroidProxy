package com.tchart.ags.proxy.android.action;

import android.content.DialogInterface;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.action.IdentifyResultSpinner;

@BA.Author("Trevor Hart")
@BA.ShortName("IdentifyResultSpinner")

public class IdentifyResultSpinnerWrapper  extends AbsObjectWrapper<IdentifyResultSpinner>
{
	public IdentifyResultSpinnerWrapper()
	{
	}

	public IdentifyResultSpinnerWrapper(IdentifyResultSpinner pIdentifyResultSpinner)
	{
		setObject(pIdentifyResultSpinner);
	}

//	/**
//	* Constructor taking in a List of results intended to be displayed.
//	*/
//	public void Initialize(Context context, List identifyResults)
//	{
//		setObject(new IdentifyResultSpinner(context, identifyResults));
//	}



	/**
	* 
	*/
	public void onClick(DialogInterface dialog, int which)
	{
		getObject().onClick(dialog, which);
		return;
	}


}
