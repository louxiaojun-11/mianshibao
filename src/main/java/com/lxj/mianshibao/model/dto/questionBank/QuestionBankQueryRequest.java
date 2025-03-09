package com.lxj.mianshibao.model.dto.questionBank;

import com.lxj.mianshibao.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 查询题库请求
 *
 * @author lxj
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionBankQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * id
     */
    private Long notId;

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 标题
     */
    private String title;

    private String description;

    private String picture;

    private Long userId;
    /**
     * 是否要查询题目列表
     */
    private boolean needQueryQuestionList;

    private static final long serialVersionUID = 1L;
}