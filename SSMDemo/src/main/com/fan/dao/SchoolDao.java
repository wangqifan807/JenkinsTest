package fan.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import fan.entity.School;

@Repository
public interface SchoolDao {
	public List<School> findAllSchool();
}
