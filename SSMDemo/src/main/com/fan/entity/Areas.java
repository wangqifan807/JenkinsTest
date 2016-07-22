package fan.entity;

public class Areas {
	private int areaId;
	private String name;
	private String joinName;
	private int parentId;
	private int vieworder;
	private School school;
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoinName() {
		return joinName;
	}
	public void setJoinName(String joinName) {
		this.joinName = joinName;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getVieworder() {
		return vieworder;
	}
	public void setVieworder(int vieworder) {
		this.vieworder = vieworder;
	}
}
