package com.lxj.mianshibao.mapper;

import com.lxj.mianshibao.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author lxj
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2025-03-07 10:55:34
* @Entity com.lxj.mianshibao.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    @Select("select * from question where updateTime  >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);

}




