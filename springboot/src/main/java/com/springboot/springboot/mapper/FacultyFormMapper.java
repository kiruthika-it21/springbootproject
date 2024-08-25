package com.springboot.springboot.mapper;

import com.springboot.springboot.entity.Facultyform;
import com.springboot.springboot.model.FacultyFormModel;

public class FacultyFormMapper {
    public static FacultyFormModel mapToFacultyFormModel(Facultyform facultyform){
        FacultyFormModel model=new FacultyFormModel();
        model.setId(facultyform.getId());
        model.setEventName(facultyform.getEventName());
        model.setEventDate(facultyform.getEventDate());
        model.setEventTime(facultyform.getEventTime());
        model.setOrganiserName(facultyform.getOrganiserName());
        model.setOrganiserDepartment(facultyform.getOrganiserDepartment());
        model.setOrganiserMobile(facultyform.getOrganiserMobile());
        model.setGuestName(facultyform.getGuestName());
        model.setGuestDesignation(facultyform.getGuestDesignation());
        model.setGuestOrganization(facultyform.getGuestOrganization());
        model.setParticipantsExternal(facultyform.getParticipantsExternal());
        model.setParticipantsInternal(facultyform.getParticipantsInternal());
        model.setVenueRequired(facultyform.getVenueRequired());
        model.setTransportRequired(facultyform.getTransportRequired());
        model.setHostelRequired(facultyform.getHostelRequired());
        model.setInternaltransportRequired(facultyform.getInternaltransportRequired());
        model.setAccessoriesRequired(facultyform.getAccessoriesRequired());
        model.setAccommodationRequired(facultyform.getAccommodationRequired());
        model.setNoofrooms(facultyform.getNoofrooms());
        model.setNoOfVenueRequired(facultyform.getNoOfVenueRequired());
        model.setAccommodationType(facultyform.getAccommodationType());
        model.setRoomType(facultyform.getRoomType());
        model.setPurposeOfVisit(facultyform.getPurposeOfVisit());
        model.setTransportDetails(facultyform.getTransportDetails());
        model.setWaterbottles(facultyform.getWaterbottles());
        model.setType(facultyform.getType());
        model.setStartingplace(facultyform.getStartingplace());
        model.setEndplace(facultyform.getEndplace());
        model.setPad(facultyform.getPad());
        model.setHandmic(facultyform.getHandmic());
        model.setCollarmic(facultyform.getCollarmic());
        model.setDining(facultyform.getDining());
        model.setNoofpersons(facultyform.getNoofpersons());
        model.setAccompanyingPassengers(facultyform.getAccompanyingPassengers());
        return model;
    }

    public static Facultyform mapToFacultyFormModel(FacultyFormModel facultyFormmodel){
        Facultyform form = new Facultyform();
        form.setId(facultyFormmodel.getId());
        form.setEventName(facultyFormmodel.getEventName());
        form.setEventDate(facultyFormmodel.getEventDate());
        form.setEventTime(facultyFormmodel.getEventTime());
        form.setOrganiserName(facultyFormmodel.getOrganiserName());
        form.setOrganiserDepartment(facultyFormmodel.getOrganiserDepartment());
        form.setOrganiserMobile(facultyFormmodel.getOrganiserMobile());
        form.setParticipantsInternal(facultyFormmodel.getParticipantsInternal());
        form.setParticipantsExternal(facultyFormmodel.getParticipantsExternal());
        form.setGuestName(facultyFormmodel.getGuestName());
        form.setGuestDesignation(facultyFormmodel.getGuestDesignation());
        form.setGuestOrganization(facultyFormmodel.getGuestOrganization());
        form.setVenueRequired(facultyFormmodel.getVenueRequired());
        form.setTransportRequired(facultyFormmodel.getTransportRequired());
        form.setHostelRequired(facultyFormmodel.getHostelRequired());
        form.setAccessoriesRequired(facultyFormmodel.getAccessoriesRequired());
        form.setAudioRequired(facultyFormmodel.getAudioRequired());
        form.setAccommodationRequired(facultyFormmodel.getAccommodationRequired());
        form.setNoOfVenueRequired(facultyFormmodel.getNoOfVenueRequired());
        form.setNoofrooms(facultyFormmodel.getNoofrooms());
        form.setAccommodationType(facultyFormmodel.getAccommodationType());
        form.setRoomType(facultyFormmodel.getRoomType());
        form.setPurposeOfVisit(facultyFormmodel.getPurposeOfVisit());
        form.setTransportDetails(facultyFormmodel.getTransportDetails());

        form.setWaterbottles(facultyFormmodel.getWaterbottles());
        form.setType(facultyFormmodel.getType());
        form.setStartingplace(facultyFormmodel.getStartingplace());
        form.setEndplace(facultyFormmodel.getEndplace());
        form.setPad(facultyFormmodel.getPad());
        form.setCollarmic(facultyFormmodel.getCollarmic());
        form.setHandmic(facultyFormmodel.getHandmic());
        form.setDining(facultyFormmodel.getDining());
        form.setNoofpersons(facultyFormmodel.getNoofpersons());
        form.setAccompanyingPassengers(facultyFormmodel.getAccompanyingPassengers());


        return form;
    }
}
