package com.example.demoelasticsearch;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

@RestController
public class ResumeController {
    @Autowired
    ResumeRepository resumeRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @RequestMapping(value="/hi",method= RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    @RequestMapping(value="/searchResume",method= RequestMethod.GET)
    public Page<Resume> search(@RequestParam("keyword") String keyword){
        Pageable pageable = PageRequest.of(1, 10);
        return resumeRepository.findByNameOrBrief(keyword,keyword,pageable);
    }

    @RequestMapping(value="/searchResumeByBrief",method= RequestMethod.GET)
    public Page<Resume> searchResumeByBrief(@RequestParam("keyword") String keyword){
        Pageable pageable = PageRequest.of(1, 10);
        return resumeRepository.findByBrief(keyword,pageable);
    }

    @RequestMapping(value="/searchAll",method= RequestMethod.GET)
    public Page<Resume> searchAll(@RequestParam("keyword") String keyword){
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.multiMatchQuery(keyword,"brief","name"))
                .build();
        Page<Resume> page=resumeRepository.search(searchQuery);
        return page;
    }

    @RequestMapping(value="/searchByTemplate",method= RequestMethod.GET)
    public List<Resume> searchByTemplate(@RequestParam("keyword") String keyword){
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.multiMatchQuery(keyword,"brief"))
                .build();
        List<Resume> page=elasticsearchTemplate.queryForList(searchQuery,Resume.class);
        return page;
    }

    @RequestMapping(value="/addResume",method= RequestMethod.POST)
    public Resume addResume(@RequestBody Resume resume){
        return resumeRepository.save(resume);
    }
}
