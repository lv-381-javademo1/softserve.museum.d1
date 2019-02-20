package service.exhibit;

import dto.ExhibitFullInfDto;
import entity.Author;
import entity.Exhibit;
import entity.Hall;
import service.EntityDtoInterface;

public class ExhibitFullInfService implements EntityDtoInterface<Exhibit, ExhibitFullInfDto> {

    @Override
    public Exhibit dtoToEntity(ExhibitFullInfDto exhibitFullInfDto) {

        Exhibit exhibit = new Exhibit();
        Author author = new Author();
        Hall hall = new Hall();

        author.setFirstName(exhibitFullInfDto.getAuthorFirstname());
        author.setLastName(exhibitFullInfDto.getAuthorLastname());

        hall.setHallName(exhibitFullInfDto.getHall());

        exhibit.setExhibitId(Integer.parseInt(exhibitFullInfDto.getExhibitID()));
        exhibit.setName(exhibitFullInfDto.getExhibitName());
        exhibit.setMaterial(exhibitFullInfDto.getMaterial());
        exhibit.setTechnique(exhibitFullInfDto.getTechnique());
        exhibit.setHall_Id(hall);
        exhibit.setAuthorId(author);

        return exhibit;
    }

    @Override
    public ExhibitFullInfDto entityToDto(Exhibit exhibit) {

        ExhibitFullInfDto exhibitFullInfDto = new ExhibitFullInfDto();

        exhibitFullInfDto.setExhibitID(String.valueOf(exhibit.getExhibitId()));
        exhibitFullInfDto.setExhibitName(exhibit.getName());
        exhibitFullInfDto.setMaterial(exhibit.getMaterial());
        exhibitFullInfDto.setTechnique(exhibit.getTechnique());
        exhibitFullInfDto.setHall(exhibit
                .getHall_Id()
                .getHallName()
        );
        exhibitFullInfDto.setAuthorFirstname(exhibit
                .getAuthorId()
                .getFirstName()
        );
        exhibitFullInfDto.setAuthorLastname(exhibit
                .getAuthorId()
                .getLastName()
        );

        return exhibitFullInfDto;
    }
}
