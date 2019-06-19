package com.example.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int idx, readnum, grp, lev, step;
	private String name, email, title, contents;
	private String writedate;
}
