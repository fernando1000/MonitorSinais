package br.com.x10d.monitorsinais.omni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings({"unchecked", "unused"})
public class Vehicle implements org.apache.axis2.databinding.ADBBean {
	

    protected java.lang.String localAddr;
    protected boolean localAddrTracker = false;
    protected java.lang.String localBluetoothAddress;
    protected boolean localBluetoothAddressTracker = false;
    protected java.lang.String localCargoId;
    protected boolean localCargoIdTracker = false;
    protected java.lang.String localCity;
    protected boolean localCityTracker = false;
    protected java.lang.String localCourse;
    protected boolean localCourseTracker = false;
    protected java.lang.String localDriver;
    protected boolean localDriverTracker = false;
    protected int localDriverMgmt;
    protected boolean localDriverMgmtTracker = false;
    protected java.lang.String localFleet;
    protected boolean localFleetTracker = false;
    protected java.lang.String localIgn;
    protected boolean localIgnTracker = false;
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
    protected java.lang.String localModel;
    protected boolean localModelTracker = false;
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
    protected java.lang.String localSatFail;
    protected boolean localSatFailTracker = false;
    protected java.lang.String localSerial;
    protected boolean localSerialTracker = false;
    protected java.lang.String localSerialSat;
    protected boolean localSerialSatTracker = false;
    protected java.lang.String localSigLoss;
    protected boolean localSigLossTracker = false;
    protected int localSpeed;
    protected boolean localSpeedTracker = false;
    protected java.lang.String localSt;
    protected boolean localStTracker = false;
    protected java.lang.String localSwVer;
    protected boolean localSwVerTracker = false;
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
    protected java.lang.String localCPlan;
    protected boolean localCPlanTracker = false;
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
    protected double localVBat;
    protected boolean localVBatTracker = false;
    protected java.lang.String localVName;
    protected boolean localVNameTracker = false;
    protected java.lang.String localVPlan;
    protected boolean localVPlanTracker = false;
    protected java.lang.String localVType;
    protected boolean localVTypeTracker = false;

    public boolean isAddrSpecified() {
        return localAddrTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAddr() {
        return localAddr;
    }

    /**
     * Auto generated setter method
     * @param param Addr
     */
    public void setAddr(java.lang.String param) {
        localAddrTracker = param != null;

        this.localAddr = param;
    }

    public boolean isBluetoothAddressSpecified() {
        return localBluetoothAddressTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBluetoothAddress() {
        return localBluetoothAddress;
    }

    /**
     * Auto generated setter method
     * @param param BluetoothAddress
     */
    public void setBluetoothAddress(java.lang.String param) {
        localBluetoothAddressTracker = param != null;

        this.localBluetoothAddress = param;
    }

    public boolean isCargoIdSpecified() {
        return localCargoIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCargoId() {
        return localCargoId;
    }

    /**
     * Auto generated setter method
     * @param param CargoId
     */
    public void setCargoId(java.lang.String param) {
        localCargoIdTracker = param != null;

        this.localCargoId = param;
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

    public boolean isDriverMgmtSpecified() {
        return localDriverMgmtTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getDriverMgmt() {
        return localDriverMgmt;
    }

    /**
     * Auto generated setter method
     * @param param DriverMgmt
     */
    public void setDriverMgmt(int param) {
        // setting primitive attribute tracker to true
        localDriverMgmtTracker = param != java.lang.Integer.MIN_VALUE;

        this.localDriverMgmt = param;
    }

    public boolean isFleetSpecified() {
        return localFleetTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFleet() {
        return localFleet;
    }

    /**
     * Auto generated setter method
     * @param param Fleet
     */
    public void setFleet(java.lang.String param) {
        localFleetTracker = param != null;

        this.localFleet = param;
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

    public boolean isModelSpecified() {
        return localModelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getModel() {
        return localModel;
    }

    /**
     * Auto generated setter method
     * @param param Model
     */
    public void setModel(java.lang.String param) {
        localModelTracker = param != null;

        this.localModel = param;
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

    public boolean isSatFailSpecified() {
        return localSatFailTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSatFail() {
        return localSatFail;
    }

    /**
     * Auto generated setter method
     * @param param SatFail
     */
    public void setSatFail(java.lang.String param) {
        localSatFailTracker = param != null;

        this.localSatFail = param;
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

    public boolean isSerialSatSpecified() {
        return localSerialSatTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSerialSat() {
        return localSerialSat;
    }

    /**
     * Auto generated setter method
     * @param param SerialSat
     */
    public void setSerialSat(java.lang.String param) {
        localSerialSatTracker = param != null;

        this.localSerialSat = param;
    }

    public boolean isSigLossSpecified() {
        return localSigLossTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSigLoss() {
        return localSigLoss;
    }

    /**
     * Auto generated setter method
     * @param param SigLoss
     */
    public void setSigLoss(java.lang.String param) {
        localSigLossTracker = param != null;

        this.localSigLoss = param;
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

    public boolean isSwVerSpecified() {
        return localSwVerTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSwVer() {
        return localSwVer;
    }

    /**
     * Auto generated setter method
     * @param param SwVer
     */
    public void setSwVer(java.lang.String param) {
        localSwVerTracker = param != null;

        this.localSwVer = param;
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

    public boolean isCPlanSpecified() {
        return localCPlanTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCPlan() {
        return localCPlan;
    }

    /**
     * Auto generated setter method
     * @param param CPlan
     */
    public void setCPlan(java.lang.String param) {
        localCPlanTracker = param != null;

        this.localCPlan = param;
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

    public boolean isVPlanSpecified() {
        return localVPlanTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVPlan() {
        return localVPlan;
    }

    /**
     * Auto generated setter method
     * @param param VPlan
     */
    public void setVPlan(java.lang.String param) {
        localVPlanTracker = param != null;

        this.localVPlan = param;
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

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://linkerapi.portalorion.zatix.com.br/");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":vehicle", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "vehicle", xmlWriter);
            }
        }

        if (localAddrTracker) {
            namespace = "";
            writeStartElement(null, namespace, "addr", xmlWriter);

            if (localAddr == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "addr cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAddr);
            }

            xmlWriter.writeEndElement();
        }

        if (localBluetoothAddressTracker) {
            namespace = "";
            writeStartElement(null, namespace, "bluetoothAddress", xmlWriter);

            if (localBluetoothAddress == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "bluetoothAddress cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBluetoothAddress);
            }

            xmlWriter.writeEndElement();
        }

        if (localCargoIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "cargoId", xmlWriter);

            if (localCargoId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "cargoId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCargoId);
            }

            xmlWriter.writeEndElement();
        }

        if (localCityTracker) {
            namespace = "";
            writeStartElement(null, namespace, "city", xmlWriter);

            if (localCity == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "city cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCity);
            }

            xmlWriter.writeEndElement();
        }

        if (localCourseTracker) {
            namespace = "";
            writeStartElement(null, namespace, "course", xmlWriter);

            if (localCourse == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "course cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCourse);
            }

            xmlWriter.writeEndElement();
        }

        if (localDriverTracker) {
            namespace = "";
            writeStartElement(null, namespace, "driver", xmlWriter);

            if (localDriver == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "driver cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDriver);
            }

            xmlWriter.writeEndElement();
        }

        if (localDriverMgmtTracker) {
            namespace = "";
            writeStartElement(null, namespace, "driverMgmt", xmlWriter);

            if (localDriverMgmt == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "driverMgmt cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDriverMgmt));
            }

            xmlWriter.writeEndElement();
        }

        if (localFleetTracker) {
            namespace = "";
            writeStartElement(null, namespace, "fleet", xmlWriter);

            if (localFleet == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "fleet cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFleet);
            }

            xmlWriter.writeEndElement();
        }

        if (localIgnTracker) {
            namespace = "";
            writeStartElement(null, namespace, "ign", xmlWriter);

            if (localIgn == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ign cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localIgn);
            }

            xmlWriter.writeEndElement();
        }

        if (localIntervalTracker) {
            namespace = "";
            writeStartElement(null, namespace, "interval", xmlWriter);

            if (localInterval == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "interval cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localInterval));
            }

            xmlWriter.writeEndElement();
        }

        if (localLatTracker) {
            namespace = "";
            writeStartElement(null, namespace, "lat", xmlWriter);

            if (java.lang.Double.isNaN(localLat)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "lat cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLat));
            }

            xmlWriter.writeEndElement();
        }

        if (localLngTracker) {
            namespace = "";
            writeStartElement(null, namespace, "lng", xmlWriter);

            if (java.lang.Double.isNaN(localLng)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "lng cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLng));
            }

            xmlWriter.writeEndElement();
        }

        if (localMcNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mcName", xmlWriter);

            if (localMcName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "mcName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMcName);
            }

            xmlWriter.writeEndElement();
        }

        if (localMcNumTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mcNum", xmlWriter);

            if (localMcNum == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "mcNum cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMcNum));
            }

            xmlWriter.writeEndElement();
        }

        if (localModelTracker) {
            namespace = "";
            writeStartElement(null, namespace, "model", xmlWriter);

            if (localModel == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "model cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localModel);
            }

            xmlWriter.writeEndElement();
        }

        if (localOdoTracker) {
            namespace = "";
            writeStartElement(null, namespace, "odo", xmlWriter);

            if (java.lang.Double.isNaN(localOdo)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "odo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localOdo));
            }

            xmlWriter.writeEndElement();
        }

        if (localOwnerTracker) {
            namespace = "";
            writeStartElement(null, namespace, "owner", xmlWriter);

            if (localOwner == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "owner cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOwner);
            }

            xmlWriter.writeEndElement();
        }

        if (localPlateTracker) {
            namespace = "";
            writeStartElement(null, namespace, "plate", xmlWriter);

            if (localPlate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "plate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPlate);
            }

            xmlWriter.writeEndElement();
        }

        if (localPwrSrcTracker) {
            namespace = "";
            writeStartElement(null, namespace, "pwrSrc", xmlWriter);

            if (localPwrSrc == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "pwrSrc cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPwrSrc);
            }

            xmlWriter.writeEndElement();
        }

        if (localRefTracker) {
            namespace = "";
            writeStartElement(null, namespace, "ref", xmlWriter);

            if (localRef == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ref cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRef);
            }

            xmlWriter.writeEndElement();
        }

        if (localRefDistTracker) {
            namespace = "";
            writeStartElement(null, namespace, "refDist", xmlWriter);

            if (java.lang.Double.isNaN(localRefDist)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "refDist cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRefDist));
            }

            xmlWriter.writeEndElement();
        }

        if (localSatFailTracker) {
            namespace = "";
            writeStartElement(null, namespace, "satFail", xmlWriter);

            if (localSatFail == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "satFail cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSatFail);
            }

            xmlWriter.writeEndElement();
        }

        if (localSerialTracker) {
            namespace = "";
            writeStartElement(null, namespace, "serial", xmlWriter);

            if (localSerial == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "serial cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSerial);
            }

            xmlWriter.writeEndElement();
        }

        if (localSerialSatTracker) {
            namespace = "";
            writeStartElement(null, namespace, "serialSat", xmlWriter);

            if (localSerialSat == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "serialSat cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSerialSat);
            }

            xmlWriter.writeEndElement();
        }

        if (localSigLossTracker) {
            namespace = "";
            writeStartElement(null, namespace, "sigLoss", xmlWriter);

            if (localSigLoss == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sigLoss cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSigLoss);
            }

            xmlWriter.writeEndElement();
        }

        if (localSpeedTracker) {
            namespace = "";
            writeStartElement(null, namespace, "speed", xmlWriter);

            if (localSpeed == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "speed cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSpeed));
            }

            xmlWriter.writeEndElement();
        }

        if (localStTracker) {
            namespace = "";
            writeStartElement(null, namespace, "st", xmlWriter);

            if (localSt == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "st cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSt);
            }

            xmlWriter.writeEndElement();
        }

        if (localSwVerTracker) {
            namespace = "";
            writeStartElement(null, namespace, "swVer", xmlWriter);

            if (localSwVer == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "swVer cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSwVer);
            }

            xmlWriter.writeEndElement();
        }

        if (localTemperature1Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "temperature1", xmlWriter);

            if (java.lang.Double.isNaN(localTemperature1)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "temperature1 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTemperature1));
            }

            xmlWriter.writeEndElement();
        }

        if (localTemperature2Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "temperature2", xmlWriter);

            if (java.lang.Double.isNaN(localTemperature2)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "temperature2 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTemperature2));
            }

            xmlWriter.writeEndElement();
        }

        if (localTemperature3Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "temperature3", xmlWriter);

            if (java.lang.Double.isNaN(localTemperature3)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "temperature3 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTemperature3));
            }

            xmlWriter.writeEndElement();
        }

        if (localTemperature4Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "temperature4", xmlWriter);

            if (java.lang.Double.isNaN(localTemperature4)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "temperature4 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTemperature4));
            }

            xmlWriter.writeEndElement();
        }

        if (localTemperature5Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "temperature5", xmlWriter);

            if (java.lang.Double.isNaN(localTemperature5)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "temperature5 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTemperature5));
            }

            xmlWriter.writeEndElement();
        }

        if (localCPlanTracker) {
            namespace = "";
            writeStartElement(null, namespace, "cPlan", xmlWriter);

            if (localCPlan == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "cPlan cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCPlan);
            }

            xmlWriter.writeEndElement();
        }

        if (localSTimeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "sTime", xmlWriter);

            if (localSTime == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "sTime cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSTime));
            }

            xmlWriter.writeEndElement();
        }

        if (localTBatTracker) {
            namespace = "";
            writeStartElement(null, namespace, "tBat", xmlWriter);

            if (java.lang.Double.isNaN(localTBat)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "tBat cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTBat));
            }

            xmlWriter.writeEndElement();
        }

        if (localTBatCgTracker) {
            namespace = "";
            writeStartElement(null, namespace, "tBatCg", xmlWriter);

            if (localTBatCg == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "tBatCg cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTBatCg);
            }

            xmlWriter.writeEndElement();
        }

        if (localTBatPcTracker) {
            namespace = "";
            writeStartElement(null, namespace, "tBatPc", xmlWriter);

            if (localTBatPc == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "tBatPc cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTBatPc));
            }

            xmlWriter.writeEndElement();
        }

        if (localTStatusTracker) {
            namespace = "";
            writeStartElement(null, namespace, "tStatus", xmlWriter);

            if (localTStatus == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "tStatus cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTStatus);
            }

            xmlWriter.writeEndElement();
        }

        if (localTStatusDescTracker) {
            namespace = "";
            writeStartElement(null, namespace, "tStatusDesc", xmlWriter);

            if (localTStatusDesc == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "tStatusDesc cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTStatusDesc);
            }

            xmlWriter.writeEndElement();
        }

        if (localTTimeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "tTime", xmlWriter);

            if (localTTime == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "tTime cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTTime));
            }

            xmlWriter.writeEndElement();
        }

        if (localVBatTracker) {
            namespace = "";
            writeStartElement(null, namespace, "vBat", xmlWriter);

            if (java.lang.Double.isNaN(localVBat)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "vBat cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localVBat));
            }

            xmlWriter.writeEndElement();
        }

        if (localVNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "vName", xmlWriter);

            if (localVName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "vName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVName);
            }

            xmlWriter.writeEndElement();
        }

        if (localVPlanTracker) {
            namespace = "";
            writeStartElement(null, namespace, "vPlan", xmlWriter);

            if (localVPlan == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "vPlan cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVPlan);
            }

            xmlWriter.writeEndElement();
        }

        if (localVTypeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "vType", xmlWriter);

            if (localVType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "vType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVType);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://linkerapi.portalorion.zatix.com.br/")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static Vehicle parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Vehicle object = new Vehicle();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"vehicle".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Vehicle) br.com.x10d.monitorsinais.omni.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "addr").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "addr" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAddr(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "bluetoothAddress").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "bluetoothAddress" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBluetoothAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cargoId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "cargoId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCargoId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "city").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "city" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCity(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "course").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "course" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCourse(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "driver").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "driver" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDriver(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "driverMgmt").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "driverMgmt" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDriverMgmt(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setDriverMgmt(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "fleet").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "fleet" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFleet(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ign").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ign" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIgn(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "interval").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "interval" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInterval(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setInterval(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "lat").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "lat" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLat(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setLat(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "lng").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "lng" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLng(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setLng(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mcName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mcName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMcName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mcNum").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mcNum" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMcNum(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setMcNum(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "model").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "model" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setModel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "odo").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "odo" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOdo(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setOdo(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "owner").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "owner" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOwner(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "plate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "plate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPlate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "pwrSrc").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "pwrSrc" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPwrSrc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "ref").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ref" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRef(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "refDist").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "refDist" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRefDist(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setRefDist(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "satFail").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "satFail" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSatFail(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "serial").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "serial" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSerial(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "serialSat").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "serialSat" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSerialSat(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "sigLoss").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "sigLoss" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSigLoss(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "speed").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "speed" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSpeed(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setSpeed(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "st").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "st" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSt(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "swVer").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "swVer" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSwVer(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "temperature1").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "temperature1" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTemperature1(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTemperature1(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "temperature2").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "temperature2" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTemperature2(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTemperature2(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "temperature3").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "temperature3" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTemperature3(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTemperature3(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "temperature4").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "temperature4" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTemperature4(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTemperature4(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "temperature5").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "temperature5" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTemperature5(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTemperature5(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "cPlan").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "cPlan" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCPlan(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "sTime").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "sTime" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tBat").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "tBat" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTBat(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTBat(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tBatCg").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "tBatCg" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTBatCg(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tBatPc").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "tBatPc" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTBatPc(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setTBatPc(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tStatus").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "tStatus" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tStatusDesc").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "tStatusDesc" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTStatusDesc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "tTime").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "tTime" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTTime(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "vBat").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "vBat" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVBat(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setVBat(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "vName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "vName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "vPlan").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "vPlan" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVPlan(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "vType").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "vType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
