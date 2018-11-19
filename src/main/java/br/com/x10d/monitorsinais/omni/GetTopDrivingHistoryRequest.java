/**
 * GetTopDrivingHistoryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:38 BST)
 */
package br.com.x10d.monitorsinais.omni;


/**
 *  GetTopDrivingHistoryRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class GetTopDrivingHistoryRequest implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = getTopDrivingHistoryRequest
       Namespace URI = http://linkerapi.portalorion.zatix.com.br/
       Namespace Prefix = ns1
     */

    /**
     * field for NumberOfRecords
     */
    protected int localNumberOfRecords;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumberOfRecordsTracker = false;

    /**
     * field for Plates
     */
    protected br.com.x10d.monitorsinais.omni.Plates_type0 localPlates;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPlatesTracker = false;

    /**
     * field for SeqDateEnd
     */
    protected java.util.Calendar localSeqDateEnd;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSeqDateEndTracker = false;

    /**
     * field for SeqDateStart
     */
    protected java.util.Calendar localSeqDateStart;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSeqDateStartTracker = false;

    /**
     * field for DLicense
     * This was an Array!
     */
    protected java.lang.String[] localDLicense;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDLicenseTracker = false;

    /**
     * field for DNames
     */
    protected br.com.x10d.monitorsinais.omni.DNames_type0 localDNames;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDNamesTracker = false;

    /**
     * field for DNicks
     * This was an Array!
     */
    protected java.lang.String[] localDNicks;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDNicksTracker = false;

    public boolean isNumberOfRecordsSpecified() {
        return localNumberOfRecordsTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNumberOfRecords() {
        return localNumberOfRecords;
    }

    /**
     * Auto generated setter method
     * @param param NumberOfRecords
     */
    public void setNumberOfRecords(int param) {
        // setting primitive attribute tracker to true
        localNumberOfRecordsTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNumberOfRecords = param;
    }

    public boolean isPlatesSpecified() {
        return localPlatesTracker;
    }

    /**
     * Auto generated getter method
     * @return br.com.zatix.portalorion.linkerapi.Plates_type0
     */
    public br.com.x10d.monitorsinais.omni.Plates_type0 getPlates() {
        return localPlates;
    }

    /**
     * Auto generated setter method
     * @param param Plates
     */
    public void setPlates(br.com.x10d.monitorsinais.omni.Plates_type0 param) {
        localPlatesTracker = param != null;

        this.localPlates = param;
    }

    public boolean isSeqDateEndSpecified() {
        return localSeqDateEndTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getSeqDateEnd() {
        return localSeqDateEnd;
    }

    /**
     * Auto generated setter method
     * @param param SeqDateEnd
     */
    public void setSeqDateEnd(java.util.Calendar param) {
        localSeqDateEndTracker = param != null;

        this.localSeqDateEnd = param;
    }

    public boolean isSeqDateStartSpecified() {
        return localSeqDateStartTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getSeqDateStart() {
        return localSeqDateStart;
    }

    /**
     * Auto generated setter method
     * @param param SeqDateStart
     */
    public void setSeqDateStart(java.util.Calendar param) {
        localSeqDateStartTracker = param != null;

        this.localSeqDateStart = param;
    }

    public boolean isDLicenseSpecified() {
        return localDLicenseTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getDLicense() {
        return localDLicense;
    }

    /**
     * validate the array for DLicense
     */
    protected void validateDLicense(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param DLicense
     */
    public void setDLicense(java.lang.String[] param) {
        validateDLicense(param);

        localDLicenseTracker = param != null;

        this.localDLicense = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addDLicense(java.lang.String param) {
        if (localDLicense == null) {
            localDLicense = new java.lang.String[] {  };
        }

        //update the setting tracker
        localDLicenseTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localDLicense);
        list.add(param);
        this.localDLicense = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
    }

    public boolean isDNamesSpecified() {
        return localDNamesTracker;
    }

    /**
     * Auto generated getter method
     * @return br.com.zatix.portalorion.linkerapi.DNames_type0
     */
    public br.com.x10d.monitorsinais.omni.DNames_type0 getDNames() {
        return localDNames;
    }

    /**
     * Auto generated setter method
     * @param param DNames
     */
    public void setDNames(br.com.x10d.monitorsinais.omni.DNames_type0 param) {
        localDNamesTracker = param != null;

        this.localDNames = param;
    }

    public boolean isDNicksSpecified() {
        return localDNicksTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String[]
     */
    public java.lang.String[] getDNicks() {
        return localDNicks;
    }

    /**
     * validate the array for DNicks
     */
    protected void validateDNicks(java.lang.String[] param) {
    }

    /**
     * Auto generated setter method
     * @param param DNicks
     */
    public void setDNicks(java.lang.String[] param) {
        validateDNicks(param);

        localDNicksTracker = true;

        this.localDNicks = param;
    }

    /**
     * Auto generated add method for the array for convenience
     * @param param java.lang.String
     */
    public void addDNicks(java.lang.String param) {
        if (localDNicks == null) {
            localDNicks = new java.lang.String[] {  };
        }

        //update the setting tracker
        localDNicksTracker = true;

        java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localDNicks);
        list.add(param);
        this.localDNicks = (java.lang.String[]) list.toArray(new java.lang.String[list.size()]);
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
                    namespacePrefix + ":getTopDrivingHistoryRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "getTopDrivingHistoryRequest", xmlWriter);
            }
        }

        if (localNumberOfRecordsTracker) {
            namespace = "";
            writeStartElement(null, namespace, "numberOfRecords", xmlWriter);

            if (localNumberOfRecords == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "numberOfRecords cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumberOfRecords));
            }

            xmlWriter.writeEndElement();
        }

        if (localPlatesTracker) {
            if (localPlates == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "plates cannot be null!!");
            }

            localPlates.serialize(new javax.xml.namespace.QName("", "plates"),
                xmlWriter);
        }

        if (localSeqDateEndTracker) {
            namespace = "";
            writeStartElement(null, namespace, "seqDateEnd", xmlWriter);

            if (localSeqDateEnd == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "seqDateEnd cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSeqDateEnd));
            }

            xmlWriter.writeEndElement();
        }

        if (localSeqDateStartTracker) {
            namespace = "";
            writeStartElement(null, namespace, "seqDateStart", xmlWriter);

            if (localSeqDateStart == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "seqDateStart cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSeqDateStart));
            }

            xmlWriter.writeEndElement();
        }

        if (localDLicenseTracker) {
            if (localDLicense != null) {
                namespace = "";

                for (int i = 0; i < localDLicense.length; i++) {
                    if (localDLicense[i] != null) {
                        writeStartElement(null, namespace, "dLicense", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localDLicense[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // we have to do nothing since minOccurs is zero
                    }
                }
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                    "dLicense cannot be null!!");
            }
        }

        if (localDNamesTracker) {
            if (localDNames == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "dNames cannot be null!!");
            }

            localDNames.serialize(new javax.xml.namespace.QName("", "dNames"),
                xmlWriter);
        }

        if (localDNicksTracker) {
            if (localDNicks != null) {
                namespace = "";

                for (int i = 0; i < localDNicks.length; i++) {
                    if (localDNicks[i] != null) {
                        writeStartElement(null, namespace, "dNicks", xmlWriter);

                        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                localDNicks[i]));

                        xmlWriter.writeEndElement();
                    } else {
                        // write null attribute
                        namespace = "";
                        writeStartElement(null, namespace, "dNicks", xmlWriter);
                        writeAttribute("xsi",
                            "http://www.w3.org/2001/XMLSchema-instance", "nil",
                            "1", xmlWriter);
                        xmlWriter.writeEndElement();
                    }
                }
            } else {
                // write the null attribute
                // write null attribute
                writeStartElement(null, "", "dNicks", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            }
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
        public static GetTopDrivingHistoryRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GetTopDrivingHistoryRequest object = new GetTopDrivingHistoryRequest();

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

                        if (!"getTopDrivingHistoryRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (GetTopDrivingHistoryRequest) br.com.x10d.monitorsinais.omni.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                java.util.ArrayList list5 = new java.util.ArrayList();

                java.util.ArrayList list7 = new java.util.ArrayList();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "numberOfRecords").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "numberOfRecords" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNumberOfRecords(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNumberOfRecords(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "plates").equals(
                            reader.getName())) {
                    object.setPlates(br.com.x10d.monitorsinais.omni.Plates_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "seqDateEnd").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "seqDateEnd" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSeqDateEnd(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "seqDateStart").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "seqDateStart" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSeqDateStart(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
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
                    // Process the array and step past its final element's end.
                    list5.add(reader.getElementText());

                    //loop until we find a start element that is not part of this array
                    boolean loopDone5 = false;

                    while (!loopDone5) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone5 = true;
                        } else {
                            if (new javax.xml.namespace.QName("", "dLicense").equals(
                                        reader.getName())) {
                                list5.add(reader.getElementText());
                            } else {
                                loopDone5 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setDLicense((java.lang.String[]) list5.toArray(
                            new java.lang.String[list5.size()]));
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "dNames").equals(
                            reader.getName())) {
                    object.setDNames(br.com.x10d.monitorsinais.omni.DNames_type0.Factory.parse(
                            reader));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "dNicks").equals(
                            reader.getName())) {
                    // Process the array and step past its final element's end.
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        list7.add(null);

                        reader.next();
                    } else {
                        list7.add(reader.getElementText());
                    }

                    //loop until we find a start element that is not part of this array
                    boolean loopDone7 = false;

                    while (!loopDone7) {
                        // Ensure we are at the EndElement
                        while (!reader.isEndElement()) {
                            reader.next();
                        }

                        // Step out of this element
                        reader.next();

                        // Step to next element event.
                        while (!reader.isStartElement() &&
                                !reader.isEndElement())
                            reader.next();

                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone7 = true;
                        } else {
                            if (new javax.xml.namespace.QName("", "dNicks").equals(
                                        reader.getName())) {
                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                        "nil");

                                if ("true".equals(nillableValue) ||
                                        "1".equals(nillableValue)) {
                                    list7.add(null);

                                    reader.next();
                                } else {
                                    list7.add(reader.getElementText());
                                }
                            } else {
                                loopDone7 = true;
                            }
                        }
                    }

                    // call the converter utility  to convert and set the array
                    object.setDNicks((java.lang.String[]) list7.toArray(
                            new java.lang.String[list7.size()]));
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
