package com.lxj.mianshibao.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;

/**
 * 移除题库题目关联请求
 *
 */
@Data
public class QuestionBankQuestionRemoveRequest implements Serializable {

    private Long questionId;
    private Long questionBankId;
    private static final long serialVersionUID = 1L;
}