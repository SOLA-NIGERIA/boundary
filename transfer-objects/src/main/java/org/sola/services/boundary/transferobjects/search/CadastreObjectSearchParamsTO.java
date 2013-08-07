package org.sola.services.boundary.transferobjects.search;

import org.sola.services.common.contracts.AbstractTO;

public class CadastreObjectSearchParamsTO extends AbstractTO {
    private String nameFirstPart;
    private String nameLastPart;
    private String address;
    
    public CadastreObjectSearchParamsTO(){
        super();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameFirstPart() {
        return nameFirstPart;
    }

    public void setNameFirstPart(String nameFirstPart) {
        this.nameFirstPart = nameFirstPart;
    }

    public String getNameLastPart() {
        return nameLastPart;
    }

    public void setNameLastPart(String nameLastPart) {
        this.nameLastPart = nameLastPart;
    }
}
