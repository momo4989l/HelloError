package com.example.daoImpl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dao.BoardDAO;
import com.example.vo.BoardVO;

@Repository
public class BoardDaoImpl implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void create(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAll(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int idx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void answer(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTotalCount(Map map) {
		// TODO Auto-generated method stub
		
	}
}
