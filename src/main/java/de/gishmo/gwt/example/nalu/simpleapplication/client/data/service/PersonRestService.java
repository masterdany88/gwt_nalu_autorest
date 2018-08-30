package de.gishmo.gwt.example.nalu.simpleapplication.client.data.service;

import com.intendia.gwt.autorest.client.AutoRestGwt;
import de.gishmo.gwt.example.nalu.simpleapplication.client.data.model.dto.Person;
import io.reactivex.Observable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@AutoRestGwt
@Path("persons")
public interface PersonRestService {
    @GET
    Observable<Person> getAll();
}
