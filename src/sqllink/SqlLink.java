package sqllink;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlLink {

	public static String defaultUrl = "jdbc:mysql://localhost:3306/test";
    public static String defaultUser = "root";
    public static String defaultPassword = "";
	
    private String url, user, password;
    
    /**
     * Constructor for SQLLink which sets url, user and password to default values.
     */
	public SqlLink() {
		this(defaultUrl, defaultUser, defaultPassword);
	}
	
	/**
	 * Constructor for SQLLink which sets url, user and password to specified url, user, password
	 * @param url
	 * @param user
	 * @param password
	 */
	public SqlLink(String url, String user, String password) {
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	/**
	 * Query the database, returns the result of the query.
	 * @param q The query.
	 * @return result of query.
	 */
	public ResultSet query(String q) {
		ResultSet rs = null;
		try {
			Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            rs = st.executeQuery(q);
            return rs;
		} catch (SQLException ex) {
			System.out.println(ex);
			return null;
		}
	}
	
}