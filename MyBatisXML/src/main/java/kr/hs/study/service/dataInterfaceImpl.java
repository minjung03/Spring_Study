package kr.hs.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.daoInterface;
import kr.hs.study.dto.DataBean;

@Service
public class dataInterfaceImpl implements dataInterface {

	
	@Autowired
	private daoInterface dao;
	
	public void insert(DataBean bean) {
		dao.insert(bean);
	}


}
