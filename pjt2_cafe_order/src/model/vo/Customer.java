package model.vo;

public class Customer {
	String custTel; //����ȭ��ȣ
	int custmile; //���ϸ���
	String cusDay; // ��¥
	String cusorder; //�ֹ�����
	int custotal; //�Ѱ���
	

	public String getCusDay() {
		return cusDay;
	}

	public void setCusDay(String cusDay) {
		this.cusDay = cusDay;
	}

	public String getCusorder() {
		return cusorder;
	}

	public void setCusorder(String cusorder) {
		this.cusorder = cusorder;
	}

	public int getCustmile() {
		return custmile;
	}

	public void setCustmile(int custmile) {
		this.custmile = custmile;
	}

	public String getCustTel() {
		return custTel;
	}

	public int getCustotal() {
		return custotal;
	}

	public void setCustotal(int custotal) {
		this.custotal = custotal;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
}

