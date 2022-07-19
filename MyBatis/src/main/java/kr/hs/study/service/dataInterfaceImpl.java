package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.daoInterface;
import kr.hs.study.dto.DataBean;

@Service
public class dataInterfaceImpl implements dataInterface {

	
	@Autowired
	private daoInterface dao;
	
	@Override
	public void insert(DataBean bean) {
		dao.insert(bean);
	}

	@Override
	public List<DataBean> select() {
		return dao.select();
	}

	@Override
	public void update(DataBean bean) {
		dao.update(bean);
	}

	@Override
	public void delete(String data1) {
		dao.delete(data1);
	}

}
