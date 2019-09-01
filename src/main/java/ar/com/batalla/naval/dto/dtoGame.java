package ar.com.batalla.naval.dto;

import java.io.Serializable;
import java.util.Date;

public class dtoGame implements Serializable {
  private Long Id;
  private Date creationDate;


  public dtoGame(  ) {

  }

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }
}
