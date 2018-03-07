package com.finki.soa.group3.HRSystem.persistence.devices;

import com.finki.soa.group3.HRSystem.model.devices.Device;
import com.finki.soa.group3.HRSystem.model.devices.DeviceCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceDao extends CrudRepository<Device, Long> {
    Device findById(long id);

    Iterable<Device> findAllByDeviceCategory(DeviceCategory deviceCategory);

    Long deleteById(long id);
}
