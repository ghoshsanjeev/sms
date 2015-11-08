package com.batb.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batb.sms.bean.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {

}
