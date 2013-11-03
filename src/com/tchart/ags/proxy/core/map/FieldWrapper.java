package com.tchart.ags.proxy.core.map;

//import org.codehaus.jackson.JsonParser;

//import org.codehaus.jackson.JsonParser;

import org.codehaus.jackson.JsonParser;

import anywheresoftware.b4a.BA;

import com.esri.core.map.Domain;
import com.esri.core.map.Field;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Field")

public class FieldWrapper  extends AbsObjectWrapper<Field>
{
	public FieldWrapper()
	{		
	}
	
	public FieldWrapper(Field pField)
	{
		setObject(pField);
	}
	
	public void Initialize()
	{
		setObject(new Field());
	}
	
	public void Initialize2(String name, String alias, String type)
	{
		try {
			setObject(new Field(name, alias, type));
		} catch (Exception e) {
			setObject(new Field());
		}
	}
	
	public void Initialize3(String name, String alias, String type, Domain domain)
	{
		try
		{
			setObject(new Field(name, alias, type, domain));
		} catch (Exception e) 
		{
			setObject(new Field());
		}
	}
	
	public Field fromJson(JsonParser parser)
	{
		try
		{
			return Field.fromJson(parser);
		} catch (Exception e)
		{
			return null;
		}
	}
	
	public String	getAlias()
	{
		return getObject().getAlias();
	}
	
	public Domain getDomain()
	{		
		return getObject().getDomain();
	}
	
	public int	getFieldType()
	{
		return getObject().getFieldType();
	}
	
	public int	getLength()
	{
		return getObject().getLength();
	}
	
	public String	getName()
	{
		return getObject().getName();
	}
	
	public boolean	isEditable()
	{
		return getObject().isEditable();
	}
	
	public boolean	isNullable()
	{
		return getObject().isNullable();
	}
	
	public static String	toEsriFieldType(int esriFieldType)
	{
		return Field.toEsriFieldType(esriFieldType);
	}
	
	public int toFieldType(String esriFieldType)
	{
		return Field.toFieldType(esriFieldType);
	}
	
	public String	toJson(Field field)
	{
		try {
			return Field.toJson(field);
		} catch (Exception e) {
			return null;
		}
	}
	
	public String	toString()
	{
		return getObject().toString();
	}
}
