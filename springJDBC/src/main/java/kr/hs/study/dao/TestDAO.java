package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {

	// ���� ������ ������ ��
	// ������ ������ �� : JdbcTemplate (�� ���� �־����) => �ڵ����� ���

	@Autowired
	JdbcTemplate db; // JdbcTemplate Ÿ���� bean�� ã�Ƽ� �ڵ�����

	// insert
	
	public void insert_data(TestBean bean) {
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	public void update_data(TestBean bean) {
		String sql = "update test set data2=? where data1=?";
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	public void delete_data(int data1) {
		String sql = "delete test where data1 = ?";
		db.update(sql, data1);
	}
}
