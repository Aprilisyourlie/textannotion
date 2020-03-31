package com.annotation.dao;

import com.annotation.model.InstanceLabel;
import com.annotation.model.Label;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InstanceLabelMapper {

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(InstanceLabel record);


    /**
     * 根据文件ID查询instance对应的label
     * @param docId
     * @return
     */
    List<Label> selectInstanceLabelByDocId(int docId);

    List<Label> selectInstanceLabelByTaskId(Integer taskId);

    /**
     * 根据文件ID查询item1对应的label
     * @param docId
     * @return
     */
    List<Label> selectItem1LabelByDocId(int docId);

    List<Label> selectItem1LabelByTaskId(Integer taskId);
    /**
     * 根据文件ID查询item2对应的label
     * @param docId
     * @return
     */
    List<Label> selectItem2LabelByDocId(int docId);

    List<Label> selectItem2LabelByTaskId(Integer taskId);

    int deleteByTid(Integer tid);

}