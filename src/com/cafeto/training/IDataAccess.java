package com.cafeto.training;

import java.util.Collection;
import java.util.List;

/**
 * Example interface for a data access.
 *
 * @author Alejandro Valdes
 */
public interface IDataAccess
{
    /**
     * Gets all beans stored in the database.
     *
     * @return a list of {@link IBean} instances
     */
    List<IBean> getAllBeans();

    /**
     * Save the given collection of beans to the database.
     *
     * @param beans a collection of {@link IBean}
     */
    void saveBeans(final Collection<IBean> beans);
}
