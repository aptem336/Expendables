import javax.annotation.sql.DataSourceDefinition;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@DataSourceDefinition(name = "java:global/jdbc/db",
        className = "org.sqlite.JDBC",
        url = "jdbc:sqlite:D:\\db.db"
)
public class DataSourceProducer {
    @Produces
    @PersistenceContext(unitName = "pu")
    private EntityManager em;
}
