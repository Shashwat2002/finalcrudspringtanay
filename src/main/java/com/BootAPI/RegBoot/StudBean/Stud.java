package com.BootAPI.RegBoot.StudBean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Stud {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String firstName;
	    private String lastName;
	    private String mobileNumber;
	    private String alternativeMobileNumber;
	    private String gender;
	    private String dateOfBirth;
	    private String fatherName;
	    
	    public Stud() {
			
		}
	    
		public Stud(Long id, String firstName, String lastName, String mobileNumber, String alternativeMobileNumber,
				String gender, String dateOfBirth, String fatherName) {
			super();
			this.id = id;
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setMobileNumber(mobileNumber);
			this.setAlternativeMobileNumber(alternativeMobileNumber);
			this.setGender(gender);
			this.setDateOfBirth(dateOfBirth);
			this.setFatherName(fatherName);
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the mobileNumber
		 */
		public String getMobileNumber() {
			return mobileNumber;
		}

		/**
		 * @param mobileNumber the mobileNumber to set
		 */
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		/**
		 * @return the alternativeMobileNumber
		 */
		public String getAlternativeMobileNumber() {
			return alternativeMobileNumber;
		}

		/**
		 * @param alternativeMobileNumber the alternativeMobileNumber to set
		 */
		public void setAlternativeMobileNumber(String alternativeMobileNumber) {
			this.alternativeMobileNumber = alternativeMobileNumber;
		}

		/**
		 * @return the gender
		 */
		public String getGender() {
			return gender;
		}

		/**
		 * @param gender the gender to set
		 */
		public void setGender(String gender) {
			this.gender = gender;
		}

		/**
		 * @return the dateOfBirth
		 */
		public String getDateOfBirth() {
			return dateOfBirth;
		}

		/**
		 * @param dateOfBirth the dateOfBirth to set
		 */
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		/**
		 * @return the fatherName
		 */
		public String getFatherName() {
			return fatherName;
		}

		/**
		 * @param fatherName the fatherName to set
		 */
		public void setFatherName(String fatherName) {
			this.fatherName = fatherName;
		}


		
	    
	    
	    

}
