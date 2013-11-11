package com.tchart.ags.proxy.android.map.ags;

import android.util.Log;
import anywheresoftware.b4a.BA;

import com.esri.android.map.GraphicsLayer;
import com.esri.android.map.ags.ArcGISFeatureLayer;
import com.esri.android.map.ags.ArcGISPopupInfo;
import com.esri.core.ags.LayerServiceCapabilities;
import com.esri.core.ags.LayerServiceInfo;
import com.esri.core.geometry.Geometry;
import com.esri.core.io.UserCredentials;
import com.esri.core.map.CallbackListener;
import com.esri.core.map.EditFieldsInfo;
import com.esri.core.map.EditInfo;
import com.esri.core.map.Feature;
import com.esri.core.map.FeatureSet;
import com.esri.core.map.FeatureTemplate;
import com.esri.core.map.FeatureType;
import com.esri.core.map.Field;
import com.esri.core.map.Graphic;
import com.esri.core.map.OwnershipBasedAccessControlForFeatures;
import com.esri.core.map.TimeExtent;
import com.esri.core.map.TimeInfo;
import com.esri.core.symbol.Symbol;
import com.esri.core.tasks.ags.query.Query;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISFeatureLayer")

public class ArcGISFeatureLayerWrapper  extends AbsObjectWrapper<ArcGISFeatureLayer>
{
	private String eventName;
	private BA eventBa;
	
	CallbackListener<FeatureSet> callback = new CallbackListener<FeatureSet>()
	{
		public void onCallback(FeatureSet fSet)
		{
			com.tchart.ags.proxy.core.map.FeatureSetWrapper fSetWrapper = new com.tchart.ags.proxy.core.map.FeatureSetWrapper();
			fSetWrapper.setObject(fSet);
			//eventBa.raiseEventFromDifferentThread(this, null,0,eventName + "_selectoncallback",false,new Object[] {fSet});
			eventBa.raiseEventFromUI(this, eventName + "_selectoncallback", new Object[] { fSetWrapper });
			Log.i("B4A", eventName + "_selectoncallback");
		}
		public void onError(Throwable arg0)
		{
			//ArcGISFeatureLayerWrapper.this.ba.raiseEventFromUI(this, eventName + "_selectonerror", new Object[] { "TEST" });
			Log.i("B4A", eventName + "_selectonerror");
		}
	};
	
	public ArcGISFeatureLayerWrapper()
	{		
	}	
	
	public ArcGISFeatureLayerWrapper(ArcGISFeatureLayer pArcGISFeatureLayer)
	{
		setObject(pArcGISFeatureLayer);
	}
	
	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code.
	*/
	public void Initialize(String url, ArcGISFeatureLayer.Options layerOption)
	{
		setObject(new ArcGISFeatureLayer(url, layerOption));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code.
	*/
	public void Initialize1(String url, ArcGISFeatureLayer.Options layerOption, UserCredentials credentials)
	{
		setObject(new ArcGISFeatureLayer(url, layerOption, credentials));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code.
	*/
	public void Initialize2(String url, ArcGISFeatureLayer.Options layerOption, UserCredentials credentials, boolean useAdvancedSymbols)
	{
		setObject(new ArcGISFeatureLayer(url, layerOption, credentials, useAdvancedSymbols));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code.
	*/
	public void Initialize3(String url, ArcGISFeatureLayer.Options layerOption, UserCredentials credentials, boolean useAdvancedSymbols, GraphicsLayer.RenderingMode rmode)
	{
		setObject(new ArcGISFeatureLayer(url, layerOption, credentials, useAdvancedSymbols, rmode));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code (see the class description for an example of this usage)
	*/
	public void Initialize4(String url, ArcGISFeatureLayer.MODE mode)
	{
		setObject(new ArcGISFeatureLayer(url, mode));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code.
	*/
	public void Initialize5(String url, String layerDefinition, ArcGISFeatureLayer.MODE mode)
	{
		setObject(new ArcGISFeatureLayer(url, layerDefinition, mode));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code (see the class description for an example of this usage)
	*/
	public void Initialize6(String url, String layerDefinition, ArcGISFeatureLayer.MODE mode, boolean initLayer)
	{
		setObject(new ArcGISFeatureLayer(url, layerDefinition, mode, initLayer));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code (see the class description for an example of this usage)
	*/
	public void Initialize7(String url, String layerDefinition, ArcGISFeatureLayer.MODE mode, boolean initLayer, UserCredentials credentials)
	{
		setObject(new ArcGISFeatureLayer(url, layerDefinition, mode, initLayer, credentials));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code (see the class description for an example of this usage)
	*/
	public void Initialize8(String url, String layerDefinition, ArcGISFeatureLayer.MODE mode, boolean initLayer, UserCredentials credentials, boolean useAdvancedSymbols)
	{
		setObject(new ArcGISFeatureLayer(url, layerDefinition, mode, initLayer, credentials, useAdvancedSymbols));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code (see the class description for an example of this usage)
	*/
	public void Initialize9(String url, String layerDefinition, ArcGISFeatureLayer.MODE mode, boolean initLayer, UserCredentials credentials, boolean useAdvancedSymbols, GraphicsLayer.RenderingMode rmode)
	{
		setObject(new ArcGISFeatureLayer(url, layerDefinition, mode, initLayer, credentials, useAdvancedSymbols, rmode));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using Java code.
	*/
	public void Initialize10(String url, ArcGISFeatureLayer.MODE mode, UserCredentials credentials)
	{
		setObject(new ArcGISFeatureLayer(url, mode, credentials));
	}

	/**
	* The constructor is used if you are instantiating the ArcGISFeatureLayer using a feature collection.
	*/
	public void Initialize11(String layerDefinition, FeatureSet featureCollection, ArcGISFeatureLayer.Options layerOption)
	{
		setObject(new ArcGISFeatureLayer(layerDefinition, featureCollection, layerOption));
	}

	/**
	* This constructor is to be used with a mapnotes layer defined in webmap only.
	*/
	public void Initialize12(String layerDef, String layerDefinitionOverride, FeatureSet featureCollection, ArcGISFeatureLayer.Options layerOption, boolean initLayer)
	{
		setObject(new ArcGISFeatureLayer(layerDef, layerDefinitionOverride, featureCollection, layerOption, initLayer));
	}



//	/**
//	* Adds an attachment to the feature specified by the ObjectId.
//	*/
//	public void addAttachment(int objectId, File file, CallbackListener<FeatureEditResult> callback)
//	{
//		getObject().addAttachment(objectId, file, callback);
//		return;
//	}
//
//	/**
//	* Adds an attachment to the feature specified by the ObjectId.
//	*/
//	public void addAttachment(int objectId, File file, String mime, CallbackListener<FeatureEditResult> callback)
//	{
//		getObject().addAttachment(objectId, file, mime, callback);
//		return;
//	}
//
//	/**
//	* Applies edits to the editable feature layer.
//	*/
//	public void applyEdits(Graphic[] adds, Graphic[] deletes, Graphic[] updates, CallbackListener<FeatureEditResult[][]> callback)
//	{
//		getObject().applyEdits(adds, deletes, updates, callback);
//		return;
//	}

	/**
	* Clears all selection and removes all graphics from the layer.
	*/
	public void clear()
	{
		getObject().clear();
		return;
	}

	/**
	* Clears the list of graphics to persist.
	*/
	public void clearPersistedGraphics()
	{
		getObject().clearPersistedGraphics();
		return;
	}

	/**
	* Clears the current selection.
	*/
	public void clearSelection()
	{
		getObject().clearSelection();
		return;
	}

	/**
	* Creates a new feature based on the specified feature SubType and feature template.
	*/
	public Graphic createFeatureWithTemplate(FeatureTemplate template, Geometry geometry)
	{
		return getObject().createFeatureWithTemplate(template, geometry);
	}

	/**
	* Creates a new feature based on the specified feature SubType.
	*/
	public Graphic createFeatureWithType(FeatureType type, Geometry geometry)
	{
		return getObject().createFeatureWithType(type, geometry);
	}

	/**
	* Creates the popup info.
	*/
	public ArcGISPopupInfo createPopupInfo()
	{
		return getObject().createPopupInfo();
	}

//	/**
//	* Deletes one or more attachments for the feature specified by the input ObjectId.
//	*/
//	public void deleteAttachments(int objectId, int[] attachmentids, CallbackListener<FeatureEditResult[]> callback)
//	{
//		getObject().deleteAttachments(objectId, attachmentids, callback);
//		return;
//	}

	/**
	* Returns the factor used to calculate buffered extent.
	*/
	public int getBufferFactor()
	{
		return getObject().getBufferFactor();
	}

	/**
	* Gets the capabilities object of the associated feature service.
	*/
	public LayerServiceCapabilities getCapabilities()
	{
		return getObject().getCapabilities();
	}

	/**
	* Returns the constraint factor that is used to determine whether a layer should be requeried when in OnDemand mode.amount.
	*/
	public double getConstraintFactor()
	{
		return getObject().getConstraintFactor();
	}

	/**
	* Returns the Metadata describing the default definition expression for the layer as defined by the service.
	*/
	public String getDefaultDefinitionExpression()
	{
		return getObject().getDefaultDefinitionExpression();
	}

	/**
	* Returns the current definition expression.
	*/
	public String getDefinitionExpression()
	{
		return getObject().getDefinitionExpression();
	}

	/**
	* Returns the name of the field that contains the Display Field for the layer.
	*/
	public String getDisplayField()
	{
		return getObject().getDisplayField();
	}

	/**
	* Gets the edit capabilities.
	*/
	public ArcGISFeatureLayer.EditCapabilities getEditCapabilities(Graphic graphic)
	{
		return getObject().getEditCapabilities(graphic);
	}

	/**
	* Gets the edit fields info.
	*/
	public EditFieldsInfo getEditFieldsInfo()
	{
		return getObject().getEditFieldsInfo();
	}

	/**
	* Gets the available editing information for the graphic.
	*/
	public EditInfo getEditInfo(Graphic graphic, EditInfo.ACTION_TYPE action)
	{
		return getObject().getEditInfo(graphic, action);
	}

	/**
	* Returns the time interval in seconds that features in the layer will expire when the layer is in ONDEMAND mode.
	*/
	public int getExpirationInterval()
	{
		return getObject().getExpirationInterval();
	}

	/**
	* This method returns the field object when the fieldname is passed in.
	*/
	public Field getField(String fieldName)
	{
		return getObject().getField(fieldName);
	}

	/**
	* The array of fields in the layer.
	*/
	public List getFields()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getFields()) L.Add(o);
		return L;
	}

	/**
	* Gets the type of the geometry holding by the feature layer.
	*/
	public Geometry.Type getGeometryType()
	{
		return getObject().getGeometryType();
	}

	/**
	* Returns the name of the field that contains the GlobalId field for the layer.
	*/
	public String getGlobalIdField()
	{
		return getObject().getGlobalIdField();
	}

	/**
	* Returns LayerServiceInfo.
	*/
	public LayerServiceInfo getLayerServiceInfo()
	{
		return getObject().getLayerServiceInfo();
	}

	/**
	* Returns the layer mode.
	*/
	public ArcGISFeatureLayer.MODE getMode()
	{
		return getObject().getMode();
	}

	/**
	* Returns the name of the field that contains the ObjectID field for the layer.
	*/
	public String getObjectIdField()
	{
		return getObject().getObjectIdField();
	}

	/**
	* The array of field names included in the feature layer based on the ArcGISFeatureLayer.Options.outFields parameter.
	*/
	public List getOutFields()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getOutFields()) L.Add(o);
		return L;
	}

	/**
	* Gets the ownership based access control for features.
	*/
	public OwnershipBasedAccessControlForFeatures getOwnershipBasedAccessControlForFeatures()
	{
		return getObject().getOwnershipBasedAccessControlForFeatures();
	}

	/**
	* Gets the PopupInfo associated with the sub-layer id.
	*/
	public ArcGISPopupInfo getPopupInfo(int sublayerId)
	{
		return getObject().getPopupInfo(sublayerId);
	}

	/**
	* Gets the PopupInfo associated with this feature layer.
	*/
	public ArcGISPopupInfo getPopupInfo()
	{
		return getObject().getPopupInfo();
	}

	/**
	* Returns the selected features.
	*/
	public List getSelectedFeatures()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getSelectedFeatures()) L.Add(o);
		return L;
	}

	/**
	* Returns the selection symbol for the feature layer.
	*/
	public Symbol getSelectionSymbol()
	{
		return getObject().getSelectionSymbol();
	}

	/**
	* Returns an array of feature templates defined in the feature service layer.
	*/
	public List getTemplates()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getTemplates()) L.Add(o);
		return L;
	}

	/**
	* Gets the valid TimeExtent object for the Layer or null if this service does not support time based queries.
	*/
	public TimeExtent getTimeExtent()
	{
		return getObject().getTimeExtent();
	}

	/**
	* Get all the time awareness information for this layer.
	*/
	public TimeInfo getTimeInfo()
	{
		return getObject().getTimeInfo();
	}

	/**
	* Get the current date/time range that this layer is filtered by.
	*/
	public TimeExtent getTimeInterval()
	{
		return getObject().getTimeInterval();
	}

	/**
	* Gets the type.
	*/
	public FeatureType getType(String type)
	{
		return getObject().getType(type);
	}

	/**
	* Returns the name of the field that contains the SubType field for the layer.
	*/
	public String getTypeIdField()
	{
		return getObject().getTypeIdField();
	}

	/**
	* Returns an array of feature types defined in the feature service layer.
	*/
	public List getTypes()
	{
		List L = new List();
		L.Initialize();
		for (Object o : getObject().getTypes()) L.Add(o);
		return L;
	}

	/**
	* True if attachments are enabled on the feature layer.
	*/
	public boolean hasAttachments()
	{
		return getObject().hasAttachments();
	}

	/**
	* Returns true if the geometry of the features in the layer can be edited.
	*/
	public boolean isAllowGeometryUpdates()
	{
		return getObject().isAllowGeometryUpdates();
	}

	/**
	* True if the layer will refresh automatically when the expiration interval is reached.
	*/
	public boolean isAutoRefreshOnExpiration()
	{
		return getObject().isAutoRefreshOnExpiration();
	}

	/**
	* Returns true if the feature layer is editable.
	*/
	public boolean isEditable()
	{
		return getObject().isEditable();
	}

	/**
	* Returns true if this PopupView is editable, false otherwise.
	*/
	public boolean isPopupAllowGeometryUpdate(Feature feature)
	{
		return getObject().isPopupAllowGeometryUpdate(feature);
	}

	/**
	* Returns true if this Popup is deletable, false otherwise.
	*/
	public boolean isPopupDeletable(Feature feature)
	{
		return getObject().isPopupDeletable(feature);
	}

	/**
	* Returns true if this Popup is editable, false otherwise.
	*/
	public boolean isPopupEditable(Feature feature)
	{
		return getObject().isPopupEditable(feature);
	}

	/**
	* Returns true if the type of layer is "Table".
	*/
	public boolean isTable()
	{
		return getObject().isTable();
	}

	/**
	* Indicates whether or not this particular layer instance is time aware.
	*/
	public boolean isTimeAware()
	{
		return getObject().isTimeAware();
	}

//	/**
//	* Queries for information about attachments associated with the specified ObjectIds.
//	*/
//	public void queryAttachmentInfos(BA ba, int objectId, String callback_name)
//	{		
//		eventBa = ba;
//		eventName = callback_name;
//		eventName = eventName.toLowerCase(BA.cul);
//		getObject().queryAttachmentInfos(objectId, callback);
//	}

//	/**
//	* Query features from the feature layer.
//	*/
//	public void queryFeatures(Query query, CallbackListener<FeatureSet> callback)
//	{
//		getObject().queryFeatures(query, callback);
//		return;
//	}

//	/**
//	* Query for ObjectIds.
//	*/
//	public void queryIds(Query query, CallbackListener<int[]> callback)
//	{
//		getObject().queryIds(query, callback);
//		return;
//	}

	/**
	* Releases resources referenced by the Layer so that they can be recycled.
	*/
	public void recycle()
	{
		getObject().recycle();
		return;
	}

	/**
	* Based on the mode of the feature layer, the method call can update the graphics from the associate service or refresh the layer from local cache.
	*/
	public void refresh()
	{
		getObject().refresh();
		return;
	}

	/**
	* Removes all graphics.
	*/
	public void removeAll()
	{
		getObject().removeAll();
		return;
	}

	/**
	* Removes graphic using a unique ID.
	*/
	public void removeGraphic(int id)
	{
		getObject().removeGraphic(id);
		return;
	}

//	/**
//	* Fetches the contents of the specified attachment.
//	*/
//	public InputStream retrieveAttachment(int objectId, int attachmentId)
//	{
//		return getObject().retrieveAttachment(objectId, attachmentId);
//	}

	/**
	* Selects features from the feature layer.
	*/
	public void selectFeatures(BA ba, Query query, ArcGISFeatureLayer.SELECTION_METHOD selectionMethod, String callback_name)
	{
		eventBa = ba;
		eventName = callback_name;
		eventName = eventName.toLowerCase(BA.cul);
		getObject().selectFeatures(query, selectionMethod, callback);	
	}

	/**
	* Specifies whether or not the layer will refresh automatically when the expiration interval is reached.
	*/
	public void setAutoRefreshOnExpiration(boolean autoRefreshOnExpiration)
	{
		getObject().setAutoRefreshOnExpiration(autoRefreshOnExpiration);
		return;
	}

	/**
	* Sets the factor used to calculate buffered extent.
	*/
	public void setBufferFactor(int bufferFactor)
	{
		getObject().setBufferFactor(bufferFactor);
		return;
	}

	/**
	* Constraint factor is used when the feature layer is in OnDemand mode.
	*/
	public void setConstraintFactor(double constraint)
	{
		getObject().setConstraintFactor(constraint);
		return;
	}

	/**
	* Sets the definition expression of the feature layer.
	*/
	public void setDefinitionExpression(String expression)
	{
		getObject().setDefinitionExpression(expression);
		return;
	}

	/**
	* The time interval in seconds that features in the layer will expire when the layer is in ONDEMAND mode.
	*/
	public void setExpirationInterval(int expirationInterval)
	{
		getObject().setExpirationInterval(expirationInterval);
		return;
	}

	/**
	* Sets visibility of a graphic with a unique id.
	*/
	public void setGraphicVisible(int uid, boolean visible)
	{
		getObject().setGraphicVisible(uid, visible);
		return;
	}

	/**
	* Sets a list of graphic ids to be either persisted or not persisted.
	*/
	public void setPersistedGraphics(int[] ids, boolean persisted)
	{
		getObject().setPersistedGraphics(ids, persisted);
		return;
	}

//	/**
//	* Sets the popup infos.
//	*/
//	public void setPopupInfos(Map<Integer, ArcGISPopupInfo> popUpInfos)
//	{
//		getObject().setPopupInfos(popUpInfos);
//		return;
//	}

	/**
	* Selects the graphics with the supplied ids.
	*/
	public void setSelectedGraphics(int[] ids, boolean selected)
	{
		getObject().setSelectedGraphics(ids, selected);
		return;
	}

	/**
	* Sets the selection symbol for the feature layer.
	*/
	public void setSelectionSymbol(Symbol selectionSymbol)
	{
		getObject().setSelectionSymbol(selectionSymbol);
		return;
	}

	/**
	* Set the current date/time range that this layer will be filtered by.
	*/
	public void setTimeInterval(TimeExtent timeExtent)
	{
		getObject().setTimeInterval(timeExtent);
		return;
	}
}
