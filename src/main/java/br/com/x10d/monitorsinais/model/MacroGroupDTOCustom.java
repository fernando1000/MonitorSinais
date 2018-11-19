package br.com.x10d.monitorsinais.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings({"unchecked", "unused"})
@Entity(name="macroGroupDTO")
public class MacroGroupDTOCustom {
  
	@Id
	@GeneratedValue
	private Long id;

    protected long localId;
    protected boolean localIdTracker = false;
    protected java.lang.String localName;
    protected boolean localNameTracker = false;
    protected java.lang.String localAvailableForSend;
    protected boolean localAvailableForSendTracker = false;
    //protected br.com.altran.rio.omnilink.Macros_type0 localMacros;
    protected boolean localMacrosTracker = false;

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

    public boolean isAvailableForSendSpecified() {
        return localAvailableForSendTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAvailableForSend() {
        return localAvailableForSend;
    }

    /**
     * Auto generated setter method
     * @param param AvailableForSend
     */
    public void setAvailableForSend(java.lang.String param) {
        localAvailableForSendTracker = param != null;

        this.localAvailableForSend = param;
    }

    public boolean isMacrosSpecified() {
        return localMacrosTracker;
    }


}
