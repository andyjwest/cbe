package cbe.fetching.model.auto;

import org.apache.cayenne.CayenneDataObject;

import cbe.fetching.model.Civilian;
import cbe.fetching.model.Contractor;
import cbe.fetching.model.Designation;
import cbe.fetching.model.Military;

/**
 * Class _Person was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Person extends CayenneDataObject {

    public static final String APPROVED_PROPERTY = "approved";
    public static final String EMAIL_PROPERTY = "email";
    public static final String FIRST_NAME_PROPERTY = "firstName";
    public static final String LAST_NAME_PROPERTY = "lastName";
    public static final String US_CITIZEN_PROPERTY = "usCitizen";
    public static final String CIVILIAN_PROPERTY = "civilian";
    public static final String CONTRACTOR_PROPERTY = "contractor";
    public static final String DESIGNATION_PROPERTY = "designation";
    public static final String MILITARY_PROPERTY = "military";

    public static final String ID_PK_COLUMN = "ID";

    public void setApproved(Boolean approved) {
        writeProperty("approved", approved);
    }
    public Boolean getApproved() {
        return (Boolean)readProperty("approved");
    }

    public void setEmail(String email) {
        writeProperty("email", email);
    }
    public String getEmail() {
        return (String)readProperty("email");
    }

    public void setFirstName(String firstName) {
        writeProperty("firstName", firstName);
    }
    public String getFirstName() {
        return (String)readProperty("firstName");
    }

    public void setLastName(String lastName) {
        writeProperty("lastName", lastName);
    }
    public String getLastName() {
        return (String)readProperty("lastName");
    }

    public void setUsCitizen(Boolean usCitizen) {
        writeProperty("usCitizen", usCitizen);
    }
    public Boolean getUsCitizen() {
        return (Boolean)readProperty("usCitizen");
    }

    public void setCivilian(Civilian civilian) {
        setToOneTarget("civilian", civilian, true);
    }

    public Civilian getCivilian() {
        return (Civilian)readProperty("civilian");
    }


    public void setContractor(Contractor contractor) {
        setToOneTarget("contractor", contractor, true);
    }

    public Contractor getContractor() {
        return (Contractor)readProperty("contractor");
    }


    public void setDesignation(Designation designation) {
        setToOneTarget("designation", designation, true);
    }

    public Designation getDesignation() {
        return (Designation)readProperty("designation");
    }


    public void setMilitary(Military military) {
        setToOneTarget("military", military, true);
    }

    public Military getMilitary() {
        return (Military)readProperty("military");
    }


}
