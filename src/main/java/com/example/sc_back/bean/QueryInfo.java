package com.example.sc_back.bean;

public class QueryInfo {
    private String query;//查询条件
    private int pageNum = 1;//当前页
    private int pageSize = 1;//每页最大数

    public QueryInfo(String query, int pageNum, int pageSize) {
        this.query = query;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
