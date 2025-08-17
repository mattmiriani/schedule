package com.example.scheduler.config.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional(noRollbackFor = RuntimeException.class)
public class CrudService<CLASS, ID> extends ReadOnlyService<CLASS, ID> {

    protected void beforeSave(CLASS entity) {}

    public CLASS save(CLASS entity) {
        beforeSave(entity);

        CLASS entitySaved = repository.save(entity);

        afterSave(entitySaved);

        return entitySaved;
    }

    protected void afterSave(CLASS entity) {}

    protected void beforeDelete(CLASS entity) {}

    public void delete(CLASS entity) {
        beforeDelete(entity);

        repository.delete(entity);

        afterDelete(entity);
    }

    protected void afterDelete(CLASS entity) {}

    protected void beforeUpdate(CLASS entity) {}

    public CLASS update(CLASS entity) {
        beforeUpdate(entity);

        CLASS entitySaved = repository.save(entity);

        afterUpdate(entitySaved);

        return entitySaved;
    }

    protected void afterUpdate(CLASS entity) {}
}
