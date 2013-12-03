package com.tchart.ags.proxy.core.geometry;

import org.codehaus.jackson.JsonParser;

import anywheresoftware.b4a.BA;

import com.esri.core.geometry.AreaUnit;
import com.esri.core.geometry.CompositeGeographicTransformation;
import com.esri.core.geometry.Envelope;
import com.esri.core.geometry.GeographicTransformation;
import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.GeometryEngine;
import com.esri.core.geometry.LinearUnit;
import com.esri.core.geometry.MapGeometry;
import com.esri.core.geometry.Point;
import com.esri.core.geometry.Polygon;
import com.esri.core.geometry.ProjectionTransformation;
import com.esri.core.geometry.Proximity2DResult;
import com.esri.core.geometry.Unit;
//import com.esri.core.geometry.Point;
import com.esri.core.geometry.SpatialReference;

import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.List;

@BA.Author("Trevor Hart")
@BA.ShortName("GeometryEngine")

public class GeometryEngineWrapper  extends AbsObjectWrapper<GeometryEngine>
{
	public GeometryEngineWrapper()
	{		
	}
	
	public GeometryEngineWrapper(GeometryEngine pGeometryEngine)
	{
		setObject(pGeometryEngine);
	}	
	
	/**
	* Calculates a buffer polygon for each geometry at each of the corresponding specified distances.
	*/
	public List buffer(Geometry[] geometries, SpatialReference spatialReference, double[] distances, Unit unit, boolean toUnionResults)
	{
		List L = new List();
		L.Initialize();
		for (Object o : GeometryEngine.buffer(geometries, spatialReference, distances, unit, toUnionResults)) L.Add(o);
		return L;
	}

	/**
	* Calculates buffer polygon of the geometry as specified by the distance input.
	*/
	public Polygon buffer1(Geometry geometry, SpatialReference spatialReference, double distance, Unit unit)
	{
		return GeometryEngine.buffer(geometry, spatialReference, distance, unit);
	}

	/**
	* Calculates the clipped geometry from a target geometry by an envelope.
	*/
	public Geometry clip(Geometry geometry, Envelope envelope, SpatialReference spatialReference)
	{
		return GeometryEngine.clip(geometry, envelope, spatialReference);
	}

	/**
	* Indicates if one geometry contains another geometry.
	*/
	public boolean contains(Geometry geometry1, Geometry geometry2, SpatialReference spatialReference)
	{
		return GeometryEngine.contains(geometry1, geometry2, spatialReference);
	}

	/**
	* Indicates if one geometry crosses another geometry.
	*/
	public boolean crosses(Geometry geometry1, Geometry geometry2, SpatialReference spatialReference)
	{
		return GeometryEngine.crosses(geometry1, geometry2, spatialReference);
	}

	/**
	* Creates the difference of two geometries.
	*/
	public Geometry difference(Geometry inputGeometry, Geometry substractor, SpatialReference spatialReference)
	{
		return GeometryEngine.difference(inputGeometry, substractor, spatialReference);
	}

	/**
	* Calculates the 2D planar distance between two geometries.
	*/
	public double distance(Geometry geometry1, Geometry geometry2, SpatialReference spatialReference)
	{
		return GeometryEngine.distance(geometry1, geometry2, spatialReference);
	}

	/**
	* Indicates if two geometries are equal.
	*/
	public boolean equals(Geometry geometry1, Geometry geometry2, SpatialReference spatialReference)
	{
		return GeometryEngine.equals(geometry1, geometry2, spatialReference);
	}

	/**
	* Calculates the geodesic area of the input geometry.
	*/
	public double geodesicArea(Geometry geometry, SpatialReference spatialReference, AreaUnit areaUnit)
	{
		return GeometryEngine.geodesicArea(geometry, spatialReference, areaUnit);
	}

	/**
	* Same as geodesicDensifyGeometry(Geometry, SpatialReference, double, LinearUnit
	*/
	public Geometry geodesicDensifyGeometry(Geometry geometry, SpatialReference spatialReference)
	{
		return GeometryEngine.geodesicDensifyGeometry(geometry, spatialReference);
	}

	/**
	* Creates a geodesic geometry by densifying the input geometry.
	*/
	public  Geometry geodesicDensifyGeometry(Geometry geometry, SpatialReference spatialReference, double maxSegmentLength, LinearUnit lengthUnit)
	{
		return GeometryEngine.geodesicDensifyGeometry(geometry, spatialReference, maxSegmentLength, lengthUnit);
	}

	/**
	* Calculates the geodesic distance between 2 points.
	*/
	public  double geodesicDistance(Point p1, Point p2, SpatialReference spatialReference, LinearUnit distanceUnit)
	{
		return GeometryEngine.geodesicDistance(p1, p2, spatialReference, distanceUnit);
	}

	/**
	* Same as geodesicEllipse(Point, SpatialReference, double, double, double, int, LinearUnit, com.esri.core.geometry.Geometry.Type
	*/
	public Polygon geodesicEllipse(Point center, SpatialReference spatialReference, double semiAxis1Length, double semiAxis2Length, LinearUnit lengthUnit)
	{
		return GeometryEngine.geodesicEllipse(center, spatialReference, semiAxis1Length, semiAxis2Length, lengthUnit);
	}

	/**
	* Creates a geodesic ellipse.
	*/
	public Geometry geodesicEllipse(Point center, SpatialReference spatialReference, double semiAxis1Length, double semiAxis2Length, double majorAxisDirection, int pointCount, LinearUnit lengthUnit, Geometry.Type outputType)
	{
		return GeometryEngine.geodesicEllipse(center, spatialReference, semiAxis1Length, semiAxis2Length, majorAxisDirection, pointCount, lengthUnit, outputType);
	}

	/**
	* A geodesic length is the shortest distance between any two points on the earth's surface when the earth's surface is approximated by a spheroid.
	*/
	public double geodesicLength(Geometry geometry, SpatialReference spatialReference, LinearUnit lengthUnit)
	{
		return GeometryEngine.geodesicLength(geometry, spatialReference, lengthUnit);
	}

	/**
	* Returns a list of points that have been moved by geodesic calculations.
	*/
	@SuppressWarnings("unchecked")
	public List geodesicMove(List points, SpatialReference spatialReference, double distance, LinearUnit distanceUnit, double azimuth)
	{
		return (List) GeometryEngine.geodesicMove((java.util.List<Point>) points, spatialReference, distance, distanceUnit, azimuth);
	}

	/**
	* Returns a point that has been moved by geodesic calculation.
	*/
	public Point geodesicMove(Point point, SpatialReference spatialReference, double distance, LinearUnit distanceUnit, double azimuth)
	{
		return GeometryEngine.geodesicMove(point, spatialReference, distance, distanceUnit, azimuth);
	}

	/**
	* 
	*/
	@SuppressWarnings("unchecked")
	public List geodesicOffset(List geometries, SpatialReference spatialReference, double distance)
	{
		return (List) GeometryEngine.geodesicOffset((java.util.List<Geometry>) geometries, spatialReference, distance);
	}

	/**
	* 
	*/
	public Geometry geodesicOffset(Geometry geometry, SpatialReference spatialReference, double distance)
	{
		return GeometryEngine.geodesicOffset(geometry, spatialReference, distance);
	}

	/**
	* 
	*/
	public Geometry geodesicOffset(Geometry geometry, SpatialReference spatialReference, double distance, GeometryEngine.JoinType joinType, double bevelRatio, double flattenError)
	{
		return GeometryEngine.geodesicOffset(geometry, spatialReference, distance, joinType, bevelRatio, flattenError);
	}

	/**
	* Creates offset versions of the input geometries.
	*/
	@SuppressWarnings("unchecked")
	public List geodesicOffset(List geometries, SpatialReference spatialReference, double distance, GeometryEngine.JoinType joinType, double bevelRatio, double flattenError)
	{
		return (List) GeometryEngine.geodesicOffset((java.util.List<Geometry>) geometries, spatialReference, distance, joinType, bevelRatio, flattenError);
	}

	/**
	* Creates a geodesic sector.
	*/
	public Geometry geodesicSector(Point center, SpatialReference spatialReference, double semiAxis1Length, double semiAxis2Length, double majorAxisDirection, double startDirection, double sectorAngle, double maxArcSegmentLength, double maxRadiusSegmentLength, LinearUnit lengthUnit, Geometry.Type outputType)
	{
		return GeometryEngine.geodesicSector(center, spatialReference, semiAxis1Length, semiAxis2Length, majorAxisDirection, startDirection, sectorAngle, maxArcSegmentLength, maxRadiusSegmentLength, lengthUnit, outputType);
	}

	/**
	* Same as geodesicSector(Point, SpatialReference, double, double, double, double, double, double, double, LinearUnit, com.esri.core.geometry.Geometry.Type
	*/
	public Polygon geodesicSector(Point center, SpatialReference spatialReference, double semiAxis1Length, double semiAxis2Length, double startDirection, double sectorAngle, LinearUnit lengthUnit)
	{
		return GeometryEngine.geodesicSector(center, spatialReference, semiAxis1Length, semiAxis2Length, startDirection, sectorAngle, lengthUnit);
	}

	/**
	* Imports geometry from the binary ESRI shape file format.
	*/
	public Geometry geometryFromEsriShape(byte[] esriShapeBuffer, Geometry.Type geometryType)
	{
		return GeometryEngine.geometryFromEsriShape(esriShapeBuffer, geometryType);
	}

	/**
	* Exports geometry to the ESRI shape file format; the exported binary can then be stored in SDE.
	*/
	public List geometryToEsriShape(Geometry geometry)
	{
		List L = new List();
		L.Initialize();
		for (Object o : GeometryEngine.geometryToEsriShape(geometry)) L.Add(o);
		return L;
	}

	/**
	* Exports the specified geometry instance to its Json representation.
	*/
	@SuppressWarnings("deprecation")
	public String geometryToJson(int wkid, Geometry geometry)
	{
		return GeometryEngine.geometryToJson(wkid, geometry);
	}

	/**
	* Exports the specified geometry instance to its JSON representation.
	*/
	public String geometryToJson(SpatialReference spatialReference, Geometry geometry)
	{
		return GeometryEngine.geometryToJson(spatialReference, geometry);
	}

	/**
	* Finds the coordinate of the geometry which is closest to the specified point.
	*/
	public Proximity2DResult getNearestCoordinate(Geometry geometry, Point inputPoint, boolean bTestPolygonInterior)
	{
		return GeometryEngine.getNearestCoordinate(geometry, inputPoint, bTestPolygonInterior);
	}

	/**
	* Finds the nearest vertex on the geometry from the specified input point.
	*/
	public Proximity2DResult getNearestVertex(Geometry geometry, Point inputPoint)
	{
		return GeometryEngine.getNearestVertex(geometry, inputPoint);
	}

	/**
	* Finds all vertices in the given distance from the specified point, sorted from the closest to the furthest.
	*/
	public List getNearestVertices(Geometry geometry, Point inputPoint, double searchRadius, int maxVertexCountToReturn)
	{
		List L = new List();
		L.Initialize();
		for (Object o : GeometryEngine.getNearestVertices(geometry, inputPoint, searchRadius, maxVertexCountToReturn)) L.Add(o);
		return L;
	}

	/**
	* Same as getTransformations(SpatialReference, SpatialReference, Envelope, int
	*/
	public List getTransformations(SpatialReference fromSR, SpatialReference toSR)
	{
		return (List) GeometryEngine.getTransformations(fromSR, toSR);
	}

	/**
	* Gets transformations to project from fromSR to toSR.
	*/
	public static  List getTransformations(SpatialReference fromSR, SpatialReference toSR, Envelope extent, int maxEntries)
	{
		return (List) GeometryEngine.getTransformations(fromSR, toSR, extent, maxEntries);
	}

	/**
	* Creates a geometry through intersection between two geometries.
	*/
	public Geometry intersect(Geometry inputGeometry, Geometry intersector, SpatialReference spatialReference)
	{
		return GeometryEngine.intersect(inputGeometry, intersector, spatialReference);
	}

	/**
	* Imports the MapGeometry from it's JSON representation.
	*/
	public MapGeometry jsonToGeometry(JsonParser json)
	{
		return GeometryEngine.jsonToGeometry(json);
	}

	/**
	* Projects the given geometry using the provided spatial references and transformation.
	*/
	public Geometry project(Geometry geometry, SpatialReference inputSR, SpatialReference outputSR, CompositeGeographicTransformation tx)
	{
		return GeometryEngine.project(geometry, inputSR, outputSR, tx);
	}

	/**
	* Projects the given point from a longitude/latitude (EPSG:4326 / WGS84 spatial  reference
	*/
	public Point project(double x, double y, SpatialReference sr)
	{
		return GeometryEngine.project(x, y, sr);
	}

	/**
	* Projects the given geometry instance from the input spatial reference to the output spatial reference.
	*/
	public Geometry project1(Geometry geometry, SpatialReference inputSR, SpatialReference outputSR)
	{
		return GeometryEngine.project(geometry, inputSR, outputSR);
	}

	/**
	* Projects the given geometry using the provided projection transformation.
	*/
	public Geometry project2(Geometry geometry, ProjectionTransformation tx)
	{
		return GeometryEngine.project(geometry, tx);
	}

	/**
	* 
	*/
	public Geometry project(Geometry geometry, SpatialReference inputSR, SpatialReference outputSR, GeographicTransformation tx)
	{
		return GeometryEngine.project(geometry, inputSR, outputSR, tx);
	}

	/**
	* Performs the simplify operation on the geometry.
	*/
	public Geometry simplify(Geometry geometry, SpatialReference spatialReference)
	{
		return GeometryEngine.simplify(geometry, spatialReference);
	}

	/**
	* Indicates if one geometry touches another geometry.
	*/
	public boolean touches(Geometry geometry1, Geometry geometry2, SpatialReference spatialReference)
	{
		return GeometryEngine.touches(geometry1, geometry2, spatialReference);
	}

	/**
	* Constructs a new geometry by union an array of geometries.
	*/
	public Geometry union(Geometry[] geometries, SpatialReference spatialReference)
	{
		return GeometryEngine.union(geometries, spatialReference);
	}

	/**
	* Indicates if one geometry is within another geometry.
	*/
	public boolean within(Geometry geometry1, Geometry geometry2, SpatialReference spatialReference)
	{
		return GeometryEngine.within(geometry1, geometry2, spatialReference);
	}
	
	
}
