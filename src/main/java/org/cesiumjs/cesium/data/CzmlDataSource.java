package org.cesiumjs.cesium.data;

import org.cesiumjs.cesium.Undocumented;

import com.google.gwt.core.client.JavaScriptObject;

public class CzmlDataSource extends JavaScriptObject
{
	protected CzmlDataSource() {}
	
	public static final native CzmlDataSource create() /*-{
		return new Cesium.CzmlDataSource();
	}-*/;

	
	public final native void load(Undocumented czml, String sourceURI) /*-{
		this.load(czml, sourceURI);
	}-*/;

	public final native JavaScriptObject loadUrl(String url) /*-{
		return this.loadUrl(url);
	}-*/;

	public final native void process(Object czml, String sourceURI) /*-{
		this.process(czml, sourceURI);
	}-*/;

	public final native JavaScriptObject processUrl(String url) /*-{
		return this.processUrl(url);
	}-*/;

  
}
