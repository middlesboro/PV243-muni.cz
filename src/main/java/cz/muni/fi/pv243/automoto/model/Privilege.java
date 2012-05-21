package cz.muni.fi.pv243.automoto.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import java.io.Serializable;

/**
 * @author Andrej Kuročenko <andrej@kurochenko.net>
 */
//@Entity
public class Privilege implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @Version
    private Long version;
    private String privilege;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Privilege privilege1 = (Privilege) o;

        if (id != null ? !id.equals(privilege1.id) : privilege1.id != null) return false;
        if (privilege != null ? !privilege.equals(privilege1.privilege) : privilege1.privilege != null) return false;
        if (version != null ? !version.equals(privilege1.version) : privilege1.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (privilege != null ? privilege.hashCode() : 0);
        return result;
    }
}
