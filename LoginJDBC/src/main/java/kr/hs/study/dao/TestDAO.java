package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component
public class TestDAO {
	
	// ���� ������ ������ ��
	
	@Autowired
	JdbcTemplate db;
	
	// insert
	public void insert_userData (TestBean bean) {
		String sql = "insert into userTBL values(?,?,?,?)";
		db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername(), bean.getUserage());
	}

}
