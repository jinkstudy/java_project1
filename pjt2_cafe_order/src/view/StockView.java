package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;

import model.dao.StockModel;

import java.awt.*;
import java.util.*;



public class StockView   extends JPanel {
	
	//������� ����
	JTextField tfStOrderNo;
	JLabel[] lbstMenulist =new JLabel[9];
	JTextField [] tfStOrderCnt = new JTextField[9] ;
	JButton btstOrder, btstCancel, btstSearch;
	JComboBox cbstSearch;
	
	JRadioButton rbstOrderSearch,rbStSearch;
	JTable tableStock;
	
	StockTableModel tbModelStock;
	
	StockModel db;
	
	//String [] columnNames;
	
	
	
	public StockView() {
		addLayout(); 	// ȭ�鼳��
		initStyle();
		eventProc();
		connectDB();	// DB����
	}

	//��ġ ���̾ƿ�
	public void addLayout() {
		String[] mlist;
		
		try {
			db = new StockModel();
			mlist = db.getMname();
			
			tfStOrderNo = new JTextField(15);
			btstOrder = new JButton("�ֹ�");
			btstCancel = new JButton("���");
			btstSearch = new JButton("�˻�");
			cbstSearch = new JComboBox(mlist);
			rbstOrderSearch = new JRadioButton("�ֹ��̷���ȸ");
			rbStSearch = new JRadioButton("���������ȸ");
			
			for (int i = 0; i < mlist.length; i++) {
				lbstMenulist[i]= new JLabel(mlist[i]);
				tfStOrderCnt[i] = new JTextField();
			}
			tbModelStock = new StockTableModel();
			tableStock = new JTable(tbModelStock);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "ȭ�鱸������" + e.getMessage());
		}
		
		
	
		
		//ȭ�� ����
			
		
		//���� ����
		JPanel p_west = new JPanel();
		p_west.setBorder(new TitledBorder("�԰���û"));
		p_west.setLayout(new BorderLayout());
		
			//����-����
			JPanel p_west_n = new JPanel();
			p_west_n.setLayout(new GridLayout(1,2));
			p_west_n.add(new JLabel("�԰��ֹ���ȣ"));
			p_west_n.add(tfStOrderNo);
		
			//���� - ����
			JPanel p_west_c = new JPanel();
			p_west_c.setLayout(new GridLayout(9,2));
			for (int i = 0; i < 9; i++) {
				p_west_c.add(lbstMenulist[i]);
				p_west_c.add(tfStOrderCnt[i]);
				
			}
			
			//���� - ����
			
			JPanel p_west_s = new JPanel();
			p_west_s.setLayout(new GridLayout(1,2));
			p_west_s.add(btstOrder);
			p_west_s.add(btstCancel);
			
			//p_west_n.setBorder(new TitledBorder(""));
			p_west_c.setBorder(new TitledBorder(""));
			p_west_s.setBorder(new TitledBorder(""));
			
		//���� ���� ���̱�	
		
		p_west.add(p_west_n,BorderLayout.NORTH);
		p_west.add(p_west_c,BorderLayout.CENTER);
		p_west.add(p_west_s,BorderLayout.SOUTH);
		
		
		//������ ����
		JPanel p_east = new JPanel();
		p_east.setBorder(new TitledBorder("��ȸ"));
		p_west_s.setLayout(new BorderLayout());	
			//������ -��
			JPanel p_east_n = new JPanel();
			p_east_n.setLayout(new GridLayout(2,1));
			
				//������ - ��- ��
				JPanel p_east_n_n = new JPanel();
				p_east_n_n.setLayout(new GridLayout(1,2));
				p_east_n_n.add(rbstOrderSearch);
				p_east_n_n.add(rbStSearch);
				
				//������ - ��- d�Ʒ�
				JPanel p_east_n_s = new JPanel();
				//p_east_n_s.setLayout(new GridLayout(1,3));
				p_east_n_s.add(new JLabel("��ȸ")); // ���ǵ��� ����
				p_east_n_s.add(cbstSearch);	
				//p_east_n_s.
			
				
			p_east_n.add(p_east_n_n);
			p_east_n.add(p_east_n_s);
			
			//������ ����
			JPanel p_east_c = new JPanel();
			p_east_c.add(new JScrollPane(tableStock));
			
			//������ ���� ���̱�	
			
			p_east.add(p_east_n,BorderLayout.NORTH);
			p_east.add(p_east_c,BorderLayout.CENTER);
			
		
		
		//��ü ����
		setLayout(new GridLayout(1,2));
		add(p_west);
		add(p_east);
		

	}
	
	// �ʱ� ����
	public void initStyle() {
		// TODO Auto-generated method stub
		
	}
	
	// �̺�Ʈ ó��
	public void eventProc() {
		// TODO Auto-generated method stub
		
	}
	// ��� ����
	public void connectDB() {
		// TODO Auto-generated method stub
		
	}

	//ȭ�鿡 ���̺� ���̴� �޼ҵ�
	class StockTableModel extends AbstractTableModel{
		ArrayList data = new ArrayList();
		String [] columnNames = {"�԰���ȣ","��ǰ��","��û ����","�ֹ�����"};
		
		@Override
		public int getColumnCount() {
			 return columnNames.length;
		}

		@Override
		public int getRowCount() {
			return data.size(); 
		}

		@Override
		public Object getValueAt(int row, int col) {
			ArrayList temp = (ArrayList)data.get( row );
	        return temp.get( col ); 
		}
		 public String getColumnName(int col){
		    	return columnNames[col];
		    }
		
	}
	



	

	
}