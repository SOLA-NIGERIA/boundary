package org.sola.services.boundary.transferobjects.administrative;

import org.sola.services.common.contracts.AbstractIdTO;

public class ConditionForRrrTO extends AbstractIdTO {
    private String rrrId;
    private String RrrConditionCode;
    private String customConditionText;
    
    public ConditionForRrrTO(){
        super();
    }

    public String getCustomConditionText() {
        return customConditionText;
    }

    public void setCustomConditionText(String customConditionText) {
        this.customConditionText = customConditionText;
    }

    public String getRrrConditionCode() {
        return RrrConditionCode;
    }

    public void setRrrConditionCode(String RrrConditionCode) {
        this.RrrConditionCode = RrrConditionCode;
    }

    public String getRrrId() {
        return rrrId;
    }

    public void setRrrId(String rrrId) {
        this.rrrId = rrrId;
    }
}
