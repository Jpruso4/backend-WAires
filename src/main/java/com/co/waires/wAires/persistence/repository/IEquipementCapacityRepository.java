package com.co.waires.wAires.persistence.repository;

import com.co.waires.wAires.persistence.entity.EquipementCapacity;
import com.co.waires.wAires.persistence.entity.EquipementType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipementCapacityRepository extends JpaRepository<EquipementCapacity, String> {
}
