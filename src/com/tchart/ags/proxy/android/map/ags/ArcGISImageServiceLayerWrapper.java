package com.tchart.ags.proxy.android.map.ags;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.AbsObjectWrapper;
import com.esri.android.map.ags.ArcGISImageServiceLayer;
import com.esri.core.io.UserCredentials;
import com.esri.core.map.ImageServiceParameters;
import com.esri.core.map.MosaicRule;
import com.esri.core.map.RasterFunction;

@BA.Author("Trevor Hart")
@BA.ShortName("ArcGISImageServiceLayer")

public class ArcGISImageServiceLayerWrapper  extends AbsObjectWrapper<ArcGISImageServiceLayer>
{
	public ArcGISImageServiceLayerWrapper()
	{
	}

	public ArcGISImageServiceLayerWrapper(ArcGISImageServiceLayer pArcGISImageServiceLayer)
	{
		setObject(pArcGISImageServiceLayer);
	}

	/**
	* This constructor is used if you're instantiating the ArcGISImageServiceLayer.
	*/
	public void Initialize(String url, ImageServiceParameters options)
	{
		setObject(new ArcGISImageServiceLayer(url, options));
	}

	/**
	* This constructor is used if you instantiate an ArcGISImageServiceLayer object.
	*/
	public void Initialize1(String url, ImageServiceParameters options, UserCredentials credentials, boolean initLayer)
	{
		setObject(new ArcGISImageServiceLayer(url, options, credentials, initLayer));
	}

	/**
	* This constructor is used if you're instantiating the ArcGISImageServiceLayer (see the class description for an example of this usage)
	*/
	public void Initialize2(String url, ImageServiceParameters options, UserCredentials credentials)
	{
		setObject(new ArcGISImageServiceLayer(url, options, credentials));
	}


	/**
	* Gets the number of bands in the ArcGISImageServiceLayer.
	*/
	public int getBandCount()
	{
		return getObject().getBandCount();
	}

	/**
	* Gets ImageService Band IDs.
	*/
	public int[] getBandIds()
	{
		return getObject().getBandIds();
	}

	/**
	* Gets the compression quality of the exported image.
	*/
	public int getCompressionQuality()
	{
		return getObject().getCompressionQuality();
	}

	/**
	* Gets the copyright information of the ArcGISImageServiceLayer.
	*/
	public String getCopyrightText()
	{
		return getObject().getCopyrightText();
	}

	/**
	* Gets the image format.
	*/
	public ImageServiceParameters.IMAGE_FORMAT getImageFormat()
	{
		return getObject().getImageFormat();
	}

	/**
	* Gets the interpolation method.
	*/
	public ImageServiceParameters.RSP getInterpolation()
	{
		return getObject().getInterpolation();
	}

	/**
	* Gets the mosaic rule of the layer.
	*/
	public MosaicRule getMosaicRule()
	{
		return getObject().getMosaicRule();
	}

	/**
	* Gets the options of the ArcGISImageServiceLayer.
	*/
	public ImageServiceParameters getOptions()
	{
		return getObject().getOptions();
	}

	/**
	* Gets the size of pixel in X direction.
	*/
	public double getPixelSizeX()
	{
		return getObject().getPixelSizeX();
	}

	/**
	* Gets the size of pixel in Y direction.
	*/
	public double getPixelSizeY()
	{
		return getObject().getPixelSizeY();
	}

	/**
	* Gets the pixel type of the image service.
	*/
	public ImageServiceParameters.PIXEL_TYPE getPixelType()
	{
		return getObject().getPixelType();
	}

	/**
	* Gets the rendering rule of the layer.
	*/
	public RasterFunction getRenderingRule()
	{
		return getObject().getRenderingRule();
	}

	/**
	* Sets the R,G,B of the exported image to the appropriate ImageService Band ID.
	*/
	public void setBandIds(int[] bandIds)
	{
		getObject().setBandIds(bandIds);
		return;
	}

	/**
	* Sets the compression quality of the exported image.
	*/
	public void setCompressionQuality(int compressionQuality)
	{
		getObject().setCompressionQuality(compressionQuality);
		return;
	}

	/**
	* Sets the image format.
	*/
	public void setImageFormat(ImageServiceParameters.IMAGE_FORMAT format)
	{
		getObject().setImageFormat(format);
		return;
	}

	/**
	* Sets the interpolation method.
	*/
	public void setInterpolation(ImageServiceParameters.RSP interpolation)
	{
		getObject().setInterpolation(interpolation);
		return;
	}

	/**
	* Sets the mosaic rule of the layer to the specified value.
	*/
	public void setMosaicRule(MosaicRule mosaicRule)
	{
		getObject().setMosaicRule(mosaicRule);
		return;
	}

	/**
	* Sets the rendering rule of the layer to the given value.
	*/
	public void setRenderingRule(RasterFunction renderingRule)
	{
		getObject().setRenderingRule(renderingRule);
		return;
	}

}
