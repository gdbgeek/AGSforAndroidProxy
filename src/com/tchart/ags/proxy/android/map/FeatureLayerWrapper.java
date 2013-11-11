package com.tchart.ags.proxy.android.map;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;
import com.esri.android.map.FeatureLayer;
import com.esri.android.map.popup.FeatureTablePopupInfo;
import com.esri.core.geometry.Geometry;
import com.esri.core.map.Feature;
import com.esri.core.map.FeatureResult;
import com.esri.core.renderer.Renderer;
import com.esri.core.table.FeatureTable;

@BA.Author("Trevor Hart")
@BA.ShortName("FeatureLayer")

public class FeatureLayerWrapper  extends AbsObjectWrapper<FeatureLayer>
{
	public FeatureLayerWrapper()
	{
	}

	public FeatureLayerWrapper(FeatureLayer pFeatureLayer)
	{
		setObject(pFeatureLayer);
	}

	/**
	* Constructs the FeatureLayer with given FeatureTable.
	*/
	public void Initialize(FeatureTable featureTable)
	{
		setObject(new FeatureLayer(featureTable));
	}



	/**
	* Clears the current feature selection.
	*/
	public void clearSelection()
	{
		getObject().clearSelection();
		return;
	}

	/**
	* Creates the popup info.
	*/
	public FeatureTablePopupInfo createPopupInfo()
	{
		return getObject().createPopupInfo();
	}

	/**
	* Obtains the Feature object by its ID.
	*/
	public Feature getFeature(long oid)
	{
		return getObject().getFeature(oid);
	}

	/**
	* Identifies the features for the givens device screen coordinates and search tolerance.The method returns found feature IDs.
	*/
	public long[] getFeatureIDs(float x, float y, int tolerance)
	{
		return getObject().getFeatureIDs(x, y, tolerance);
	}

	/**
	* Identifies the features for the givens device screen coordinates and search tolerance.The method returns found feature IDs with limited result.
	*/
	public long[] getFeatureIDs(float x, float y, int tolerance, int numberOfResults)
	{
		return getObject().getFeatureIDs(x, y, tolerance, numberOfResults);
	}

	/**
	* Returns the feature table of the layer representing.
	*/
	public FeatureTable getFeatureTable()
	{
		return getObject().getFeatureTable();
	}

	/**
	* Returns the geometry type.
	*/
	public Geometry.Type getGeometryType()
	{
		return getObject().getGeometryType();
	}

	/**
	* Gets the Renderer of the layer.
	*/
	public Renderer getRenderer()
	{
		return getObject().getRenderer();
	}

	/**
	* Returns the selected features in a list.
	*/
	public List getSelectedFeatures()
	{
		return (List) getObject().getSelectedFeatures();
	}

	/**
	* Returns the color applied to a selected feature.
	*/
	public int getSelectionColor()
	{
		return getObject().getSelectionColor();
	}

	/**
	* Returns an array of selected features ids.
	*/
	public long[] getSelectionIDs()
	{
		return getObject().getSelectionIDs();
	}

	/**
	* Return true if labeling is enabled for the layer, otherwise false.
	*/
	public boolean isEnabledLabels()
	{
		return getObject().isEnabledLabels();
	}

	/**
	* Tests if the feature with given Id is selected or not
	*/
	public boolean isFeatureSelected(long fid)
	{
		return getObject().isFeatureSelected(fid);
	}

	/**
	* Returns true if the popup allow the geometry to be updated, potentially based on some information carried by the Feature provided.
	*/
	public boolean isPopupAllowGeometryUpdate(Feature feature)
	{
		return getObject().isPopupAllowGeometryUpdate(feature);
	}

	/**
	* Returns true if the popup created is deletable, potentially based on some information carried by the Feature provided.
	*/
	public boolean isPopupDeletable(Feature feature)
	{
		return getObject().isPopupDeletable(feature);
	}

	/**
	* Returns true if the popup created is editable, potentially based on some information carried by the Feature provided.
	*/
	public boolean isPopupEditable(Feature feature)
	{
		return getObject().isPopupEditable(feature);
	}

	/**
	* Selects the feature for the given feature ID
	*/
	public void selectFeature(long oid)
	{
		getObject().selectFeature(oid);
		return;
	}

	/**
	* Set selected features with given feature IDs, the selected feature will be highlighted.
	*/
	public void selectFeatures(long[] oids, boolean inclusive)
	{
		getObject().selectFeatures(oids, inclusive);
		return;
	}

	/**
	* Query the feature layer.
	*/
//	public Future<FeatureResult> selectFeatures(QueryParameters queryParams, ArcGISFeatureLayer.SELECTION_METHOD select, CallbackListener<FeatureResult> callback)
//	{
//		return getObject().selectFeatures(queryParams, select, callback);
//	}

	/**
	* Enable or disabled the labeling for the layer.
	*/
	public void setEnableLabels(boolean enable)
	{
		getObject().setEnableLabels(enable);
		return;
	}

	/**
	* Sets the renderer
	*/
	public void setRenderer(Renderer renderer)
	{
		getObject().setRenderer(renderer);
		return;
	}

	/**
	* Sets the color that is applied to a selected feature.
	*/
	public void setSelectionColor(int selectionColor)
	{
		getObject().setSelectionColor(selectionColor);
		return;
	}

	/**
	* Sets selection color width.
	*/
	public void setSelectionColorWidth(int highlightWidth)
	{
		getObject().setSelectionColorWidth(highlightWidth);
		return;
	}

	/**
	* Unselects the given feature
	*/
	public void unselectFeature(long oid)
	{
		getObject().unselectFeature(oid);
		return;
	}

	/**
	* Un-selects the feature for given feature iterator.
	*/
	public void unselectFeatures(FeatureResult iter)
	{
		getObject().unselectFeatures(iter);
		return;
	}

	/**
	* Un-selects the feature for given arrays.
	*/
	public void unselectFeatures(long[] ids)
	{
		getObject().unselectFeatures(ids);
		return;
	}


}
