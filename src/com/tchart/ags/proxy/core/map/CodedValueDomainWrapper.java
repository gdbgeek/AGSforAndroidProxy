package com.tchart.ags.proxy.core.map;

import java.util.LinkedHashMap;
import org.codehaus.jackson.JsonParser;

//import android.util.Log;
import anywheresoftware.b4a.BA;
import com.esri.core.map.CodedValueDomain;
import anywheresoftware.b4a.AbsObjectWrapper;
import anywheresoftware.b4a.objects.collections.Map;

@BA.Author("Trevor Hart")
@BA.ShortName("CodedValueDomain")

public class CodedValueDomainWrapper  extends AbsObjectWrapper<CodedValueDomain>
{
	public CodedValueDomainWrapper()
	{		
	}
	
	public CodedValueDomainWrapper(CodedValueDomain pCodedValueDomain)
	{
		setObject(pCodedValueDomain);
	}
	
	public void Initialize()
	{
		setObject(new CodedValueDomain());
	}
	
	public void Initialize2(String domainName, Map codedValues)
	{
		java.util.Map<String,String> jMap = new LinkedHashMap<String,String>();
		
		for(int i =0;i < codedValues.getSize();i++)
		{
			String key = (String) codedValues.GetKeyAt(i);
			String value = (String) codedValues.GetValueAt(i);			
			jMap.put(key, value);
		}
		setObject(new CodedValueDomain(domainName,jMap));		
	}
	
	public static CodedValueDomain	fromJson(JsonParser parser)
	{
		try {
			return CodedValueDomain.fromJson(parser);
		} catch (Exception e) {
			return null;
		}
	}
	
	public Map getCodedValues()
	{
		java.util.Map<String,String> jMap = getObject().getCodedValues();
				
		Map bMap = new Map();
		bMap.Initialize();
		
		for (java.util.Map.Entry<String, String> entry : jMap.entrySet())
		{
			bMap.Put(entry.getKey(), entry.getValue());
		}
		return bMap;
	}
	
	public String toString()
	{
		return getObject().toString();
	}	
}
