package com.eazybytes.eazyschool.Repository;

import com.eazybytes.eazyschool.model.Holiday;
import org.springframework.data.repository.CrudRepository;

public interface HolidaysRepository extends CrudRepository<Holiday,String> {
}
