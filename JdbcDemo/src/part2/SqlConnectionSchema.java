package part2;

public class SqlConnectionSchema {
	
	private String jdbcUrl;
	
	private String userName;
	
	private String pwd;
	
	public SqlConnectionSchema(String schema) {
		jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
		if(schema.equalsIgnoreCase("store")) {
			userName="store";
			pwd="123";
		}
		else if(schema.equalsIgnoreCase("sqlblackbook")) {
			userName="sqlblackbook";
			pwd="12345";
		}
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public String getUserName() {
		return userName;
	}

	public String getPwd() {
		return pwd;
	}
	
	
	
}
