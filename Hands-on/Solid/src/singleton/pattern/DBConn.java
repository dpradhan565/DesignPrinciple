package singleton.pattern;

public class DBConn {
	
	private static DBConn object=new DBConn();
	
	private DBConn() {}
	
	public static DBConn getInstance() {
		return object;
	}
	
	public void showMessage() {
		System.out.println("SingleTon Class");
	}



}