package com.te.mapping.hibernetmapping;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Girl {
	@Id
	private int gid;
	private String name;
	@OneToMany(mappedBy = "girl")
	private List<Boy> boy;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Boy> getBoy() {
		return boy;
	}

	public void setBoy(List<Boy> boy) {
		this.boy = boy;
	}

	@Override
	public String toString() {
		return "Girl [gid=" + gid + ", name=" + name + ", boy=" + boy + "]";
	}

}
