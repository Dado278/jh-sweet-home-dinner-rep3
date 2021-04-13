package it.davide.sweethome.service;

import it.davide.sweethome.domain.Innkeeper;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link Innkeeper}.
 */
public interface InnkeeperService {
    /**
     * Save a innkeeper.
     *
     * @param innkeeper the entity to save.
     * @return the persisted entity.
     */
    Innkeeper save(Innkeeper innkeeper);

    /**
     * Partially updates a innkeeper.
     *
     * @param innkeeper the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Innkeeper> partialUpdate(Innkeeper innkeeper);

    /**
     * Get all the innkeepers.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Innkeeper> findAll(Pageable pageable);

    /**
     * Get the "id" innkeeper.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Innkeeper> findOne(Long id);

    /**
     * Delete the "id" innkeeper.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
