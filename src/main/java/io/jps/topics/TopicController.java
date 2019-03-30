package io.jps.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;

	
	//get all 
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
		
	
				//get one 
		@RequestMapping("/topics/{id}")
		public Topic getTopic(@PathVariable String id ){
			return topicService.getTopic(id);
		}
				
				
			//add 
		@RequestMapping(method=RequestMethod.POST, value="/topics")
		public void addTopic(@RequestBody Topic topic) {
			topicService.addTopic(topic);
			
		}
		
		//update
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
		public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
			topicService.updateTopic(id,topic);
			
		       }
		
		//Patch 
		@RequestMapping(method=RequestMethod.PATCH, value="/topics/{id}")
		public void updateTopicPartially(@PathVariable String id, @RequestBody Topic topic) {
			topicService.updateTopicPartially(id,topic);
			
		       }
		
		//delete
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			 topicService.deleteTopic(id);
			
		       }
	

}
