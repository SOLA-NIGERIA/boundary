/**
 * ******************************************************************************************
 * Copyright (C) 2012 - Food and Agriculture Organization of the United Nations
 * (FAO). All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,this
 * list of conditions and the following disclaimer. 2. Redistributions in binary
 * form must reproduce the above copyright notice,this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided
 * with the distribution. 3. Neither the name of FAO nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT,STRICT LIABILITY,OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.boundary.transferobjects.cadastre;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.sola.services.common.contracts.AbstractIdTO;


/**
 *
 * @author rizzom
 */
public class SysRegWorkUnitTO extends AbstractIdTO {
        private String name;
        private BigDecimal estimatedparcel;
        private BigDecimal recordedparcel;
        private BigDecimal recordedclaims;
        private BigDecimal scanneddemarcation;
        private BigDecimal scannedclaims;
        private BigDecimal distributedcertificates;
        private Date publicdisplaystartdate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublicdisplaystartdate() {
        return publicdisplaystartdate;
    }

    public void setPublicdisplaystartdate(Date publicdisplaystartdate) {
        this.publicdisplaystartdate = publicdisplaystartdate;
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
}
