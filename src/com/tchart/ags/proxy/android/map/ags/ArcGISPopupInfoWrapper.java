package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

import com.esri.android.map.ags.ArcGISPopupInfo;
import com.esri.core.io.UserCredentials;
import com.esri.core.map.EditFieldsInfo;
import com.esri.core.map.FeatureTemplate;
import com.esri.core.map.FeatureType;
import com.esri.core.map.Field;
import com.esri.core.map.Graphic;
import com.esri.core.map.popup.PopupInfo;
import com.esri.core.portal.WebMapPopupInfo;
import com.esri.core.symbol.Symbol;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISPopupInfo")

public class ArcGISPopupInfoWrapper  extends AbsObjectWrapper<ArcGISPopupInfo>
{
	public ArcGISPopupInfoWrapper()
	{
	}

	public ArcGISPopupInfoWrapper(ArcGISPopupInfo pArcGISPopupInfo)
	{
		setObject(pArcGISPopupInfo);
	}

	/**
	* Constructor using WebMapPopupInfo to create the instance.
	*/
	public void Initialize(WebMapPopupInfo webMapPopupInfo)
	{
		setObject(new ArcGISPopupInfo(webMapPopupInfo));
	}

	/**
	* Constructor using a PopupInfo to create the instance.
	*/
	public void Initialize1(PopupInfo popupInfo)
	{
		setObject(new ArcGISPopupInfo(popupInfo));
	}

	/**
	* Creates the symbol from graphic.
	*/
	public Symbol createSymbolFromGraphic(Graphic graphic)
	{
		return getObject().createSymbolFromGraphic(graphic);
	}

	/**
	* Creates a symbol based on a provided feature template.
	*/
	public Symbol createSymbolFromTemplate(FeatureTemplate template)
	{
		return getObject().createSymbolFromTemplate(template);
	}

	/**
	* Fetch layer info.
	*/
	public void fetchLayerInfo(String layerInfoUrl, UserCredentials credentials)
	{
		try {
			getObject().fetchLayerInfo(layerInfoUrl, credentials);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

	/**
	* Gets the edit fields info.
	*/
	public EditFieldsInfo getEditFieldsInfo()
	{
		return getObject().getEditFieldsInfo();
	}

	/**
	* Returns a collection of a graphic's attributes (fields
	*/
	public Field getField(String fieldName)
	{
		return getObject().getField(fieldName);
	}

	/**
	* Gets the layer id.
	*/
	public int getLayerId()
	{
		return getObject().getLayerId();
	}

	/**
	* Gets the layer name.
	*/
	public String getLayerName()
	{
		return getObject().getLayerName();
	}

	/**
	* Gets the layer url.
	*/
	public String getLayerUrl()
	{
		return getObject().getLayerUrl();
	}

	/**
	* Gets the object id field.
	*/
	public String getObjectIdField()
	{
		return getObject().getObjectIdField();
	}

	/**
	* Returns a collection of FeatureType objects representing feature sub-types in the layer to which the graphic belongs.
	*/
	public FeatureType getType(String subType)
	{
		return getObject().getType(subType);
	}

	/**
	* Returns the name of the graphic's field which contains the sub-type information.
	*/
	public String getTypeIdField()
	{
		return getObject().getTypeIdField();
	}

	/**
	* Gets the feature types of this ArcGISPopupInfo if any.
	*/
	public List getTypes()
	{
		List L = new List();		
		L.Initialize();		
		for (FeatureType o : getObject().getTypes())
		{
			L.Add(o);
		}
		return L;
	}

	/**
	* Checks if is has attachments.
	*/
	public boolean isHasAttachments()
	{
		return getObject().isHasAttachments();
	}

	/**
	* Returns true if the popup is from a web map backed by a feature collection, false otherwise.
	*/
	public boolean isWebMapFeatureCollection()
	{
		return getObject().isWebMapFeatureCollection();
	}

	/**
	* Sets whether or not the popup is from a web map backed by a feature collection.
	*/
	public void setWebMapFeatureCollection(boolean webMapFeatureCollection)
	{
		getObject().setWebMapFeatureCollection(webMapFeatureCollection);
		return;
	}
}
