package com.tchart.ags.proxy.android.action;

import android.content.Context;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.action.IdentifyResultView;
import com.esri.core.tasks.ags.identify.IdentifyResult;

@BA.Author("Trevor Hart")
@BA.ShortName("IdentifyResultView")

public class IdentifyResultViewWrapper  extends AbsObjectWrapper<IdentifyResultView>
{
	public IdentifyResultViewWrapper()
	{
	}

	public IdentifyResultViewWrapper(IdentifyResultView pIdentifyResultView)
	{
		setObject(pIdentifyResultView);
	}

	/**
	* Default constructor.
	*/
	public void Initialize(Context context)
	{
		setObject(new IdentifyResultView(context));
	}

	/**
	* Constructor taking in the IdentifyResult to display.
	*/
	public void Initialize1(Context context, IdentifyResult result)
	{
		setObject(new IdentifyResultView(context, result));
	}



	/**
	* Sets the result to display in this view.
	*/
	public void setResult(IdentifyResult result)
	{
		getObject().setResult(result);
		return;
	}


}
