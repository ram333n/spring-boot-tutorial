package edu.prokopchuk.springboottutorial.service;

import edu.prokopchuk.springboottutorial.model.CrewMember;
import edu.prokopchuk.springboottutorial.repository.CrewRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrewService {
  private CrewRepository crewRepository;

  @Autowired
  public CrewService(CrewRepository crewRepository) {
    this.crewRepository = crewRepository;
  }

  public CrewMember createCrewMember(CrewMember crewMember) {
    return new CrewMember();
  }

  public Optional<CrewMember> getCrewMember(String passNumber) {
    return Optional.of(new CrewMember());
  }

  public CrewMember updateCrewMember(String passNumber, CrewMember crewMember) {
    return new CrewMember();
  }

  public boolean deleteCrewMember(String passNumber) {
    return true;
  }
}
