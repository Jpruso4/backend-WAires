package com.co.waires.wAires.persistence.repository;

import com.co.waires.wAires.persistence.entity.ProfileType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfileRepository extends JpaRepository<ProfileType, String> {
}
