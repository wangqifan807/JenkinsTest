package fan.dao;

import org.springframework.stereotype.Repository;

import fan.entity.TestDemo;

@Repository
public interface TestDemoDao {
	public int add(TestDemo td);
}
