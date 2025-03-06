package com.example.springBoot.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	@RequestMapping("/topics")
	public  List<Topics> getAlltopics() {
//		return Arrays.asList(
//				new Topics("1","Spring", "Spring framework description"),
//				new Topics("2","JAVA", "Java description")
//				);
		return topicService.getAllTopics();
		}
	@RequestMapping("/topics/{id}")
	public Topics getTopicById(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	//@PostMapping("/topics")
	@RequestMapping(method=RequestMethod.POST, value = "/topics")
	public void addTopics(@RequestBody Topics t) {
		topicService.addTopics(t);
	}
	@DeleteMapping("/topics/{id}")
	public void deleteTpoic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "topics/{id}")
	public void updateTopic(@PathVariable String id, @RequestBody Topics t) {
		topicService.updateTopic(id, t);
	}
}
