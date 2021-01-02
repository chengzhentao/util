package com.xbs.util.base;

import lombok.Data;

/**
 * @Description
 * @Author cheng
 * @Date1/2/21 3:54 PM
 * @Version V1.0
 **/
@Data
public class Page {

    private int pageIndex;

    private int pageSize;

    private int total;

    public Page(int pageIndex,int pageSize){
        this(pageIndex,pageSize,Constant.DELETE);
    }

    public Page(int pageIndex,int pageSize,int total){
        if(total > 0) {
            int pageIndexMax = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
            this.pageIndex = pageIndex > pageIndexMax ? pageIndexMax : pageIndex;
        }else{
            this.pageIndex = pageIndex;
        }
        this.pageSize = pageSize;
        this.total = total;
    }
}
