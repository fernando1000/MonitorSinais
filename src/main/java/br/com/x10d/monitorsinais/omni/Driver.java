package br.com.x10d.monitorsinais.omni;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings({"unchecked", "unused"})
public class Driver implements org.apache.axis2.databinding.ADBBean {
    

	
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
                    namespacePrefix + ":driver", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "driver", xmlWriter);
            }
        }

        if (localLicenseTracker) {
            namespace = "";
            writeStartElement(null, namespace, "license", xmlWriter);

            if (localLicense == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "license cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLicense);
            }

            xmlWriter.writeEndElement();
        }

        if (localLicenseCategoryTracker) {
            namespace = "";
            writeStartElement(null, namespace, "licenseCategory", xmlWriter);

            if (localLicenseCategory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "licenseCategory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLicenseCategory);
            }

            xmlWriter.writeEndElement();
        }

        if (localLicenseExpiresTracker) {
            namespace = "";
            writeStartElement(null, namespace, "licenseExpires", xmlWriter);

            if (localLicenseExpires == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "licenseExpires cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLicenseExpires));
            }

            xmlWriter.writeEndElement();
        }

        if (localMobileTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mobile", xmlWriter);

            if (localMobile == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "mobile cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMobile);
            }

            xmlWriter.writeEndElement();
        }

        if (localMoppExpiresTracker) {
            namespace = "";
            writeStartElement(null, namespace, "moppExpires", xmlWriter);

            if (localMoppExpires == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "moppExpires cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMoppExpires));
            }

            xmlWriter.writeEndElement();
        }

        if (localMoppTracker) {
            namespace = "";
            writeStartElement(null, namespace, "mopp", xmlWriter);

            if (localMopp == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "mopp cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMopp);
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

        if (localNicknameTracker) {
            namespace = "";
            writeStartElement(null, namespace, "nickname", xmlWriter);

            if (localNickname == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "nickname cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNickname);
            }

            xmlWriter.writeEndElement();
        }

        if (localNoteTracker) {
            namespace = "";
            writeStartElement(null, namespace, "note", xmlWriter);

            if (localNote == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "note cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNote);
            }

            xmlWriter.writeEndElement();
        }

        if (localPasswordTracker) {
            namespace = "";
            writeStartElement(null, namespace, "password", xmlWriter);

            if (localPassword == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "password cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPassword);
            }

            xmlWriter.writeEndElement();
        }

        if (localReportLineStyleTracker) {
            namespace = "";
            writeStartElement(null, namespace, "reportLineStyle", xmlWriter);

            if (localReportLineStyle == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "reportLineStyle cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localReportLineStyle);
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

    
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

       
        public static Driver parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Driver object = new Driver();

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

                        if (!"driver".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Driver) br.com.x10d.monitorsinais.omni.ExtensionMapper.getTypeObject(nsUri,
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
                        new javax.xml.namespace.QName("", "license").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "license" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLicense(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "licenseCategory").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "licenseCategory" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLicenseCategory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "licenseExpires").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "licenseExpires" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLicenseExpires(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mobile").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mobile" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMobile(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "moppExpires").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "moppExpires" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMoppExpires(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "mopp").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "mopp" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMopp(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
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
                        new javax.xml.namespace.QName("", "nickname").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "nickname" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNickname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "note").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "note" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNote(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "password").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "password" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPassword(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName("", "reportLineStyle").equals(
                            reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "reportLineStyle" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setReportLineStyle(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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
