package com.mani.pcfrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RestdemoService {
	
	@Autowired
	private RestdemoRepository repos;

	
	
	
	public void save(String name, Integer id,Integer quantity)
	{
		Orders entity = new Orders();
		entity.setOrderId(id);
		entity.setOrderName(name);
		entity.setQuantity(quantity);
		repos.save(entity); 
	}
	
	public Orders get(Integer id){
		
		
		return repos.findOne(id);		
		
	}
	

}
