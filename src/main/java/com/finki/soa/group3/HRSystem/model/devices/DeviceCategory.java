package com.finki.soa.group3.HRSystem.model.devices;

import javax.persistence.*;
import java.util.Set;

public class DeviceCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "deviceCategory", cascade = CascadeType.ALL)
    private Set<Device> deviceSet;
}
