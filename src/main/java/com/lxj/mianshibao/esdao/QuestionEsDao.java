package com.lxj.mianshibao.esdao;

import com.lxj.mianshibao.model.dto.post.PostEsDTO;
import com.lxj.mianshibao.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 帖子 ES 操作
 *
 * @author lxj 
 * 
 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}