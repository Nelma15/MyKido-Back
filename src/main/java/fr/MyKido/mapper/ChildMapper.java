package fr.MyKido.mapper;


import java.util.List;
import java.util.stream.Collectors;
import fr.MyKido.dto.ChildDTO;
import fr.MyKido.models.ChildEntity;
import fr.MyKido.models.ParentEntity;


public class ChildMapper{
     //  Convertir un Enfant en EnfantDTO
    public static ChildDTO toDTO(ChildEntity child) {
        return new ChildDTO(
            child.getId(),
            child.getLastName(),
            child.getFirstName(),
            child.getBirthDate().toString(), 
            child.getAllergies(),
            child.getNotes()
        );
    }

    //  Convertir une liste d'Enfant en liste de EnfantDTO
    public static List<ChildDTO> toDTOList(List<ChildEntity> children) {
        return children.stream().map(ChildMapper::toDTO).collect(Collectors.toList());
    }

    // Convertir un EnfantDTO en Enfant (pour l'ajout/modification)
    public static ChildEntity toEntity(ChildDTO dto, ParentEntity parent) {
        ChildEntity child = new ChildEntity();
        child.setLastName(dto.getLastName());
        child.setFirstName(dto.getFirstName());
        child.setBirthDate(dto.getBirthDate()); 
        child.setAllergies(dto.getAllergies());
        child.setNotes(dto.getNotes());
        child.setParent(parent);
    
        return child;

}
}
