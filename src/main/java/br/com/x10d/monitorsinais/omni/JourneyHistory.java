package br.com.x10d.monitorsinais.omni;

@SuppressWarnings({"unchecked", "unused"})
public class JourneyHistory implements org.apache.axis2.databinding.ADBBean {
  
    protected java.util.Calendar localSeqDate;
    protected boolean localSeqDateTracker = false;
    protected java.lang.String localDLicense;
    protected boolean localDLicenseTracker = false;
    protected java.lang.String localDName;
    protected boolean localDNameTracker = false;
    protected java.lang.String localDNick;
    protected boolean localDNickTracker = false;
    protected java.util.Calendar localEndDate;
    protected boolean localEndDateTracker = false;
    protected java.util.Calendar localStartDate;
    protected boolean localStartDateTracker = false;
    protected br.com.x10d.monitorsinais.omni.JourneyStatus localStatus;
    protected boolean localStatusTracker = false;
    protected java.lang.String localVPlate;
    protected boolean localVPlateTracker = false;
    protected int localViolDrive;
    protected int localViolLunch;
    protected int localViolLunchExceed;
    protected int localViolRest;
    protected int localViolWeekend;

    public boolean isSeqDateSpecified() {
        return localSeqDateTracker;
    }

    public java.util.Calendar getSeqDate() {
        return localSeqDate;
    }

    public void setSeqDate(java.util.Calendar param) {
        localSeqDateTracker = param != null;

        this.localSeqDate = param;
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

    public boolean isEndDateSpecified() {
        return localEndDateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getEndDate() {
        return localEndDate;
    }

    /**
     * Auto generated setter method
     * @param param EndDate
     */
    public void setEndDate(java.util.Calendar param) {
        localEndDateTracker = param != null;

        this.localEndDate = param;
    }

    public boolean isStartDateSpecified() {
        return localStartDateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getStartDate() {
        return localStartDate;
    }

    /**
     * Auto generated setter method
     * @param param StartDate
     */
    public void setStartDate(java.util.Calendar param) {
        localStartDateTracker = param != null;

        this.localStartDate = param;
    }

    public boolean isStatusSpecified() {
        return localStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return br.com.zatix.portalorion.linkerapi.JourneyStatus
     */
    public br.com.x10d.monitorsinais.omni.JourneyStatus getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     * @param param Status
     */
    public void setStatus(
        br.com.x10d.monitorsinais.omni.JourneyStatus param) {
        localStatusTracker = param != null;

        this.localStatus = param;
    }

    public boolean isVPlateSpecified() {
        return localVPlateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVPlate() {
        return localVPlate;
    }

    /**
     * Auto generated setter method
     * @param param VPlate
     */
    public void setVPlate(java.lang.String param) {
        localVPlateTracker = param != null;

        this.localVPlate = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getViolDrive() {
        return localViolDrive;
    }

    /**
     * Auto generated setter method
     * @param param ViolDrive
     */
    public void setViolDrive(int param) {
        this.localViolDrive = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getViolLunch() {
        return localViolLunch;
    }

    /**
     * Auto generated setter method
     * @param param ViolLunch
     */
    public void setViolLunch(int param) {
        this.localViolLunch = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getViolLunchExceed() {
        return localViolLunchExceed;
    }

    /**
     * Auto generated setter method
     * @param param ViolLunchExceed
     */
    public void setViolLunchExceed(int param) {
        this.localViolLunchExceed = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getViolRest() {
        return localViolRest;
    }

    /**
     * Auto generated setter method
     * @param param ViolRest
     */
    public void setViolRest(int param) {
        this.localViolRest = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getViolWeekend() {
        return localViolWeekend;
    }

    /**
     * Auto generated setter method
     * @param param ViolWeekend
     */
    public void setViolWeekend(int param) {
        this.localViolWeekend = param;
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
                    namespacePrefix + ":journeyHistory", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "journeyHistory", xmlWriter);
            }
        }

        if (localSeqDateTracker) {
            namespace = "";
            writeStartElement(null, namespace, "seqDate", xmlWriter);

            if (localSeqDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "seqDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSeqDate));
            }

            xmlWriter.writeEndElement();
        }

        if (localDLicenseTracker) {
            namespace = "";
            writeStartElement(null, namespace, "dLicense", xmlWriter);

            if (localDLicense == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "dLicense cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDLicense);
            }

            xmlWriter.writeEndElement();
        }

        if (localDNameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "dName", xmlWriter);

            if (localDName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "dName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDName);
            }

            xmlWriter.writeEndElement();
        }

        if (localDNickTracker) {
            namespace = "";
            writeStartElement(null, namespace, "dNick", xmlWriter);

            if (localDNick == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "dNick cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDNick);
            }

            xmlWriter.writeEndElement();
        }

        if (localEndDateTracker) {
            namespace = "";
            writeStartElement(null, namespace, "endDate", xmlWriter);

            if (localEndDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "endDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localEndDate));
            }

            xmlWriter.writeEndElement();
        }

        if (localStartDateTracker) {
            namespace = "";
            writeStartElement(null, namespace, "startDate", xmlWriter);

            if (localStartDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "startDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localStartDate));
            }

            xmlWriter.writeEndElement();
        }

        if (localStatusTracker) {
            if (localStatus == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "status cannot be null!!");
            }

            localStatus.serialize(new javax.xml.namespace.QName("", "status"),
                xmlWriter);
        }

        if (localVPlateTracker) {
            namespace = "";
            writeStartElement(null, namespace, "vPlate", xmlWriter);

            if (localVPlate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "vPlate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVPlate);
            }

            xmlWriter.writeEndElement();
        }

        namespace = "";
        writeStartElement(null, namespace, "violDrive", xmlWriter);

        if (localViolDrive == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "violDrive cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localViolDrive));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "violLunch", xmlWriter);

        if (localViolLunch == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "violLunch cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localViolLunch));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "violLunchExceed", xmlWriter);

        if (localViolLunchExceed == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "violLunchExceed cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localViolLunchExceed));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "violRest", xmlWriter);

        if (localViolRest == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "violRest cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localViolRest));
        }

        xmlWriter.writeEndElement();

        namespace = "";
        writeStartElement(null, namespace, "violWeekend", xmlWriter);

        if (localViolWeekend == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "violWeekend cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localViolWeekend));
        }

        xmlWriter.writeEndElement();

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
        public static JourneyHistory parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            JourneyHistory object = new JourneyHistory();

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

                        if (!"journeyHistory".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (JourneyHistory) br.com.x10d.monitorsinais.omni.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "seqDate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "seqDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSeqDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "dLicense").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "dLicense" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDLicense(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "dName").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "dName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "dNick").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "dNick" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDNick(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "endDate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "endDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEndDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "startDate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "startDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setStartDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "status").equals(
                            reader.getName())) {
                    object.setStatus(br.com.x10d.monitorsinais.omni.JourneyStatus.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "vPlate").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "vPlate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setVPlate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "violDrive").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "violDrive" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setViolDrive(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "violLunch").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "violLunch" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setViolLunch(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "violLunchExceed").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "violLunchExceed" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setViolLunchExceed(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "violRest").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "violRest" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setViolRest(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "violWeekend").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "violWeekend" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setViolWeekend(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
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
