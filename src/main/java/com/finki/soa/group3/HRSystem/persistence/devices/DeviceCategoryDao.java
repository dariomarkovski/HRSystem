package com.finki.soa.group3.HRSystem.persistence.devices;

import com.finki.soa.group3.HRSystem.model.devices.DeviceCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceCategoryDao extends CrudRepository<DeviceCategory, Long> {
    DeviceCategory findById(long id);
}
