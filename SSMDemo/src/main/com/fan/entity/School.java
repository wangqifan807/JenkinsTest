package fan.entity;

import java.util.List;


public class School {
	private int schoolId;
	private String schoolName;
	private int areaId;
	private int Type;
	private College college;
	private Areas areas;
	public Areas getAreas() {
		return areas;
	}
	public void setAreas(Areas areas) {
		this.areas = areas;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
}
