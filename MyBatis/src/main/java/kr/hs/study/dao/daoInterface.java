package kr.hs.study.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.hs.study.dto.DataBean;

public interface daoInterface {
	
	public void insert(DataBean bean);
	public void update(DataBean bean);
	public void delete(String data);
	public List<DataBean> select();

}
