package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity // Model classes
public class School {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = true, name = "SCHOOL_NAME", length = 100)
	private String name;
	private Boolean status;
	private int numberOfStudent;
	@Version
	private int version;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateofOpening;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getDateofOpening() {
		return dateofOpening;
	}

	public void setDateofOpening(Date dateofOpening) {
		this.dateofOpening = dateofOpening;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateofOpening == null) ? 0 : dateofOpening.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfStudent;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + version;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (dateofOpening == null) {
			if (other.dateofOpening != null)
				return false;
		} else if (!dateofOpening.equals(other.dateofOpening))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfStudent != other.numberOfStudent)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(Long id, String name, Boolean status, int numberOfStudent, int version, Date dateofOpening) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.numberOfStudent = numberOfStudent;
		this.version = version;
		this.dateofOpening = dateofOpening;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", status=" + status + ", numberOfStudent=" + numberOfStudent
				+ ", version=" + version + ", dateofOpening=" + dateofOpening + "]";
	}

}
