package repo.consistencychecker.person.rest.endpoint;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import loggee.api.Logged;

@Path("/")
@Logged
@ApplicationScoped
public class ConsistencyCheckerRestEndpoint {
	// @Inject
	// private PersonConsistencyCheckerService personConsistencyCheckerService;
	// @POST
	@GET
	// @Consumes("application/json")
	@Produces("application/json")
	@Path("/personConsistencyChecker/person")
	// public boolean checkPersonConsistency(RepoItem repoItem) {
	public boolean checkPersonConsistency() {
		// return personConsistencyCheckerService.checkConsistency(repoItem);
		return true;
	}

	// @POST
	@GET
	// @Consumes("application/json")
	@Produces("application/json")
	@Path("/organizationConsistencyChecker/person")
	// public boolean checkPersonOfOrganizationConsistency(RepoItem repoItem) {
	public boolean checkPersonOfOrganizationConsistency() {
		return true;
	}

	// @POST
	@GET
	// @Consumes("application/json")
	@Produces("application/json")
	@Path("/organizationConsistencyChecker/organization")
	// public boolean checkOrganizationConsistency(RepoItem repoItem) {
	public boolean checkOrganizationConsistency() {
		return true;
	}

}
