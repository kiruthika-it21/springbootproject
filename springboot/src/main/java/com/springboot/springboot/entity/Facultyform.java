package com.springboot.springboot.entity;

import lombok.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "faculty")
public class Facultyform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "event_date")
    private Date eventDate;

    @Column(name = "event_time")
    private String eventTime;

    @Column(name = "organiser_name")
    private String organiserName;

    @Column(name = "organiser_department")
    private String organiserDepartment;

    @Column(name = "organiser_mobile")
    private String organiserMobile;

    @Column(name = "participants_internal")
    private Integer participantsInternal;

    @Column(name = "participants_external")
    private Integer participantsExternal;

    @Column(name = "guest_name")
    private String guestName;

    @Column(name = "guest_designation")
    private String guestDesignation;

    @Column(name = "guest_organization")
    private String guestOrganization;

    @Column(name = "venue_required")
    private Boolean venueRequired;

    @Column(name = "accessories-Required")
    private Boolean accessoriesRequired;

    @Column(name = "accommodation-Required")
    private Boolean accommodationRequired;

    @Column(name = "transport_required")
    private Boolean transportRequired;

    @Column(name = "hostel_Required")
    private Boolean hostelRequired;

    @Column(name = "audio_required")
    private Boolean audioRequired;

    @Column(name = "internaltransport-Required")
    private Boolean internaltransportRequired;

    @Column(name = "no_of_rooms")
    private Integer noofrooms;

    @Column(name = "no_of_venue_required")
    private Integer noOfVenueRequired;

    @Column(name = "accommodation_type")
    private String accommodationType;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "purpose_of_visit")
    private String purposeOfVisit;

    @Column(name = "transport_details")
    private String transportDetails;

    @Column(name = "waterbottles")
    private Integer waterbottles;

    @Column(name = "type")
    private String type;

    @Column(name = "startingplace")
    private String startingplace;

    @Column(name = "pad")
    private String pad;

    @Column(name = "handmic")
    private Integer handmic;

    @Column(name = "collarmic")
    private Integer collarmic;

    @Column(name = "end-place")
    private String endplace;

    @Column(name = "dining")
    private String dining;

    @Column(name = "noofpersons")
    private Integer noofpersons;

    @Column(name = "accompanying-Passengers")
    private Integer accompanyingPassengers;


}

