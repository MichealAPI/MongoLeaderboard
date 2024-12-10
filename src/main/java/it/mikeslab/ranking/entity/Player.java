package it.mikeslab.ranking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Player {

    @Id
    private String id;

    private Long score;

}
