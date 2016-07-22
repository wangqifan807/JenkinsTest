package fan.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fan.entity.School;
import fan.entity.TestDemo;
import fan.service.SchoolService;
import fan.service.TestDemoService;


@Controller
@RequestMapping(value = "/module/demo")
public class DemoController {
	@Autowired
	private SchoolService schoolService;
	@Autowired
	private TestDemoService  testDemoService;
	
	
	
	
	@RequestMapping("/find")
	public String findAll(Model model){
		List<School> list = schoolService.findAllSchool();
		model.addAttribute("list", list);
		return "../pages/success";
}
	
	@RequestMapping("/add")
	public String add(TestDemo testDemo,Model model){
		System.out.println("名字:"+testDemo.getStuName()+"年龄:"+testDemo.getAge()+"性别:"+testDemo.getGender());
		int num = testDemoService.add(testDemo);
		System.out.println(num);
		model.addAttribute("id", testDemo.getId());
		return "../pages/addsuccess";
	}
	
	@RequestMapping("/go")
	public String go(){
		return "../pages/add";
	}

}
