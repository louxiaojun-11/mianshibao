package com.lxj.mianshibao.job.once;

import cn.hutool.core.collection.CollUtil;
import com.lxj.mianshibao.esdao.PostEsDao;
import com.lxj.mianshibao.esdao.QuestionEsDao;
import com.lxj.mianshibao.model.dto.post.PostEsDTO;
import com.lxj.mianshibao.model.dto.question.QuestionEsDTO;
import com.lxj.mianshibao.model.entity.Post;
import com.lxj.mianshibao.model.entity.Question;
import com.lxj.mianshibao.service.PostService;
import com.lxj.mianshibao.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 全量同步题目到 es
 *
 * @author lxj
 * 
 */
// todo 取消注释开启任务
//@Component
@Slf4j
public class FullSyncQuestionToEs implements CommandLineRunner {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionEsDao questionEsDao;

    @Override
    public void run(String... args) {
        List<Question> questionList = questionService.list();
        if (CollUtil.isEmpty(questionList)) {
            return;
        }
        //转为ES实体类
        List<QuestionEsDTO> questionEsDTOList = questionList.stream()
                .map(QuestionEsDTO::objToDto)
                .collect(Collectors.toList());
        //分页批量插入至ES
        final int pageSize = 500;
        int total = questionEsDTOList.size();
        log.info("FullSyncPostToEs start, total {}", total);
        for (int i = 0; i < total; i += pageSize) {
            int end = Math.min(i + pageSize, total);
            log.info("sync from {} to {}", i, end);
            questionEsDao.saveAll(questionEsDTOList.subList(i, end));
        }
        log.info("FullSyncPostToEs end, total {}", total);
    }
}
