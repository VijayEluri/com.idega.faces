/*
 * Created on 1.8.2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.idega.faces.smile;

import javax.faces.application.ViewHandler;

/**
 * @author tryggvil
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class WorkspaceViewHandler extends WindowViewHandler {
	/**
	 * 
	 */
	public WorkspaceViewHandler() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param parentViewHandler
	 */
	public WorkspaceViewHandler(ViewHandler parentViewHandler) {
		this.setParentViewHandler(parentViewHandler);
	}
	
	public Class getDefaultPageClass() throws ClassNotFoundException{
		return Class.forName("com.idega.webface.workspace.WorkspacePage");
	}
	
	public String getDefaultPageURL(){
		return "/idegaweb/bundles/com.idega.webface/jsp/workspace.jsf";
	}
}
