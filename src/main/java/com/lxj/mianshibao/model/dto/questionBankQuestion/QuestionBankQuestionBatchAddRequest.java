package com.lxj.mianshibao.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 批量创建题库题目关联请求
 *
 * @author lxj
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@Data
public class QuestionBankQuestionBatchAddRequest implements Serializable {

    private Long questionBankId;
    private List<Long> questionIdList;
    private static final long serialVersionUID = 1L;
}