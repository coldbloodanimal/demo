package com.example.demoelasticsearch;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeRepository extends ElasticsearchRepository<Resume,Long> {

    Page<Resume> findByNameAndBrief(String name,String brief, Pageable page);

    Page<Resume> findByNameOrBrief(String name,String brief, Pageable page);

    Page<Resume> findByBrief(String brief, Pageable page);
}
