package com.lxj.mianshibao.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建题库题目关联请求
 *
 * @author lxj
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@Data
public class QuestionBankQuestionAddRequest implements Serializable {

    private Long questionId;
    private Long questionBankId;
    private static final long serialVersionUID = 1L;
}