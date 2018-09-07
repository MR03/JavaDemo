package com.silvertb.design;

import java.util.List;

public interface BasicMapper<T> {
    public int save(T domain); // 单个保存

    public T findByPK(Integer id); // 根据主键查找

    public int saveBatch(List list);

    public int update(T domain);

    public int updateIgnoreNull(T domain);

    public int updateBatch(List list);

    public int delete(T domain);

    public int deleteBatch(List list);

    public int deleteByPK(Long id);

    public int deleteAll();

    public long count();

//    public List find(Map<String, Object> paramMap, PageBounds pageBounds);
}
