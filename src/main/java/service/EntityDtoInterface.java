package service;

/**
 * @author Andrii Senchakevych
 */
public interface EntityDtoInterface<Entity, Dto> {

    Entity dtoToEntity(Dto dto);

    Dto entityToDto(Entity entity);
}
