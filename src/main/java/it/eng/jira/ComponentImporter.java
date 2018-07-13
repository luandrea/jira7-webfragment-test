package it.eng.jira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atlassian.jira.security.GlobalPermissionManager;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;

/**
 * This class exists solely to cause Spring Scanner to import
 * the required OSGi services. It should never be instantiated.
 */
@Component("myComponentImporter")
public class ComponentImporter {

	private GlobalPermissionManager GlobalPermissionManager;


	@Autowired
	public ComponentImporter (@ComponentImport GlobalPermissionManager GlobalPermissionManager) {
		this.GlobalPermissionManager = GlobalPermissionManager;
		// no need to actually do anything with it...
	}
}
