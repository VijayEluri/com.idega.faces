/*
 * $Id: WindowViewNode.java,v 1.1 2004/10/19 10:37:10 tryggvil Exp $
 * Created on 4.10.2004
 *
 * Copyright (C) 2004 Idega Software hf. All Rights Reserved.
 *
 * This software is the proprietary information of Idega hf.
 * Use is subject to license terms.
 */
package com.idega.faces.view.node;

import javax.faces.application.ViewHandler;
import com.idega.faces.smile.WindowViewHandler;
import com.idega.faces.view.DefaultViewNode;
import com.idega.faces.view.ViewNode;
import com.idega.idegaweb.IWMainApplication;


/**
 * 
 *  Last modified: $Date: 2004/10/19 10:37:10 $ by $Author: tryggvil $
 * 
 * @author <a href="mailto:tryggvil@idega.com">tryggvil</a>
 * @version $Revision: 1.1 $
 */
public class WindowViewNode extends DefaultViewNode {

	private ViewHandler windowViewHandler;
	private Class defaultPageClass;
	/**
	 * @param viewId
	 * @param parent
	 */
	public WindowViewNode(String viewId, ViewNode parent) {
		super(viewId, parent);
		initialize();
	}

	/**
	 * @param iwma
	 */
	public WindowViewNode(IWMainApplication iwma) {
		super(iwma);	
		initialize();
	}
	
	private void initialize(){
		this.setCBP(true);
		try {
			this.setComponentClass(Class.forName("com.idega.webface.workspace.WorkspaceLoginPage"));
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public ViewHandler getViewHandler() {
		if(this.windowViewHandler==null){
			setViewHandler(new WindowViewHandler(this));
		}
		return this.windowViewHandler;
	}
	/* (non-Javadoc)
	 * @see com.idega.faces.view.DefaultViewNode#setViewHandler(javax.faces.application.ViewHandler)
	 */
	public void setViewHandler(ViewHandler viewHandler) {
		this.windowViewHandler=viewHandler;
	}
	
}