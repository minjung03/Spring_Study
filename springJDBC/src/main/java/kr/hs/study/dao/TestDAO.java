package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;
import kr.hs.study.mapper.mapperClass;

@Component
public class TestDAO {

	// ���� ������ ������ ��
	// ������ ������ �� : JdbcTemplate (�� ���� �־����) => �ڵ����� ���

	@Autowired
	JdbcTemplate db; // JdbcTemplate Ÿ���� bean�� ã�Ƽ� �ڵ�����
	
	@Autowired
	private mapperClass mapper;

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
	
	public List<TestBean> select_data(){
		String sql = "select * from test";
		List<TestBean> list = db.query(sql, mapper);
		return list;
	}
	
}
