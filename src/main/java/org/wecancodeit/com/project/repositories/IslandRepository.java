package org.wecancodeit.com.project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.com.project.models.Island;

public interface IslandRepository extends CrudRepository<Island, Long> {
}
