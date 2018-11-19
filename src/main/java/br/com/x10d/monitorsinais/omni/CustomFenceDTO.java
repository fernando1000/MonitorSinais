package br.com.x10d.monitorsinais.omni;

@SuppressWarnings({"unchecked", "unused"})
public class CustomFenceDTO implements org.apache.axis2.databinding.ADBBean {
   
    protected long localId;
    protected boolean localIdTracker = false;
    protected java.lang.String localName;
    protected boolean localNameTracker = false;
    protected java.lang.String localShape;
    protected boolean localShapeTracker = false;
    protected java.lang.String localGroup;
    protected boolean localGroupTracker = false;
    protected java.lang.String localColor;
    protected boolean localColorTracker = false;
    protected java.lang.String localFenceType;
    protected boolean localFenceTypeTracker = false;
    protected boolean localFenceVolatile;
    protected boolean localFenceVolatileTracker = false;
    protected long localMacroGroupId;
    protected boolean localMacroGroupIdTracker = false;
    protected long localMacroEntryId;
    protected boolean localMacroEntryIdTracker = false;
    protected long localMacroExitId;
    protected boolean localMacroExitIdTracker = false;
    protected double localLatitudeCenter;
    protected boolean localLatitudeCenterTracker = false;
    protected double localLongitudeCenter;
    protected boolean localLongitudeCenterTracker = false;
    protected double localRadius;
    protected boolean localRadiusTracker = false;
    protected java.lang.String localEntryEventType;
    protected boolean localEntryEventTypeTracker = false;
    protected java.lang.String localExitEventType;
    protected boolean localExitEventTypeTracker = false;
    protected java.lang.String localPassageEventType;
    protected boolean localPassageEventTypeTracker = false;
    protected java.lang.String localCommandEntry;
    protected boolean localCommandEntryTracker = false;
    protected java.lang.String localCommandExit;
    protected boolean localCommandExitTracker = false;
    protected java.lang.String localCommandThru;
    protected boolean localCommandThruTracker = false;
    protected java.lang.String localEventTrigger1;
    protected boolean localEventTrigger1Tracker = false;
    protected java.lang.String localCommandSend1;
    protected boolean localCommandSend1Tracker = false;
    protected java.lang.String localEventTrigger2;
    protected boolean localEventTrigger2Tracker = false;
    protected java.lang.String localCommandSend2;
    protected boolean localCommandSend2Tracker = false;
    protected java.lang.String localEventTrigger3;
    protected boolean localEventTrigger3Tracker = false;
    protected java.lang.String localCommandSend3;
    protected boolean localCommandSend3Tracker = false;
    protected long localPriority;
    protected boolean localPriorityTracker = false;
    protected long localSize;
    protected boolean localSizeTracker = false;
    protected boolean localFenceEmbeded;
    protected boolean localFenceEmbededTracker = false;
    protected br.com.x10d.monitorsinais.omni.Points_type0 localPoints;
    protected boolean localPointsTracker = false;
    protected br.com.x10d.monitorsinais.omni.MacrosDenied_type0 localMacrosDenied;
    protected boolean localMacrosDeniedTracker = false;

    public boolean isIdSpecified() {
        return localIdTracker;
    }

    public long getId() {
        return localId;
    }

    public void setId(long param) {
        // setting primitive attribute tracker to true
        localIdTracker = param != java.lang.Long.MIN_VALUE;

        this.localId = param;
    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;
    }

    public boolean isShapeSpecified() {
        return localShapeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getShape() {
        return localShape;
    }

    /**
     * Auto generated setter method
     * @param param Shape
     */
    public void setShape(java.lang.String param) {
        localShapeTracker = param != null;

        this.localShape = param;
    }

    public boolean isGroupSpecified() {
        return localGroupTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getGroup() {
        return localGroup;
    }

    /**
     * Auto generated setter method
     * @param param Group
     */
    public void setGroup(java.lang.String param) {
        localGroupTracker = param != null;

        this.localGroup = param;
    }

    public boolean isColorSpecified() {
        return localColorTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getColor() {
        return localColor;
    }

    /**
     * Auto generated setter method
     * @param param Color
     */
    public void setColor(java.lang.String param) {
        localColorTracker = param != null;

        this.localColor = param;
    }

    public boolean isFenceTypeSpecified() {
        return localFenceTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFenceType() {
        return localFenceType;
    }

    /**
     * Auto generated setter method
     * @param param FenceType
     */
    public void setFenceType(java.lang.String param) {
        localFenceTypeTracker = param != null;

        this.localFenceType = param;
    }

    public boolean isFenceVolatileSpecified() {
        return localFenceVolatileTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getFenceVolatile() {
        return localFenceVolatile;
    }

    /**
     * Auto generated setter method
     * @param param FenceVolatile
     */
    public void setFenceVolatile(boolean param) {
        // setting primitive attribute tracker to true
        localFenceVolatileTracker = true;

        this.localFenceVolatile = param;
    }

    public boolean isMacroGroupIdSpecified() {
        return localMacroGroupIdTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getMacroGroupId() {
        return localMacroGroupId;
    }

    /**
     * Auto generated setter method
     * @param param MacroGroupId
     */
    public void setMacroGroupId(long param) {
        // setting primitive attribute tracker to true
        localMacroGroupIdTracker = param != java.lang.Long.MIN_VALUE;

        this.localMacroGroupId = param;
    }

    public boolean isMacroEntryIdSpecified() {
        return localMacroEntryIdTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getMacroEntryId() {
        return localMacroEntryId;
    }

    /**
     * Auto generated setter method
     * @param param MacroEntryId
     */
    public void setMacroEntryId(long param) {
        // setting primitive attribute tracker to true
        localMacroEntryIdTracker = param != java.lang.Long.MIN_VALUE;

        this.localMacroEntryId = param;
    }

    public boolean isMacroExitIdSpecified() {
        return localMacroExitIdTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getMacroExitId() {
        return localMacroExitId;
    }

    /**
     * Auto generated setter method
     * @param param MacroExitId
     */
    public void setMacroExitId(long param) {
        // setting primitive attribute tracker to true
        localMacroExitIdTracker = param != java.lang.Long.MIN_VALUE;

        this.localMacroExitId = param;
    }

    public boolean isLatitudeCenterSpecified() {
        return localLatitudeCenterTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getLatitudeCenter() {
        return localLatitudeCenter;
    }

    /**
     * Auto generated setter method
     * @param param LatitudeCenter
     */
    public void setLatitudeCenter(double param) {
        // setting primitive attribute tracker to true
        localLatitudeCenterTracker = !java.lang.Double.isNaN(param);

        this.localLatitudeCenter = param;
    }

    public boolean isLongitudeCenterSpecified() {
        return localLongitudeCenterTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getLongitudeCenter() {
        return localLongitudeCenter;
    }

    /**
     * Auto generated setter method
     * @param param LongitudeCenter
     */
    public void setLongitudeCenter(double param) {
        // setting primitive attribute tracker to true
        localLongitudeCenterTracker = !java.lang.Double.isNaN(param);

        this.localLongitudeCenter = param;
    }

    public boolean isRadiusSpecified() {
        return localRadiusTracker;
    }

    /**
     * Auto generated getter method
     * @return double
     */
    public double getRadius() {
        return localRadius;
    }

    /**
     * Auto generated setter method
     * @param param Radius
     */
    public void setRadius(double param) {
        // setting primitive attribute tracker to true
        localRadiusTracker = !java.lang.Double.isNaN(param);

        this.localRadius = param;
    }

    public boolean isEntryEventTypeSpecified() {
        return localEntryEventTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEntryEventType() {
        return localEntryEventType;
    }

    /**
     * Auto generated setter method
     * @param param EntryEventType
     */
    public void setEntryEventType(java.lang.String param) {
        localEntryEventTypeTracker = param != null;

        this.localEntryEventType = param;
    }

    public boolean isExitEventTypeSpecified() {
        return localExitEventTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getExitEventType() {
        return localExitEventType;
    }

    /**
     * Auto generated setter method
     * @param param ExitEventType
     */
    public void setExitEventType(java.lang.String param) {
        localExitEventTypeTracker = param != null;

        this.localExitEventType = param;
    }

    public boolean isPassageEventTypeSpecified() {
        return localPassageEventTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPassageEventType() {
        return localPassageEventType;
    }

    /**
     * Auto generated setter method
     * @param param PassageEventType
     */
    public void setPassageEventType(java.lang.String param) {
        localPassageEventTypeTracker = param != null;

        this.localPassageEventType = param;
    }

    public boolean isCommandEntrySpecified() {
        return localCommandEntryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCommandEntry() {
        return localCommandEntry;
    }

    /**
     * Auto generated setter method
     * @param param CommandEntry
     */
    public void setCommandEntry(java.lang.String param) {
        localCommandEntryTracker = param != null;

        this.localCommandEntry = param;
    }

    public boolean isCommandExitSpecified() {
        return localCommandExitTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCommandExit() {
        return localCommandExit;
    }

    /**
     * Auto generated setter method
     * @param param CommandExit
     */
    public void setCommandExit(java.lang.String param) {
        localCommandExitTracker = param != null;

        this.localCommandExit = param;
    }

    public boolean isCommandThruSpecified() {
        return localCommandThruTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCommandThru() {
        return localCommandThru;
    }

    /**
     * Auto generated setter method
     * @param param CommandThru
     */
    public void setCommandThru(java.lang.String param) {
        localCommandThruTracker = param != null;

        this.localCommandThru = param;
    }

    public boolean isEventTrigger1Specified() {
        return localEventTrigger1Tracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEventTrigger1() {
        return localEventTrigger1;
    }

    /**
     * Auto generated setter method
     * @param param EventTrigger1
     */
    public void setEventTrigger1(java.lang.String param) {
        localEventTrigger1Tracker = param != null;

        this.localEventTrigger1 = param;
    }

    public boolean isCommandSend1Specified() {
        return localCommandSend1Tracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCommandSend1() {
        return localCommandSend1;
    }

    /**
     * Auto generated setter method
     * @param param CommandSend1
     */
    public void setCommandSend1(java.lang.String param) {
        localCommandSend1Tracker = param != null;

        this.localCommandSend1 = param;
    }

    public boolean isEventTrigger2Specified() {
        return localEventTrigger2Tracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEventTrigger2() {
        return localEventTrigger2;
    }

    /**
     * Auto generated setter method
     * @param param EventTrigger2
     */
    public void setEventTrigger2(java.lang.String param) {
        localEventTrigger2Tracker = param != null;

        this.localEventTrigger2 = param;
    }

    public boolean isCommandSend2Specified() {
        return localCommandSend2Tracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCommandSend2() {
        return localCommandSend2;
    }

    /**
     * Auto generated setter method
     * @param param CommandSend2
     */
    public void setCommandSend2(java.lang.String param) {
        localCommandSend2Tracker = param != null;

        this.localCommandSend2 = param;
    }

    public boolean isEventTrigger3Specified() {
        return localEventTrigger3Tracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEventTrigger3() {
        return localEventTrigger3;
    }

    /**
     * Auto generated setter method
     * @param param EventTrigger3
     */
    public void setEventTrigger3(java.lang.String param) {
        localEventTrigger3Tracker = param != null;

        this.localEventTrigger3 = param;
    }

    public boolean isCommandSend3Specified() {
        return localCommandSend3Tracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCommandSend3() {
        return localCommandSend3;
    }

    /**
     * Auto generated setter method
     * @param param CommandSend3
     */
    public void setCommandSend3(java.lang.String param) {
        localCommandSend3Tracker = param != null;

        this.localCommandSend3 = param;
    }

    public boolean isPrioritySpecified() {
        return localPriorityTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getPriority() {
        return localPriority;
    }

    /**
     * Auto generated setter method
     * @param param Priority
     */
    public void setPriority(long param) {
        // setting primitive attribute tracker to true
        localPriorityTracker = param != java.lang.Long.MIN_VALUE;

        this.localPriority = param;
    }

    public boolean isSizeSpecified() {
        return localSizeTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getSize() {
        return localSize;
    }

    /**
     * Auto generated setter method
     * @param param Size
     */
    public void setSize(long param) {
        // setting primitive attribute tracker to true
        localSizeTracker = param != java.lang.Long.MIN_VALUE;

        this.localSize = param;
    }

    public boolean isFenceEmbededSpecified() {
        return localFenceEmbededTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getFenceEmbeded() {
        return localFenceEmbeded;
    }

    /**
     * Auto generated setter method
     * @param param FenceEmbeded
     */
    public void setFenceEmbeded(boolean param) {
        // setting primitive attribute tracker to true
        localFenceEmbededTracker = true;

        this.localFenceEmbeded = param;
    }

    public boolean isPointsSpecified() {
        return localPointsTracker;
    }

    /**
     * Auto generated getter method
     * @return br.com.zatix.portalorion.linkerapi.Points_type0
     */
    public br.com.x10d.monitorsinais.omni.Points_type0 getPoints() {
        return localPoints;
    }

    /**
     * Auto generated setter method
     * @param param Points
     */
    public void setPoints(br.com.x10d.monitorsinais.omni.Points_type0 param) {
        localPointsTracker = param != null;

        this.localPoints = param;
    }

    public boolean isMacrosDeniedSpecified() {
        return localMacrosDeniedTracker;
    }

    /**
     * Auto generated getter method
     * @return br.com.zatix.portalorion.linkerapi.MacrosDenied_type0
     */
    public br.com.x10d.monitorsinais.omni.MacrosDenied_type0 getMacrosDenied() {
        return localMacrosDenied;
    }

    /**
     * Auto generated setter method
     * @param param MacrosDenied
     */
    public void setMacrosDenied(
        br.com.x10d.monitorsinais.omni.MacrosDenied_type0 param) {
        localMacrosDeniedTracker = param != null;

        this.localMacrosDenied = param;
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
                    namespacePrefix + ":customFenceDTO", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "customFenceDTO", xmlWriter);
            }
        }

        if (localIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "id", xmlWriter);

            if (localId == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "id cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localId));
            }

            xmlWriter.writeEndElement();
        }

        if (localNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localShapeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "shape", xmlWriter);

            if (localShape == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "shape cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localShape);
            }

            xmlWriter.writeEndElement();
        }

        if (localGroupTracker) {
            namespace = "";
            writeStartElement(null, namespace, "group", xmlWriter);

            if (localGroup == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "group cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localGroup);
            }

            xmlWriter.writeEndElement();
        }

        if (localColorTracker) {
            namespace = "";
            writeStartElement(null, namespace, "color", xmlWriter);

            if (localColor == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "color cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localColor);
            }

            xmlWriter.writeEndElement();
        }

        if (localFenceTypeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "fenceType", xmlWriter);

            if (localFenceType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "fenceType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFenceType);
            }

            xmlWriter.writeEndElement();
        }

        if (localFenceVolatileTracker) {
            namespace = "";
            writeStartElement(null, namespace, "fenceVolatile", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "fenceVolatile cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFenceVolatile));
            }

            xmlWriter.writeEndElement();
        }

        if (localMacroGroupIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "macroGroupId", xmlWriter);

            if (localMacroGroupId == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "macroGroupId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMacroGroupId));
            }

            xmlWriter.writeEndElement();
        }

        if (localMacroEntryIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "macroEntryId", xmlWriter);

            if (localMacroEntryId == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "macroEntryId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMacroEntryId));
            }

            xmlWriter.writeEndElement();
        }

        if (localMacroExitIdTracker) {
            namespace = "";
            writeStartElement(null, namespace, "macroExitId", xmlWriter);

            if (localMacroExitId == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "macroExitId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMacroExitId));
            }

            xmlWriter.writeEndElement();
        }

        if (localLatitudeCenterTracker) {
            namespace = "";
            writeStartElement(null, namespace, "latitudeCenter", xmlWriter);

            if (java.lang.Double.isNaN(localLatitudeCenter)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "latitudeCenter cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLatitudeCenter));
            }

            xmlWriter.writeEndElement();
        }

        if (localLongitudeCenterTracker) {
            namespace = "";
            writeStartElement(null, namespace, "longitudeCenter", xmlWriter);

            if (java.lang.Double.isNaN(localLongitudeCenter)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "longitudeCenter cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLongitudeCenter));
            }

            xmlWriter.writeEndElement();
        }

        if (localRadiusTracker) {
            namespace = "";
            writeStartElement(null, namespace, "radius", xmlWriter);

            if (java.lang.Double.isNaN(localRadius)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "radius cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRadius));
            }

            xmlWriter.writeEndElement();
        }

        if (localEntryEventTypeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "entryEventType", xmlWriter);

            if (localEntryEventType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "entryEventType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEntryEventType);
            }

            xmlWriter.writeEndElement();
        }

        if (localExitEventTypeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "exitEventType", xmlWriter);

            if (localExitEventType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "exitEventType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localExitEventType);
            }

            xmlWriter.writeEndElement();
        }

        if (localPassageEventTypeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "passageEventType", xmlWriter);

            if (localPassageEventType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "passageEventType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPassageEventType);
            }

            xmlWriter.writeEndElement();
        }

        if (localCommandEntryTracker) {
            namespace = "";
            writeStartElement(null, namespace, "commandEntry", xmlWriter);

            if (localCommandEntry == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "commandEntry cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCommandEntry);
            }

            xmlWriter.writeEndElement();
        }

        if (localCommandExitTracker) {
            namespace = "";
            writeStartElement(null, namespace, "commandExit", xmlWriter);

            if (localCommandExit == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "commandExit cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCommandExit);
            }

            xmlWriter.writeEndElement();
        }

        if (localCommandThruTracker) {
            namespace = "";
            writeStartElement(null, namespace, "commandThru", xmlWriter);

            if (localCommandThru == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "commandThru cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCommandThru);
            }

            xmlWriter.writeEndElement();
        }

        if (localEventTrigger1Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "eventTrigger1", xmlWriter);

            if (localEventTrigger1 == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "eventTrigger1 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEventTrigger1);
            }

            xmlWriter.writeEndElement();
        }

        if (localCommandSend1Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "commandSend1", xmlWriter);

            if (localCommandSend1 == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "commandSend1 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCommandSend1);
            }

            xmlWriter.writeEndElement();
        }

        if (localEventTrigger2Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "eventTrigger2", xmlWriter);

            if (localEventTrigger2 == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "eventTrigger2 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEventTrigger2);
            }

            xmlWriter.writeEndElement();
        }

        if (localCommandSend2Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "commandSend2", xmlWriter);

            if (localCommandSend2 == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "commandSend2 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCommandSend2);
            }

            xmlWriter.writeEndElement();
        }

        if (localEventTrigger3Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "eventTrigger3", xmlWriter);

            if (localEventTrigger3 == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "eventTrigger3 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEventTrigger3);
            }

            xmlWriter.writeEndElement();
        }

        if (localCommandSend3Tracker) {
            namespace = "";
            writeStartElement(null, namespace, "commandSend3", xmlWriter);

            if (localCommandSend3 == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "commandSend3 cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCommandSend3);
            }

            xmlWriter.writeEndElement();
        }

        if (localPriorityTracker) {
            namespace = "";
            writeStartElement(null, namespace, "priority", xmlWriter);

            if (localPriority == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "priority cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPriority));
            }

            xmlWriter.writeEndElement();
        }

        if (localSizeTracker) {
            namespace = "";
            writeStartElement(null, namespace, "size", xmlWriter);

            if (localSize == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "size cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSize));
            }

            xmlWriter.writeEndElement();
        }

        if (localFenceEmbededTracker) {
            namespace = "";
            writeStartElement(null, namespace, "fenceEmbeded", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "fenceEmbeded cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFenceEmbeded));
            }

            xmlWriter.writeEndElement();
        }

        if (localPointsTracker) {
            if (localPoints == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "points cannot be null!!");
            }

            localPoints.serialize(new javax.xml.namespace.QName("", "points"),
                xmlWriter);
        }

        if (localMacrosDeniedTracker) {
            if (localMacrosDenied == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "macrosDenied cannot be null!!");
            }

            localMacrosDenied.serialize(new javax.xml.namespace.QName("",
                    "macrosDenied"), xmlWriter);
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
        public static CustomFenceDTO parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            CustomFenceDTO object = new CustomFenceDTO();

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

                        if (!"customFenceDTO".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (CustomFenceDTO) br.com.x10d.monitorsinais.omni.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "id").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "id" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setId(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "name").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "name" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "shape").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "shape" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setShape(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "group").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "group" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setGroup(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "color").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "color" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setColor(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "fenceType").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "fenceType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFenceType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "fenceVolatile").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "fenceVolatile" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFenceVolatile(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "macroGroupId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "macroGroupId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMacroGroupId(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setMacroGroupId(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "macroEntryId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "macroEntryId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMacroEntryId(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setMacroEntryId(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "macroExitId").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "macroExitId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMacroExitId(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setMacroExitId(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "latitudeCenter").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "latitudeCenter" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLatitudeCenter(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setLatitudeCenter(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "longitudeCenter").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "longitudeCenter" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLongitudeCenter(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setLongitudeCenter(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "radius").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "radius" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRadius(org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setRadius(java.lang.Double.NaN);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "entryEventType").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "entryEventType" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEntryEventType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "exitEventType").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "exitEventType" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setExitEventType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "passageEventType").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "passageEventType" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPassageEventType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "commandEntry").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "commandEntry" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCommandEntry(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "commandExit").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "commandExit" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCommandExit(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "commandThru").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "commandThru" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCommandThru(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "eventTrigger1").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "eventTrigger1" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEventTrigger1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "commandSend1").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "commandSend1" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCommandSend1(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "eventTrigger2").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "eventTrigger2" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEventTrigger2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "commandSend2").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "commandSend2" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCommandSend2(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "eventTrigger3").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "eventTrigger3" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEventTrigger3(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "commandSend3").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "commandSend3" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCommandSend3(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "priority").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "priority" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPriority(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setPriority(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "size").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "size" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setSize(java.lang.Long.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "fenceEmbeded").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "fenceEmbeded" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFenceEmbeded(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "points").equals(
                            reader.getName())) {
                    object.setPoints(br.com.x10d.monitorsinais.omni.Points_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "macrosDenied").equals(
                            reader.getName())) {
                    object.setMacrosDenied(br.com.x10d.monitorsinais.omni.MacrosDenied_type0.Factory.parse(
                            reader));

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
