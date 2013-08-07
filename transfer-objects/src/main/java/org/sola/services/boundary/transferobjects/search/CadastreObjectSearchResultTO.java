package org.sola.services.boundary.transferobjects.search;

import java.math.BigDecimal;
import org.sola.services.boundary.transferobjects.cadastre.CadastreObjectSummaryTO;

public class CadastreObjectSearchResultTO extends CadastreObjectSummaryTO {
    private String address;
    private BigDecimal area;
    
    public CadastreObjectSearchResultTO(){
        super();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }
}
