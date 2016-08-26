package org.sola.services.boundary.transferobjects.administrative;

import org.sola.services.common.contracts.AbstractVersionedTO;

public class LeaseConditionTemplateTO extends AbstractVersionedTO {
    
    private String id;
    private String templateName;
    private String rrrType;
    private String templateText;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getRrrType() {
        return rrrType;
    }

    public void setRrrType(String rrrType) {
        this.rrrType = rrrType;
    }

    public String getTemplateText() {
        return templateText;
    }

    public void setTemplateText(String templateText) {
        this.templateText = templateText;
    }
    
    public LeaseConditionTemplateTO(){
        super();
    }
}
