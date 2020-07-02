package com.crm.crm.model;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ContactRepository extends PagingAndSortingRepository<Contact, Long> {
}
