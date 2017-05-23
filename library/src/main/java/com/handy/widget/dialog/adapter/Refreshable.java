package com.handy.widget.dialog.adapter;

import java.util.List;

/**
 * Created by Administrator on 2016/5/10 0010.
 */
public interface Refreshable {
    void refresh(List newData);

    void addAll(List newData);

    void clear();

    void delete(int position);

    void add(Object object);
}
