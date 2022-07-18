package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.hs.study.dto.DataBean;

@Repository
public class daoInterfaceImpl implements daoInterface {

	@Autowired
	private SqlSessionTemplate session; // 실제 쿼리를 날리는 애
	
	@Override
	public void insert(DataBean bean) {
		session.insert("test.insert_data", bean);
	}

	@Override
	public List<DataBean> select() {
		return session.selectList("test.select_data");
	}

	@Override
	public void update(DataBean bean) {
		session.update("test.update_data", bean);
	}
	
}
