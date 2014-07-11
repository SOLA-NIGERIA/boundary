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
    private String title;
    private String state;
    private String ward;
    private String imageryDate;
    private String imageryResolution;
    private String imagerySource;
    private String sheetNr;
    private Integer CofO;
    private String surveyor;
    private String rank;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(String surveyor) {
        this.surveyor = surveyor;
    }
    
    public String getImageryResolution() {
        return imageryResolution;
    }

    public void setImageryResolution(String imageryResolution) {
        this.imageryResolution = imageryResolution;
    }

    public String getImagerySource() {
        return imagerySource;
    }

    public void setImagerySource(String imagerySource) {
        this.imagerySource = imagerySource;
    }

    public String getSheetNr() {
        return sheetNr;
    }

    public void setSheetNr(String sheetNr) {
        this.sheetNr = sheetNr;
    }
    
    public Integer getCofO() {
        return CofO;
    }

    public void setCofO(Integer CofO) {
        this.CofO = CofO;
    }
    
    public String getImageryDate() {
        return imageryDate;
    }

    public void setImageryDate(String imageryDate) {
        this.imageryDate = imageryDate;
    }
    
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
    
    
    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
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
