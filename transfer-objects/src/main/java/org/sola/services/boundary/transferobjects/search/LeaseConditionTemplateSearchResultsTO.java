package org.sola.services.boundary.transferobjects.search;

import org.sola.services.common.contracts.AbstractTO;

public class LeaseConditionTemplateSearchResultsTO extends AbstractTO {
    private String id;
    private String templateName;
    private String rrrType;
    private String rrrTypeName;

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

    public String getRrrTypeName() {
        return rrrTypeName;
    }

    public void setRrrTypeName(String rrrTypeName) {
        this.rrrTypeName = rrrTypeName;
    }

    public LeaseConditionTemplateSearchResultsTO(){
        super();
    }
}
