package com.bankapp.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.model.entities.TransactionLogInfo;

@Repository
public interface TransactionLogInfoRepository extends JpaRepository<TransactionLogInfo, Long>{

}
