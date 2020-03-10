package com.jpa.dao;

import com.jpa.entity.Sms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface SmsDao extends JpaRepository<Sms, Integer> {

    @Query(value = "update sms set smsType=:smType,phone=:phone,status=:status,sid=:sid,receiveTime=:receiveTime where phone=:phone and sid=:sid ", nativeQuery = true)
    @Modifying
    @Transactional
    Integer updateSms(@Param("smsType") String smsType, @Param("phone") String phone,
                      @Param("status") String status, @Param("sid") String sid,
                      @Param("receiveTime") String receiveTime);
}
