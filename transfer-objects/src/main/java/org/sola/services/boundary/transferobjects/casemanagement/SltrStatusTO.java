/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.services.boundary.transferobjects.casemanagement;

import org.sola.services.common.contracts.AbstractIdTO;

/**
 *
 * @author rizzom
 */
public class SltrStatusTO extends AbstractIdTO {

    private String sltrStatus;
    private String appId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
   
    public String getSltrStatus() {
        return sltrStatus;
    }

    public void setSltrStatus(String sltrStatus) {
        this.sltrStatus = sltrStatus;
    }
}
