package co.edu.iudigital.app.model.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile")

public class Profile implements Serializable{

		/**
	 * 
	 */
	private static final long serialVersionUID = 2327119390730978198L;
		@Id
		@Column(name="profile_id")
		private int id;
		private String name;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setNombre(String name) {
			this.name = name;
		}
		
		
}
