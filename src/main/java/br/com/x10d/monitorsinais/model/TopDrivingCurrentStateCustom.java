package br.com.x10d.monitorsinais.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings({"unchecked", "unused"})
@Entity(name="topDrivingCurrentState")
public class TopDrivingCurrentStateCustom {
   
	@Id
	@GeneratedValue
	private Long id;
	
    protected java.lang.String localOwner;
    protected boolean localOwnerTracker = false;
    protected java.lang.String localPlate;
    protected boolean localPlateTracker = false;
    protected java.lang.String localSerial;
    protected boolean localSerialTracker = false;
    protected java.lang.String localDLicense;
    protected boolean localDLicenseTracker = false;
    protected java.lang.String localDMopp;
    protected boolean localDMoppTracker = false;
    protected java.lang.String localDName;
    protected boolean localDNameTracker = false;
    protected java.lang.String localDNick;
    protected boolean localDNickTracker = false;
    protected java.util.Calendar localJStart;
    protected boolean localJStartTracker = false;
    protected java.lang.String localJStatus;
    protected boolean localJStatusTracker = false;
    protected java.util.Calendar localTTime;
    protected boolean localTTimeTracker = false;
    protected java.lang.String localVName;
    protected boolean localVNameTracker = false;

    public boolean isOwnerSpecified() {
        return localOwnerTracker;
    }

  
    public java.lang.String getOwner() {
        return localOwner;
    }

  
    public void setOwner(java.lang.String param) {
        localOwnerTracker = param != null;

        this.localOwner = param;
    }

    public boolean isPlateSpecified() {
        return localPlateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPlate() {
        return localPlate;
    }

    /**
     * Auto generated setter method
     * @param param Plate
     */
    public void setPlate(java.lang.String param) {
        localPlateTracker = param != null;

        this.localPlate = param;
    }

    public boolean isSerialSpecified() {
        return localSerialTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSerial() {
        return localSerial;
    }

    /**
     * Auto generated setter method
     * @param param Serial
     */
    public void setSerial(java.lang.String param) {
        localSerialTracker = param != null;

        this.localSerial = param;
    }

    public boolean isDLicenseSpecified() {
        return localDLicenseTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDLicense() {
        return localDLicense;
    }

    /**
     * Auto generated setter method
     * @param param DLicense
     */
    public void setDLicense(java.lang.String param) {
        localDLicenseTracker = param != null;

        this.localDLicense = param;
    }

    public boolean isDMoppSpecified() {
        return localDMoppTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDMopp() {
        return localDMopp;
    }

    /**
     * Auto generated setter method
     * @param param DMopp
     */
    public void setDMopp(java.lang.String param) {
        localDMoppTracker = param != null;

        this.localDMopp = param;
    }

    public boolean isDNameSpecified() {
        return localDNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDName() {
        return localDName;
    }

    /**
     * Auto generated setter method
     * @param param DName
     */
    public void setDName(java.lang.String param) {
        localDNameTracker = param != null;

        this.localDName = param;
    }

    public boolean isDNickSpecified() {
        return localDNickTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDNick() {
        return localDNick;
    }

    /**
     * Auto generated setter method
     * @param param DNick
     */
    public void setDNick(java.lang.String param) {
        localDNickTracker = param != null;

        this.localDNick = param;
    }

    public boolean isJStartSpecified() {
        return localJStartTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getJStart() {
        return localJStart;
    }

    /**
     * Auto generated setter method
     * @param param JStart
     */
    public void setJStart(java.util.Calendar param) {
        localJStartTracker = param != null;

        this.localJStart = param;
    }

    public boolean isJStatusSpecified() {
        return localJStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getJStatus() {
        return localJStatus;
    }

    /**
     * Auto generated setter method
     * @param param JStatus
     */
    public void setJStatus(java.lang.String param) {
        localJStatusTracker = param != null;

        this.localJStatus = param;
    }

    public boolean isTTimeSpecified() {
        return localTTimeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getTTime() {
        return localTTime;
    }

    /**
     * Auto generated setter method
     * @param param TTime
     */
    public void setTTime(java.util.Calendar param) {
        localTTimeTracker = param != null;

        this.localTTime = param;
    }

    public boolean isVNameSpecified() {
        return localVNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVName() {
        return localVName;
    }

    /**
     * Auto generated setter method
     * @param param VName
     */
    public void setVName(java.lang.String param) {
        localVNameTracker = param != null;

        this.localVName = param;
    }


}
