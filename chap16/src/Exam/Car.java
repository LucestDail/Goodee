package Exam;

class Car {
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;

	public Car() {
	};

	public Car(int month, int con, String car, int qty, String remark) {
		this.month = month;
		this.con = con;
		this.car = car;
		this.qty = qty;
		this.remark = remark;
	}

	public int getMonth() {
		return month;
	}

	public int getCon() {
		return con;
	}

	public String getCar() {
		return car;
	}

	public int getQty() {
		return qty;
	}

	public String getRemark() {
		return remark;
	}

	public String toString() {
		return String.format("[month %d]:[con %d]:[car %s]:[qty %d]:[remark %s]", month, con, car, qty, remark);
	}
}