/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.casemanagement;

import java.math.BigDecimal;
import java.util.Date;
import org.sola.services.common.contracts.AbstractIdTO;

/**
 *
 * @author RizzoM
 */
public class SysRegCertificatesTO extends AbstractIdTO {

    private String nameFirstpart;
    private String nameLastpart;
    private String baUnitId;
    private String nr;
    private String name;
    private String appId;
    private Date commencingDate;
    private String landUse;
    private String propLocation;
    private BigDecimal size;
    private BigDecimal groundRent;
    private String owners;

    public String getOwners() {
        return owners;
    }

    public void setOwners(String owners) {
        this.owners = owners;
    }
    

    public BigDecimal getGroundRent() {
        return groundRent;
    }

    public void setGroundRent(BigDecimal groundRent) {
        this.groundRent = groundRent;
    }
    
    
    
    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }
    public String getPropLocation() {
        return propLocation;
    }

    public void setPropLocation(String propLocation) {
        this.propLocation = propLocation;
    }

    public String getLandUse() {
        return landUse;
    }

    public void setLandUse(String landUse) {
        this.landUse = landUse;
    }
       
    
    public Date getCommencingDate() {
        return commencingDate;
    }

    public void setCommencingDate(Date commencingDate) {
        this.commencingDate = commencingDate;
    }
    

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    public String getBaUnitId() {
        return baUnitId;
    }

    public void setBaUnitId(String baUnitId) {
        this.baUnitId = baUnitId;
    }

    public String getNameFirstpart() {
        return nameFirstpart;
    }

    public void setNameFirstpart(String nameFirstpart) {
        this.nameFirstpart = nameFirstpart;
    }

    public String getNameLastpart() {
        return nameLastpart;
    }

    public void setNameLastpart(String nameLastpart) {
        this.nameLastpart = nameLastpart;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
