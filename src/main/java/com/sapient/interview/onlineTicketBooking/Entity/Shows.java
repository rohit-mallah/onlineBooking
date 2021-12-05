package com.sapient.interview.onlineTicketBooking.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_shows")
public class Shows {

    private Long showId;
    private Long movieId;
    private Long theaterId;
    private Date showDate;
    private String showStartTiming;

}
