package com.tchart.ags.proxy.core.map;

import org.codehaus.jackson.JsonParser;
import anywheresoftware.b4a.BA;
import com.esri.core.map.Domain;
import anywheresoftware.b4a.AbsObjectWrapper;

@BA.Author("Trevor Hart")
@BA.ShortName("Domain")

public class DomainWrapper  extends AbsObjectWrapper<Domain>
{
	public DomainWrapper()
	{		
	}
	
	public DomainWrapper(Domain pDomain)
	{
		setObject(pDomain);
	}
	
public static Domain fromJson(JsonParser parser)
{
	try {
		return Domain.fromJson(parser);
	} catch (Exception e) {
		return null;
	}
}

public String	getDomainName()
{
	return getObject().getDomainName();
}

public void	setDomainName(String domainName)
{
	getObject().setDomainName(domainName);
}

static String	toJson(Domain domain)
{
	try {
		return Domain.toJson(domain);
	} catch (Exception e) {
		return null;
	}
}
}
