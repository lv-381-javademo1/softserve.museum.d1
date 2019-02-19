package service;

public interface EntityDtoInterface<Entity, Dto> {

    Entity dtoToEntity(Dto dto);
    Dto entityToDto(Entity entity);
}
