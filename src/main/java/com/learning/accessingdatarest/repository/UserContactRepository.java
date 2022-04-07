package com.learning.accessingdatarest.repository;

import com.learning.accessingdatarest.domain.User;
import com.learning.accessingdatarest.domain.UserContact;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "user-contact", path = "user-contact")
public interface UserContactRepository extends PagingAndSortingRepository<UserContact, Long> {

    List<UserContact> findByUserId(@Param("id") User user);
}
