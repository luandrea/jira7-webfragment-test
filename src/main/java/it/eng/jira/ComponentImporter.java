package it.eng.jira;

import org.springframework.beans.factory.annotation.Autowired;

import com.atlassian.jira.security.PermissionManager;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;

/**
 * This class exists solely to cause Spring Scanner to import
 * the required OSGi services. It should never be instantiated.
 */
public class ComponentImporter {

	private PermissionManager permissionMgr;

	@Autowired
	public ComponentImporter (@ComponentImport PermissionManager permissionManager) {
		this.permissionMgr = permissionManager;
		// no need to actually do anything with it...
	}
}
