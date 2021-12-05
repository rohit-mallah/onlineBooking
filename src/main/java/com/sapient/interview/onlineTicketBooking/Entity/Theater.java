package com.sapient.interview.onlineTicketBooking.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_theater")
public class Theater {

    @Id
    @SequenceGenerator(
            name = "theater_sequence",
            sequenceName = "theater_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "theater_sequence"
    )
    private Long theaterId;
    private String theaterName;
    private String city;
    private String State;
    private String address;

}
