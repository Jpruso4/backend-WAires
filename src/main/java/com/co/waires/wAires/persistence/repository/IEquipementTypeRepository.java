package com.co.waires.wAires.persistence.repository;

import com.co.waires.wAires.persistence.entity.EquipementType;
import com.co.waires.wAires.persistence.entity.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEquipementTypeRepository extends JpaRepository<EquipementType, String> {
}
