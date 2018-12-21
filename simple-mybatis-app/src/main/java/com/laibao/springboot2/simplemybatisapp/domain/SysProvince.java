package com.laibao.springboot2.simplemybatisapp.domain;

import java.io.Serializable;

public class SysProvince implements Serializable {
    private static final long serialVersionUID = 3561682564331658981L;

    private String provinceId;

    private String province;

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }
}