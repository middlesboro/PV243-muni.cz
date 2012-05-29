package cz.muni.fi.pv243.automoto;

import cz.muni.fi.pv243.automoto.model.Privilege;
import cz.muni.fi.pv243.automoto.service.PrivilegeService;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * @author Andrej Kuročenko <andrej@kurochenko.net>
 */
@Startup
@Singleton
public class Initializer {

    @Inject
    private PrivilegeService privilegeService;


    @PostConstruct
    public void init() {
        Privilege p = new Privilege();
        p.setPrivilege("ANONYMOUS");

        Privilege p1 = new Privilege();
        p1.setPrivilege("USER");

        Privilege p2 = new Privilege();
        p2.setPrivilege("ADMIN");

        privilegeService.create(p);
        privilegeService.create(p1);
        privilegeService.create(p2);
    }

}
