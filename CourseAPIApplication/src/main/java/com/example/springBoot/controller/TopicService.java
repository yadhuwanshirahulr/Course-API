package com.example.springBoot.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	private List<Topics> topic = new ArrayList<>(Arrays.asList(new Topics("1","Springboot", "This is springboot Description"),
			new Topics("2","JAVA", "Java description")));
	public List<Topics> getAllTopics(){
		//return topic;
		List<Topics> topic = new ArrayList<>();
		topicRepository.findAll().forEach(topic::add);
		return topic;
	}
	
	public Topics getTopicById(String id) {
		//return topic.stream().filter(t->;t.getId().equals(id)).findFirst().get();	
			return topicRepository.findById(id).get();
		}
	
	public void addTopics(Topics t) {
		topicRepository.save(t);
	}
	public void deleteTopic(String id) {
//		for(Topics t:topic) {
//			if(t.getId().equals(id)) {
//				topic.remove(t);
//				System.out.println(topic);
//				System.out.println("Deleted Successfully");
//			}
//		}
		topicRepository.deleteById(id);
	}
	public void updateTopic(String id,Topics t) {
//		for(Topics it:topic) {
//			if(it.getId().equals(id)) {
//				it.setDescription(t.getDescription());
//				it.setName(t.getName());
//			}
//		}
		topicRepository.save(t);
	}
	
}
