package cbe.inserting.model.auto;

import org.apache.cayenne.CayenneDataObject;

import cbe.inserting.model.User;

/**
 * Class _Setting was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Setting extends CayenneDataObject {

    public static final String KEY_PROPERTY = "key";
    public static final String VALUE_PROPERTY = "value";
    public static final String USER_PROPERTY = "user";

    public static final String ID_PK_COLUMN = "id";

    public void setKey(String key) {
        writeProperty("key", key);
    }
    public String getKey() {
        return (String)readProperty("key");
    }

    public void setValue(String value) {
        writeProperty("value", value);
    }
    public String getValue() {
        return (String)readProperty("value");
    }

    public void setUser(User user) {
        setToOneTarget("user", user, true);
    }

    public User getUser() {
        return (User)readProperty("user");
    }


}
