package kr.hs.study.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.hs.study.dto.DataBean;


public interface dataInterface {
	
	public void insert(DataBean bean);
	public void update(DataBean bean);
	public void delete(String data1);
	public List<DataBean> select();

}
 