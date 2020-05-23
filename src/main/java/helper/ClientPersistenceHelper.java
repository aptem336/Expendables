package helper;

public class ClientPersistenceHelper implements PersistenceHelper {
    public static final String getAllNamedQuery = "getAll";

    @Override
    public String getAllNamedQuery() {
        return getAllNamedQuery;
    }
}
