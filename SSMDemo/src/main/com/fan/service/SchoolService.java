package fan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fan.dao.SchoolDao;
import fan.entity.School;

@Service
@Transactional
public class SchoolService {
	@Autowired
	private SchoolDao schoolDao;
	
	
	public List<School> findAllSchool(){
		List<School> list = null;
		School school = new School();
		for(int i = 0;i<5;i++) {
			school.setAreaId(i);
			school.setSchoolName("test" + i);
			list.add(school);
		}
		/*return schoolDao.findAllSchool();*/
		return list;
	}
		
}
