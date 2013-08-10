package repo.consistencychecker.person.service;

import javax.enterprise.context.ApplicationScoped;

import loggee.api.Logged;

@Logged
@ApplicationScoped
public class PersonConsistencyCheckerDecisionService {
    public boolean isNameNotTooLong(String personName) {
        return personName.length() > 10;
    }
}
