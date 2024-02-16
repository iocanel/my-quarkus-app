package io.quarkus.demo;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

public interface MyEntityResource extends PanacheEntityResource<MyEntity, Long> {
}