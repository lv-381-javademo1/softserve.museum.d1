package service.exhibit;

import dao.ExhibitDao;
import dto.ExhibitFullInfDto;
import entity.Exhibit;
import service.EntityDtoInterface;

public class ExhibitFullInfService implements EntityDtoInterface<Exhibit, ExhibitFullInfDto> {

    @Override
    public Exhibit dtoToEntity(ExhibitFullInfDto exhibitFullInfDto) {

        Exhibit exhibit = new Exhibit();
        //==>To do
        return null;
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
