package com.finki.soa.group3.HRSystem.model.devices;

import com.finki.soa.group3.HRSystem.model.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Device {

    public enum DeviceType {
        EMPLOYEE_DEVICE, TEST_DEVICE, OTHER_DEVICE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private boolean retired;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @JoinColumn(nullable = false)
    @ManyToOne
    private DeviceCategory deviceCategory;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DeviceType deviceType;

    @Column(nullable = false)
    private boolean available;

    @JoinColumn(nullable = false)
    @ManyToOne
    private Employee userOfDevice;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    private Set<Issue> issueSet;




}
