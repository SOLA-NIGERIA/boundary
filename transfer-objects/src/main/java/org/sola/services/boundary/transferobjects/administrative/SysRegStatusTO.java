/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.administrative;

import java.math.BigDecimal;
import org.sola.services.common.contracts.AbstractIdTO;

/**
 *
 * @author RizzoM
 */
public class SysRegStatusTO extends AbstractIdTO {
    
    private String     srwu;
    private BigDecimal estimatedparcel;
    private BigDecimal recordedparcel;
    private BigDecimal recordedclaims;
    private BigDecimal scanneddemarcation;
    private BigDecimal scannedclaims;
    private BigDecimal digitizedparcels;
    private BigDecimal claimsentered;
    private BigDecimal parcelsreadyPD;
    private BigDecimal parcelsPD;
    private BigDecimal 	parcelscompletedPD;
    private BigDecimal unsolveddisputes;
    private BigDecimal generatedcertificates;
    private BigDecimal distributedcertificates;
    
    
    public BigDecimal getClaimsentered() {
        return claimsentered;
    }

    public void setClaimsentered(BigDecimal claimsentered) {
        this.claimsentered = claimsentered;
    }

    public BigDecimal getDigitizedparcels() {
        return digitizedparcels;
    }

    public void setDigitizedparcels(BigDecimal digitizedparcels) {
        this.digitizedparcels = digitizedparcels;
    }

    public BigDecimal getDistributedcertificates() {
        return distributedcertificates;
    }

    public void setDistributedcertificates(BigDecimal distributedcertificates) {
        this.distributedcertificates = distributedcertificates;
    }

    public BigDecimal getEstimatedparcel() {
        return estimatedparcel;
    }

    public void setEstimatedparcel(BigDecimal estimatedparcel) {
        this.estimatedparcel = estimatedparcel;
    }

    public BigDecimal getGeneratedcertificates() {
        return generatedcertificates;
    }

    public void setGeneratedcertificates(BigDecimal generatedcertificates) {
        this.generatedcertificates = generatedcertificates;
    }

    public BigDecimal getParcelsPD() {
        return parcelsPD;
    }

    public void setParcelsPD(BigDecimal parcelsPD) {
        this.parcelsPD = parcelsPD;
    }

    public BigDecimal getParcelscompletedPD() {
        return parcelscompletedPD;
    }

    public void setParcelscompletedPD(BigDecimal parcelscompletedPD) {
        this.parcelscompletedPD = parcelscompletedPD;
    }

    public BigDecimal getParcelsreadyPD() {
        return parcelsreadyPD;
    }

    public void setParcelsreadyPD(BigDecimal parcelsreadyPD) {
        this.parcelsreadyPD = parcelsreadyPD;
    }

    public BigDecimal getRecordedclaims() {
        return recordedclaims;
    }

    public void setRecordedclaims(BigDecimal recordedclaims) {
        this.recordedclaims = recordedclaims;
    }

    public BigDecimal getRecordedparcel() {
        return recordedparcel;
    }

    public void setRecordedparcel(BigDecimal recordedparcel) {
        this.recordedparcel = recordedparcel;
    }

    public BigDecimal getScannedclaims() {
        return scannedclaims;
    }

    public void setScannedclaims(BigDecimal scannedclaims) {
        this.scannedclaims = scannedclaims;
    }

    public BigDecimal getScanneddemarcation() {
        return scanneddemarcation;
    }

    public void setScanneddemarcation(BigDecimal scanneddemarcation) {
        this.scanneddemarcation = scanneddemarcation;
    }

    public String getSrwu() {
        return srwu;
    }

    public void setSrwu(String srwu) {
        this.srwu = srwu;
    }

    public BigDecimal getUnsolveddisputes() {
        return unsolveddisputes;
    }

    public void setUnsolveddisputes(BigDecimal unsolveddisputes) {
        this.unsolveddisputes = unsolveddisputes;
    }
}
