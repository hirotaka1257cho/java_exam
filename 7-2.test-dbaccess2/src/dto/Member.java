package dto;




/**
 * メンバー情報を表すDTO.
 * 
 * @author igamasayuki
 *
 */
public class Member {

	private Integer id;
	/** ID */
	private String name;
	
	/** 名前 */
	private Integer age;
	
	/** 年齢 */
	
	/** 部署ID */
	private Integer depId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getDepId() {
		return depId;
	}

	public void setDepId(Integer depId) {
		this.depId = depId;
	}

	@Override
	public String toString(){
		return id + name + age + depId;
	}

	


}
