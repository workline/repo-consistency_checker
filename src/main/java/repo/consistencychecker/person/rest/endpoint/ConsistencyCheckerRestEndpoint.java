package repo.consistencychecker.person.rest.endpoint;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import loggee.api.Logged;
import repo.consistencychecker.person.service.PersonConsistencyCheckerService;
import vrds.model.RepoItem;

@Path("/")
@Logged
@ApplicationScoped
public class ConsistencyCheckerRestEndpoint {
    @Inject
    private PersonConsistencyCheckerService personConsistencyCheckerService;

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/personConsistencyChecker/person")
    public boolean checkPersonConsistency(RepoItem repoItem) {
        return personConsistencyCheckerService.checkConsistency(repoItem);
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/organizationConsistencyChecker/person")
    public boolean checkPersonOfOrganizationConsistency(RepoItem repoItem) {
        return true;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/organizationConsistencyChecker/organization")
    public boolean checkOrganizationConsistency(RepoItem repoItem) {
        return true;
    }
    
}
