package com.example.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BoardDAO;
import com.example.service.BoardService;
import com.example.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;

	@Override
	public void insertBoard(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectBoard(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(Map map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int idx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void answerBoard(BoardVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTotalCount(Map map) {
		// TODO Auto-generated method stub
		
	}
}
