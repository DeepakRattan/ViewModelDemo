package com.example.deepakrattan.viewmodeldemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("ApplicationUserId")
    @Expose
    private Integer applicationUserId;
    @SerializedName("UserIdentityKey")
    @Expose
    private Integer userIdentityKey;
    @SerializedName("UserTypeId")
    @Expose
    private Object userTypeId;
    @SerializedName("UserType")
    @Expose
    private String userType;
    @SerializedName("FName")
    @Expose
    private String fName;
    @SerializedName("LName")
    @Expose
    private String lName;
    @SerializedName("MemberCode")
    @Expose
    private String memberCode;
    @SerializedName("EmailId")
    @Expose
    private String emailId;
    @SerializedName("MobileNo")
    @Expose
    private Object mobileNo;
    @SerializedName("Image")
    @Expose
    private Object image;
    @SerializedName("Gender")
    @Expose
    private Object gender;
    @SerializedName("DateOfBirth")
    @Expose
    private Object dateOfBirth;
    @SerializedName("Address")
    @Expose
    private Object address;
    @SerializedName("FatherName")
    @Expose
    private Object fatherName;
    @SerializedName("MotherName")
    @Expose
    private Object motherName;
    @SerializedName("Designation")
    @Expose
    private String designation;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("ErrorMessage")
    @Expose
    private String errorMessage;

    public Integer getApplicationUserId() {
        return applicationUserId;
    }

    public void setApplicationUserId(Integer applicationUserId) {
        this.applicationUserId = applicationUserId;
    }

    public Integer getUserIdentityKey() {
        return userIdentityKey;
    }

    public void setUserIdentityKey(Integer userIdentityKey) {
        this.userIdentityKey = userIdentityKey;
    }

    public Object getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Object userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Object getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Object mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getFatherName() {
        return fatherName;
    }

    public void setFatherName(Object fatherName) {
        this.fatherName = fatherName;
    }

    public Object getMotherName() {
        return motherName;
    }

    public void setMotherName(Object motherName) {
        this.motherName = motherName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
