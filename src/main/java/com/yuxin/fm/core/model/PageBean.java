package com.yuxin.fm.core.model;

/**
 * 鍒嗛〉Model
 * @author 浠ｅ竻鍗�
 *
 */
public class PageBean {

	private Integer page; //
	private Integer pageSize=20; //
	private Integer start;  // 
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStart() {
		return (page-1)*pageSize;
	}
	
	
}
