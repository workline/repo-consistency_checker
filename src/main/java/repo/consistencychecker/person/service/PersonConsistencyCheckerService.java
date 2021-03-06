package repo.consistencychecker.person.service;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import loggee.api.Logged;
import vrds.model.RepoItem;

@Logged
@Stateless
@Remote(RemotePersonConsistencyChecker.class)
public class PersonConsistencyCheckerService implements
		RemotePersonConsistencyChecker {

	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	private PersonConsistencyCheckerDecisionService personConsistencyCheckerDecisionService;

	@Override
	public boolean checkConsistency(RepoItem person) {
		boolean consistent;

		String personName = (String) person.getValue("name");

		if (personConsistencyCheckerDecisionService
				.isNameNotTooLong(personName)) {
			consistent = false;
		} else {
			consistent = true;
		}

		return consistent;
	}
}
