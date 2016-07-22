package fan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fan.dao.TestDemoDao;
import fan.entity.School;
import fan.entity.TestDemo;

@Service
@Transactional
public class TestDemoService {
	@Autowired
	private TestDemoDao testDemoDao;
	
	
	public int add(TestDemo td){
		return testDemoDao.add(td);
	}
}
