package org.palladiosimulator.protocom.framework.java.ee.api.rest;

import java.net.URI;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.palladiosimulator.protocom.framework.java.ee.modules.ContainerModule;
import org.palladiosimulator.protocom.framework.java.ee.modules.Module;
import org.palladiosimulator.protocom.framework.java.ee.modules.ModuleList;
import org.palladiosimulator.protocom.framework.java.ee.modules.SystemModule;
import org.palladiosimulator.protocom.framework.java.ee.prototype.Allocation;
import org.palladiosimulator.protocom.framework.java.ee.prototype.Container;
import org.palladiosimulator.protocom.framework.java.ee.prototype.PrototypeBridge;
import org.palladiosimulator.protocom.framework.java.ee.prototype.System;

/**
 *
 * @author Christian Klaussner
 */
@Path("/modules")
public class Modules {
	@Context
	private ServletContext context;

	private static ModuleList modules;

	@Inject
	private Modules(PrototypeBridge bridge) {
		if (modules == null) {
			modules = new ModuleList();

			// Add containers to the list.

			for (Container container : bridge.getContainers()) {
				String id = container.getId();
				String name = container.getName();
				Allocation[] allocations = bridge.getAllocations(id);

				modules.add(new ContainerModule(id, name, allocations));
			}

			// Add system to the list.

			System system = bridge.getSystem();
			modules.add(new SystemModule(system.getName(), system.getClassName()));
		}
	}

	/**
	 *
	 * @param uriInfo
	 * @return
	 */
	private String getBaseUrl(UriInfo uriInfo) {
		URI uri = uriInfo.getRequestUri();

		String scheme = uri.getScheme();
		String host = uri.getHost();
		String port = String.valueOf(uri.getPort());

		return scheme + "://" + host + ":" + port + context.getContextPath();
	}

	/**
	 *
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getModules() {
		return Response.ok(modules.toJson()).build();
	}

	/**
	 *
	 * @param id
	 * @return
	 */
	@GET
	@Path("{id}/start")
	public Response startModule(@Context UriInfo uriInfo, @PathParam("id") String id) {
		Module module = modules.get(id);

//		try {
			module.startModule(getBaseUrl(uriInfo));
//		} catch (ModuleStartException e) {
//			return Response.serverError().build();
//		}

		return Response.ok().build();
	}
}