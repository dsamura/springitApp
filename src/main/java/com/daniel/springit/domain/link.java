package com.daniel.springit.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity         //its shows that this is a table
@Data            //it replaces the need for toSting, Getter,settet and requiredargs constructor annotion
@NoArgsConstructor  //its tells you to indicate the NoNull annotation in the fields
public class link {
    @Id
    @GeneratedValue
    private  Long id;
    @NonNull
    private String  title;
    @NonNull
    private String url;


}
