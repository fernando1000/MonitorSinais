package br.com.x10d.monitorsinais.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings({"unchecked", "unused"})
@Entity(name="driver")
public class DriverCustom {
    
	@Id
	@GeneratedValue
	private Long id;

	
	protected String localLicense;
    protected boolean localLicenseTracker = false;
    protected String localLicenseCategory;
    protected boolean localLicenseCategoryTracker = false;
    protected java.util.Calendar localLicenseExpires;
    protected boolean localLicenseExpiresTracker = false;
    protected String localMobile;
    protected boolean localMobileTracker = false;
    protected java.util.Calendar localMoppExpires;
    protected boolean localMoppExpiresTracker = false;
    protected String localMopp;
    protected boolean localMoppTracker = false;
    protected String localName;
    protected boolean localNameTracker = false;
    protected String localNickname;
    protected boolean localNicknameTracker = false;
    protected String localNote;
    protected boolean localNoteTracker = false;
    protected String localPassword;
    protected boolean localPasswordTracker = false;
    protected String localReportLineStyle;
    protected boolean localReportLineStyleTracker = false;
    
    public boolean isLicenseSpecified() {
        return localLicenseTracker;
    }

    
    public java.lang.String getLicense() {
        return localLicense;
    }

   
    public void setLicense(java.lang.String param) {
        localLicenseTracker = param != null;

        this.localLicense = param;
    }

    public boolean isLicenseCategorySpecified() {
        return localLicenseCategoryTracker;
    }

   
    public java.lang.String getLicenseCategory() {
        return localLicenseCategory;
    }

   
    public void setLicenseCategory(java.lang.String param) {
        localLicenseCategoryTracker = param != null;

        this.localLicenseCategory = param;
    }

    public boolean isLicenseExpiresSpecified() {
        return localLicenseExpiresTracker;
    }

 
    public java.util.Calendar getLicenseExpires() {
        return localLicenseExpires;
    }

    
    public void setLicenseExpires(java.util.Calendar param) {
        localLicenseExpiresTracker = param != null;

        this.localLicenseExpires = param;
    }

    public boolean isMobileSpecified() {
        return localMobileTracker;
    }

 
    public java.lang.String getMobile() {
        return localMobile;
    }

    
    public void setMobile(java.lang.String param) {
        localMobileTracker = param != null;

        this.localMobile = param;
    }

    public boolean isMoppExpiresSpecified() {
        return localMoppExpiresTracker;
    }

  
    public java.util.Calendar getMoppExpires() {
        return localMoppExpires;
    }

  
    public void setMoppExpires(java.util.Calendar param) {
        localMoppExpiresTracker = param != null;

        this.localMoppExpires = param;
    }

    public boolean isMoppSpecified() {
        return localMoppTracker;
    }

    
    public java.lang.String getMopp() {
        return localMopp;
    }

   
    public void setMopp(java.lang.String param) {
        localMoppTracker = param != null;

        this.localMopp = param;
    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

   
    public java.lang.String getName() {
        return localName;
    }

    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;
    }

    public boolean isNicknameSpecified() {
        return localNicknameTracker;
    }

  
    public java.lang.String getNickname() {
        return localNickname;
    }

 
    public void setNickname(java.lang.String param) {
        localNicknameTracker = param != null;

        this.localNickname = param;
    }

    public boolean isNoteSpecified() {
        return localNoteTracker;
    }

    
    public java.lang.String getNote() {
        return localNote;
    }

  
    public void setNote(java.lang.String param) {
        localNoteTracker = param != null;

        this.localNote = param;
    }

    public boolean isPasswordSpecified() {
        return localPasswordTracker;
    }

   
    public java.lang.String getPassword() {
        return localPassword;
    }

    
    public void setPassword(java.lang.String param) {
        localPasswordTracker = param != null;

        this.localPassword = param;
    }

    public boolean isReportLineStyleSpecified() {
        return localReportLineStyleTracker;
    }

  
    public java.lang.String getReportLineStyle() {
        return localReportLineStyle;
    }

 
    public void setReportLineStyle(java.lang.String param) {
        localReportLineStyleTracker = param != null;

        this.localReportLineStyle = param;
    }

}
