package cz.muni.fi.pv243.automoto.service;

import cz.muni.fi.pv243.automoto.model.Privilege;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Andrej Kuročenko <andrej@kurochenko.net>
 */
@RunWith(Arquillian.class)
public class PrivilegeServiceTest {

    @Inject
    private PrivilegeService privilegeService;

    private Privilege privilege;


    @Before
    public void setUp() {
        privilege = new Privilege();
        privilege.setPrivilege("ADMIN");
    }

    @Test
    public void testCreate() {
        privilegeService.create(privilege);
        assertNotNull(privilege.getId());

        Privilege result = privilegeService.find(privilege.getId());
        assertEquals(result, privilege);
    }

}
