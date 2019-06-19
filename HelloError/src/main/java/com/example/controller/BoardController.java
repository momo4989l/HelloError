package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.BoardService;

public class BoardController {
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/biz", method = RequestMethod.GET)
	public String home() {
		return "index";
	}
}
