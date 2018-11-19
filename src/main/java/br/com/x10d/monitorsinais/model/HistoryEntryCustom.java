package br.com.x10d.monitorsinais.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings({"unchecked", "unused"})
@Entity(name="historyEntry")
public class HistoryEntryCustom {
   
	@Id
	@GeneratedValue
	private Long id;

    protected java.lang.String localAddr;
    protected boolean localAddrTracker = false;
    protected java.lang.String localCargoId;
    protected boolean localCargoIdTracker = false;
    protected java.lang.String localCarrier;
    protected boolean localCarrierTracker = false;
    protected java.lang.String localCity;
    protected boolean localCityTracker = false;
    protected java.lang.String localCourse;
    protected boolean localCourseTracker = false;
    protected java.lang.String localDriver;
    protected boolean localDriverTracker = false;
    protected java.lang.String localGps;
    protected boolean localGpsTracker = false;
    protected java.lang.String localIgn;
    protected boolean localIgnTracker = false;
    protected java.lang.String localInfo;
    protected boolean localInfoTracker = false;
    protected int localInterval;
    protected boolean localIntervalTracker = false;
    protected double localLat;
    protected boolean localLatTracker = false;
    protected double localLng;
    protected boolean localLngTracker = false;
    protected java.lang.String localMcName;
    protected boolean localMcNameTracker = false;
    protected long localMcNum;
    protected boolean localMcNumTracker = false;
    protected double localOdo;
    protected boolean localOdoTracker = false;
    protected java.lang.String localOwner;
    protected boolean localOwnerTracker = false;
    protected java.lang.String localPlate;
    protected boolean localPlateTracker = false;
    protected java.lang.String localPwrSrc;
    protected boolean localPwrSrcTracker = false;
    protected java.lang.String localRef;
    protected boolean localRefTracker = false;
    protected double localRefDist;
    protected boolean localRefDistTracker = false;
    protected long localSeqId;
    protected java.lang.String localSerial;
    protected boolean localSerialTracker = false;
    protected int localSpeed;
    protected boolean localSpeedTracker = false;
    protected java.lang.String localSt;
    protected boolean localStTracker = false;
    protected double localTemperature1;
    protected boolean localTemperature1Tracker = false;
    protected double localTemperature2;
    protected boolean localTemperature2Tracker = false;
    protected double localTemperature3;
    protected boolean localTemperature3Tracker = false;
    protected double localTemperature4;
    protected boolean localTemperature4Tracker = false;
    protected double localTemperature5;
    protected boolean localTemperature5Tracker = false;
    protected java.lang.String localEType;
    protected boolean localETypeTracker = false;
    protected java.util.Calendar localPTime;
    protected boolean localPTimeTracker = false;
    protected java.lang.String localRCode;
    protected boolean localRCodeTracker = false;
    protected java.lang.String localRType;
    protected boolean localRTypeTracker = false;
    protected java.util.Calendar localSTime;
    protected boolean localSTimeTracker = false;
    protected double localTBat;
    protected boolean localTBatTracker = false;
    protected java.lang.String localTBatCg;
    protected boolean localTBatCgTracker = false;
    protected long localTBatPc;
    protected boolean localTBatPcTracker = false;
    protected java.lang.String localTStatus;
    protected boolean localTStatusTracker = false;
    protected java.lang.String localTStatusDesc;
    protected boolean localTStatusDescTracker = false;
    protected java.util.Calendar localTTime;
    protected boolean localTTimeTracker = false;
    protected int localTType;
    protected boolean localTTypeTracker = false;
    protected double localVBat;
    protected boolean localVBatTracker = false;
    protected java.lang.String localVName;
    protected boolean localVNameTracker = false;
    protected java.lang.String localVType;
    protected boolean localVTypeTracker = false;
    
    
    public boolean isAddrSpecified() {
        return localAddrTracker;
    }

  
    public java.lang.String getAddr() {
        return localAddr;
    }

   
    public void setAddr(java.lang.String param) {
        localAddrTracker = param != null;

        this.localAddr = param;
    }

    public boolean isCargoIdSpecified() {
        return localCargoIdTracker;
    }

   
    public java.lang.String getCargoId() {
        return localCargoId;
    }

   
    public void setCargoId(java.lang.String param) {
        localCargoIdTracker = param != null;

        this.localCargoId = param;
    }

    public boolean isCarrierSpecified() {
        return localCarrierTracker;
    }

  
    public java.lang.String getCarrier() {
        return localCarrier;
    }

    
    public void setCarrier(java.lang.String param) {
        localCarrierTracker = param != null;

        this.localCarrier = param;
    }

    public boolean isCitySpecified() {
        return localCityTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCity() {
        return localCity;
    }

    /**
     * Auto generated setter method
     * @param param City
     */
    public void setCity(java.lang.String param) {
        localCityTracker = param != null;

        this.localCity = param;
    }

    public boolean isCourseSpecified() {
        return localCourseTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCourse() {
        return localCourse;
    }

    /**
     * Auto generated setter method
     * @param param Course
     */
    public void setCourse(java.lang.String param) {
        localCourseTracker = param != null;

        this.localCourse = param;
    }

    public boolean isDriverSpecified() {
        return localDriverTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDriver() {
        return localDriver;
    }

    /**
     * Auto generated setter method
     * @param param Driver
     */
    public void setDriver(java.lang.String param) {
        localDriverTracker = param != null;

        this.localDriver = param;
    }

    public boolean isGpsSpecified() {
        return localGpsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getGps() {
        return localGps;
    }

    /**
     * Auto generated setter method
     * @param param Gps
     */
    public void setGps(java.lang.String param) {
        localGpsTracker = param != null;

        this.localGps = param;
    }

    public boolean isIgnSpecified() {
        return localIgnTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIgn() {
        return localIgn;
    }

    /**
     * Auto generated setter method
     * @param param Ign
     */
    public void setIgn(java.lang.String param) {
        localIgnTracker = param != null;

        this.localIgn = param;
    }

    public boolean isInfoSpecified() {
        return localInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getInfo() {
        return localInfo;
    }

    /**
     * Auto generated setter method
     * @param param Info
     */
    public void setInfo(java.lang.String param) {
        localInfoTracker = param != null;

        this.localInfo = param;
    }

    public boolean isIntervalSpecified() {
        return localIntervalTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getInterval() {
        return localInterval;
    }

    /**
     * Auto generated setter method
     * @param param Interval
     */
    public void setInterval(int param) {
        // setting primitive attribute tracker to true
        localIntervalTracker = param != java.lang.Integer.MIN_VALUE;

        this.localInterval = param;
    }

    public boolean isLatSpecified() {
        return localLatTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getLat() {
        return localLat;
    }

    /**
     * Auto generated setter method
     * @param param Lat
     */
    public void setLat(double param) {
        // setting primitive attribute tracker to true
        localLatTracker = !java.lang.Double.isNaN(param);

        this.localLat = param;
    }

    public boolean isLngSpecified() {
        return localLngTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getLng() {
        return localLng;
    }

    /**
     * Auto generated setter method
     * @param param Lng
     */
    public void setLng(double param) {
        // setting primitive attribute tracker to true
        localLngTracker = !java.lang.Double.isNaN(param);

        this.localLng = param;
    }

    public boolean isMcNameSpecified() {
        return localMcNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMcName() {
        return localMcName;
    }

    /**
     * Auto generated setter method
     * @param param McName
     */
    public void setMcName(java.lang.String param) {
        localMcNameTracker = param != null;

        this.localMcName = param;
    }

    public boolean isMcNumSpecified() {
        return localMcNumTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getMcNum() {
        return localMcNum;
    }

    /**
     * Auto generated setter method
     * @param param McNum
     */
    public void setMcNum(long param) {
        // setting primitive attribute tracker to true
        localMcNumTracker = param != java.lang.Long.MIN_VALUE;

        this.localMcNum = param;
    }

    public boolean isOdoSpecified() {
        return localOdoTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getOdo() {
        return localOdo;
    }

    /**
     * Auto generated setter method
     * @param param Odo
     */
    public void setOdo(double param) {
        // setting primitive attribute tracker to true
        localOdoTracker = !java.lang.Double.isNaN(param);

        this.localOdo = param;
    }

    public boolean isOwnerSpecified() {
        return localOwnerTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOwner() {
        return localOwner;
    }

    /**
     * Auto generated setter method
     * @param param Owner
     */
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

    public boolean isPwrSrcSpecified() {
        return localPwrSrcTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPwrSrc() {
        return localPwrSrc;
    }

    /**
     * Auto generated setter method
     * @param param PwrSrc
     */
    public void setPwrSrc(java.lang.String param) {
        localPwrSrcTracker = param != null;

        this.localPwrSrc = param;
    }

    public boolean isRefSpecified() {
        return localRefTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRef() {
        return localRef;
    }

    /**
     * Auto generated setter method
     * @param param Ref
     */
    public void setRef(java.lang.String param) {
        localRefTracker = param != null;

        this.localRef = param;
    }

    public boolean isRefDistSpecified() {
        return localRefDistTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getRefDist() {
        return localRefDist;
    }

    /**
     * Auto generated setter method
     * @param param RefDist
     */
    public void setRefDist(double param) {
        // setting primitive attribute tracker to true
        localRefDistTracker = !java.lang.Double.isNaN(param);

        this.localRefDist = param;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getSeqId() {
        return localSeqId;
    }

    /**
     * Auto generated setter method
     * @param param SeqId
     */
    public void setSeqId(long param) {
        this.localSeqId = param;
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

    public boolean isSpeedSpecified() {
        return localSpeedTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getSpeed() {
        return localSpeed;
    }

    /**
     * Auto generated setter method
     * @param param Speed
     */
    public void setSpeed(int param) {
        // setting primitive attribute tracker to true
        localSpeedTracker = param != java.lang.Integer.MIN_VALUE;

        this.localSpeed = param;
    }

    public boolean isStSpecified() {
        return localStTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSt() {
        return localSt;
    }

    /**
     * Auto generated setter method
     * @param param St
     */
    public void setSt(java.lang.String param) {
        localStTracker = param != null;

        this.localSt = param;
    }

    public boolean isTemperature1Specified() {
        return localTemperature1Tracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getTemperature1() {
        return localTemperature1;
    }

    /**
     * Auto generated setter method
     * @param param Temperature1
     */
    public void setTemperature1(double param) {
        // setting primitive attribute tracker to true
        localTemperature1Tracker = !java.lang.Double.isNaN(param);

        this.localTemperature1 = param;
    }

    public boolean isTemperature2Specified() {
        return localTemperature2Tracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getTemperature2() {
        return localTemperature2;
    }

    /**
     * Auto generated setter method
     * @param param Temperature2
     */
    public void setTemperature2(double param) {
        // setting primitive attribute tracker to true
        localTemperature2Tracker = !java.lang.Double.isNaN(param);

        this.localTemperature2 = param;
    }

    public boolean isTemperature3Specified() {
        return localTemperature3Tracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getTemperature3() {
        return localTemperature3;
    }

    /**
     * Auto generated setter method
     * @param param Temperature3
     */
    public void setTemperature3(double param) {
        // setting primitive attribute tracker to true
        localTemperature3Tracker = !java.lang.Double.isNaN(param);

        this.localTemperature3 = param;
    }

    public boolean isTemperature4Specified() {
        return localTemperature4Tracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getTemperature4() {
        return localTemperature4;
    }

    /**
     * Auto generated setter method
     * @param param Temperature4
     */
    public void setTemperature4(double param) {
        // setting primitive attribute tracker to true
        localTemperature4Tracker = !java.lang.Double.isNaN(param);

        this.localTemperature4 = param;
    }

    public boolean isTemperature5Specified() {
        return localTemperature5Tracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getTemperature5() {
        return localTemperature5;
    }

    /**
     * Auto generated setter method
     * @param param Temperature5
     */
    public void setTemperature5(double param) {
        // setting primitive attribute tracker to true
        localTemperature5Tracker = !java.lang.Double.isNaN(param);

        this.localTemperature5 = param;
    }

    public boolean isETypeSpecified() {
        return localETypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEType() {
        return localEType;
    }

    /**
     * Auto generated setter method
     * @param param EType
     */
    public void setEType(java.lang.String param) {
        localETypeTracker = param != null;

        this.localEType = param;
    }

    public boolean isPTimeSpecified() {
        return localPTimeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getPTime() {
        return localPTime;
    }

    /**
     * Auto generated setter method
     * @param param PTime
     */
    public void setPTime(java.util.Calendar param) {
        localPTimeTracker = param != null;

        this.localPTime = param;
    }

    public boolean isRCodeSpecified() {
        return localRCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRCode() {
        return localRCode;
    }

    /**
     * Auto generated setter method
     * @param param RCode
     */
    public void setRCode(java.lang.String param) {
        localRCodeTracker = param != null;

        this.localRCode = param;
    }

    public boolean isRTypeSpecified() {
        return localRTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRType() {
        return localRType;
    }

    /**
     * Auto generated setter method
     * @param param RType
     */
    public void setRType(java.lang.String param) {
        localRTypeTracker = param != null;

        this.localRType = param;
    }

    public boolean isSTimeSpecified() {
        return localSTimeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getSTime() {
        return localSTime;
    }

    /**
     * Auto generated setter method
     * @param param STime
     */
    public void setSTime(java.util.Calendar param) {
        localSTimeTracker = param != null;

        this.localSTime = param;
    }

    public boolean isTBatSpecified() {
        return localTBatTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getTBat() {
        return localTBat;
    }

    /**
     * Auto generated setter method
     * @param param TBat
     */
    public void setTBat(double param) {
        // setting primitive attribute tracker to true
        localTBatTracker = !java.lang.Double.isNaN(param);

        this.localTBat = param;
    }

    public boolean isTBatCgSpecified() {
        return localTBatCgTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTBatCg() {
        return localTBatCg;
    }

    /**
     * Auto generated setter method
     * @param param TBatCg
     */
    public void setTBatCg(java.lang.String param) {
        localTBatCgTracker = param != null;

        this.localTBatCg = param;
    }

    public boolean isTBatPcSpecified() {
        return localTBatPcTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getTBatPc() {
        return localTBatPc;
    }

    /**
     * Auto generated setter method
     * @param param TBatPc
     */
    public void setTBatPc(long param) {
        // setting primitive attribute tracker to true
        localTBatPcTracker = param != java.lang.Long.MIN_VALUE;

        this.localTBatPc = param;
    }

    public boolean isTStatusSpecified() {
        return localTStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTStatus() {
        return localTStatus;
    }

    /**
     * Auto generated setter method
     * @param param TStatus
     */
    public void setTStatus(java.lang.String param) {
        localTStatusTracker = param != null;

        this.localTStatus = param;
    }

    public boolean isTStatusDescSpecified() {
        return localTStatusDescTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTStatusDesc() {
        return localTStatusDesc;
    }

    /**
     * Auto generated setter method
     * @param param TStatusDesc
     */
    public void setTStatusDesc(java.lang.String param) {
        localTStatusDescTracker = param != null;

        this.localTStatusDesc = param;
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

    public boolean isTTypeSpecified() {
        return localTTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTType() {
        return localTType;
    }

    /**
     * Auto generated setter method
     * @param param TType
     */
    public void setTType(int param) {
        // setting primitive attribute tracker to true
        localTTypeTracker = param != java.lang.Integer.MIN_VALUE;

        this.localTType = param;
    }

    public boolean isVBatSpecified() {
        return localVBatTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getVBat() {
        return localVBat;
    }

    /**
     * Auto generated setter method
     * @param param VBat
     */
    public void setVBat(double param) {
        // setting primitive attribute tracker to true
        localVBatTracker = !java.lang.Double.isNaN(param);

        this.localVBat = param;
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

    public boolean isVTypeSpecified() {
        return localVTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVType() {
        return localVType;
    }

    /**
     * Auto generated setter method
     * @param param VType
     */
    public void setVType(java.lang.String param) {
        localVTypeTracker = param != null;

        this.localVType = param;
    }


}
