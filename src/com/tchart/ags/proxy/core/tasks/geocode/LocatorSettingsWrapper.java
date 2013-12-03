package com.tchart.ags.proxy.core.tasks.geocode;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.core.tasks.geocode.LocatorSettings;

@BA.Author("Trevor Hart")
@BA.ShortName("LocatorSettings")

public class LocatorSettingsWrapper  extends AbsObjectWrapper<LocatorSettings>
{
	public LocatorSettingsWrapper()
	{
	}

	public LocatorSettingsWrapper(LocatorSettings pLocatorSettings)
	{
		setObject(pLocatorSettings);
	}

	/**
	* Default constructor for LocatorSettings.
	*/
	public void Initialize()
	{
		setObject(new LocatorSettings());
	}



	/**
	* Return whether or not relations will be cached.
	*/
	public boolean getCacheRelations()
	{
		return getObject().getCacheRelations();
	}

	/**
	* Returns whether or not redundant relations will be excluded.
	*/
	public boolean getExcludeRedundantRelations()
	{
		return getObject().getExcludeRedundantRelations();
	}

	/**
	* Returns the memory limit (in megabytes
	*/
	public long getMemoryLimit()
	{
		return getObject().getMemoryLimit();
	}

	/**
	* Return whether or not dictionaries will be preloaded.
	*/
	public boolean getPreloadDictionaries()
	{
		return getObject().getPreloadDictionaries();
	}

	/**
	* Set whether or not the locator will cache data loaded from relations.
	*/
	public void setCacheRelations(boolean cache)
	{
		getObject().setCacheRelations(cache);
		return;
	}

	/**
	* Sets whether or not the locator will load and use relations that can be replaced by other, more general relations.
	*/
	public void setExcludeRedundantRelations(boolean exclude)
	{
		getObject().setExcludeRedundantRelations(exclude);
		return;
	}

	/**
	* Sets the memory limit in megabytes for the locator.
	*/
	public void setMemoryLimit(long limit)
	{
		getObject().setMemoryLimit(limit);
		return;
	}

	/**
	* Set whether or not the locator will preload dictionaries into memory.
	*/
	public void setPreloadDictionaries(boolean preload)
	{
		getObject().setPreloadDictionaries(preload);
		return;
	}


}
