/**
 * ******************************************************************************************
 * Copyright (C) 2015 - Food and Agriculture Organization of the United Nations (FAO).
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice,this list
 *       of conditions and the following disclaimer.
 *    2. Redistributions in binary form must reproduce the above copyright notice,this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *    3. Neither the name of FAO nor the names of its contributors may be used to endorse or
 *       promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.boundary.transferobjects.administrative;

import org.sola.services.common.contracts.AbstractIdTO;
import java.util.*;
import org.sola.services.boundary.transferobjects.casemanagement.PartySummaryTO;
import org.sola.services.boundary.transferobjects.casemanagement.SourceTO;

public class DisputeTO extends AbstractIdTO {
    
  
    private String id;
    private String applicationId;
    private String serviceId;
    private String nr;
    private Date lodgementDate;
    private Date completionDate;
    private String disputeCategoryCode;
    private String disputeTypeCode;
    private String statusCode;
    private String leaseNumber;
    private String plotLocation;
    private String plotNumber;
    private String caseType;
    private boolean primaryRespondent;
    private String actionRequired;
    private List<DisputeCommentsTO> disputeCommentsList;
    private List<SourceTO> sourceList;
    private List<DisputePartyTO> disputePartyList;
    
    public DisputeTO(){
        super();
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public String getDisputeCategoryCode() {
        return disputeCategoryCode;
    }

    public void setDisputeCategoryCode(String disputeCategoryCode) {
        this.disputeCategoryCode = disputeCategoryCode;
    }

    public String getDisputeTypeCode() {
        return disputeTypeCode;
    }

    public void setDisputeTypeCode(String disputeTypeCode) {
        this.disputeTypeCode = disputeTypeCode;
    }

    public String getLeaseNumber() {
        return leaseNumber;
    }

    public void setLeaseNumber(String leaseNumber) {
        this.leaseNumber = leaseNumber;
    }

    public Date getLodgementDate() {
        return lodgementDate;
    }

    public void setLodgementDate(Date lodgementDate) {
        this.lodgementDate = lodgementDate;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getPlotLocation() {
        return plotLocation;
    }

    public void setPlotLocation(String plotLocation) {
        this.plotLocation = plotLocation;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
     public List<DisputeCommentsTO> getDisputeCommentsList() {
        return disputeCommentsList;
    }

    public void setDisputeCommentsList(List<DisputeCommentsTO> disputeCommentsList) {
        this.disputeCommentsList = disputeCommentsList;
    }
    
    public void addComments(DisputeCommentsTO Comments) {
        if (disputeCommentsList == null) {
            disputeCommentsList = new ArrayList<DisputeCommentsTO>();
        }
        disputeCommentsList.add(Comments);
    }
    public List<DisputePartyTO> getDisputePartyList() {
        return disputePartyList;
    }
     public List<DisputePartyTO> getDisputeParty() {
        return disputePartyList;
    }

    public void setDisputePartyList(List<DisputePartyTO> disputeParty) {
        this.disputePartyList = disputeParty;
    }

    public void addDisputeParty(DisputePartyTO disputePartyTO) {
        if (disputePartyList == null) {
            disputePartyList = new ArrayList<DisputePartyTO>();
        }
        disputePartyList.add(disputePartyTO);
    }
    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(String actionRequired) {
        this.actionRequired = actionRequired;
    }

    public boolean isPrimaryRespondent() {
        return primaryRespondent;
    }

    public void setPrimaryRespondent(boolean primaryRespondent) {
        this.primaryRespondent = primaryRespondent;
    }
    
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    
     public List<SourceTO> getSourceList() {
        return sourceList;
    }

    public void setSourceList(List<SourceTO> sourceList) {
        this.sourceList = sourceList;
    }

    public void addSource(SourceTO source) {
        if (sourceList == null) {
            sourceList = new ArrayList<SourceTO>();
        }
        sourceList.add(source);
    }
    
}
