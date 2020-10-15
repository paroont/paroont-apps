package com.paroont.core.shared.dto.common;

import java.util.ArrayList;
import java.util.List;

public class CorePaginationDto<T extends CoreObj> implements CoreDto{

    protected long totalRecords;

    protected List<T> data = new ArrayList<>();

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
