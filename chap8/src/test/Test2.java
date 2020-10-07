package test;

interface DataAccessObject{
	void select();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject{
	String name = "Oracle DB";

	@Override
	public void select() {
		System.out.println(name + "에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println(name + "에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println(name + "에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(name + "에서 삭제");
		
	}
}

class MySqlDao implements DataAccessObject{
	String name = "Mysql DB";

	@Override
	public void select() {
		System.out.println(name + "에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println(name + "에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println(name + "에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(name + "에서 삭제");
		
	}
}
public class Test2 {

	public static void main(String[] args) {

		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}