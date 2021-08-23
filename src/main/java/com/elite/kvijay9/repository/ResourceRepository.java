package com.elite.kvijay9.repository;

import com.elite.kvijay9.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {

    //@Retryable(value = CannotAcquireLockException.class, maxAttempts = 3, backoff = @Backoff(delay = 100, maxDelay = 300))
    //(isolation = Isolation.SERIALIZABLE)

    @Transactional
    @Modifying
    @Query(value = "update resource r set r.lastupdated = current_timestamp() where r.id = ?1", nativeQuery = true)
    void updateLastLoginDetails(Long id);

    //@Query("update Resource resource set resource.lastupdated = current_timestamp where resource.id = :id", nativeSQl = true)
    /*@Query(value = "update resource r set r.lastupdated = current_timestamp() where r.id = ?1; SELECT SLEEP('5')", nativeQuery = true)
    void updateLastLoginDetails(Long id);*/

    Resource getById(@Param("id") Long id);

}
