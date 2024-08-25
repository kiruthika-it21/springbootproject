package com.springboot.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FacultyFormModel {
    private Long id;
    private String eventName;
    private Date eventDate;
    private String eventTime;
    private String organiserName;
    private String organiserDepartment;
    private String organiserMobile;
    private Integer participantsInternal;
    private Integer participantsExternal;
    private String guestName;
    private String guestDesignation;
    private String guestOrganization;
    private Boolean venueRequired;
    private Boolean transportRequired;
    private Boolean audioRequired;
    private Boolean accommodationRequired;
    private Boolean accessoriesRequired;
    private Boolean internaltransportRequired;
    private Boolean hostelRequired;

    private Integer noOfVenueRequired;
    private Integer noofrooms;
    private String accommodationType;
    private String roomType;
    private String purposeOfVisit;
    private String transportDetails;
    private String startingplace;
    private String pad;
    private String type;
    private String endplace;
    private Integer waterbottles;
    private Integer handmic;
    private Integer collarmic;
    private String dining;
    private Integer noofpersons;
    private Integer accompanyingPassengers;









    //
    public Boolean isVenueRequired() {
        return false;
    }
//    public boolean isHallRequirements() {
//        return false;
//    }
//
//    public Boolean isAudioRequired() {
//        return false;
//    }

//    public Boolean isAudioDetails() {
//        return false;
//    }
//
//    public Boolean isHostelAccommodationDiningForm() {
//        return false;
//    }
//
//    public boolean isDiningRequest() {
//        return false;
//    }
//
//    public boolean isDiningDetails() {
//        return false;
//    }
//
    public Boolean isTransportRequired() {
        return false;
    }
}
