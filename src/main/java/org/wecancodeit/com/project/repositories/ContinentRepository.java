package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Continent;

public interface ContinentRepository extends CrudRepository<Continent, Long> {
}
