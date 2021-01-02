package com.xbs.util.base;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

/**
 * @Description
 * @Author cheng
 * @Date1/2/21 3:54 PM
 * @Version V1.0
 **/
@Data
public class PageList<T> {

    private List<T> records;

    private Page page;

    private PageList(){}

    public PageList buildPage(List<T> records,Page page){
        PageList pageList =  new PageList();
        pageList.setPage(page);
        pageList.setRecords(records);
        return pageList;
    }


    public PageList buildEmptyPage(Page page){
        PageList pageList =  new PageList();
        pageList.setRecords(Lists.newArrayList());
        pageList.setPage(page);
        return pageList;
    }
}
