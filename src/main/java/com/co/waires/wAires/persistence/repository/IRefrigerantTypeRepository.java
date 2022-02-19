package com.co.waires.wAires.persistence.repository;

import com.co.waires.wAires.persistence.entity.ClientType;
import com.co.waires.wAires.persistence.entity.RefrigerantType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRefrigerantTypeRepository extends JpaRepository<RefrigerantType, String> {
}
