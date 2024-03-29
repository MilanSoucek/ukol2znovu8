package cz.engeto.ja.guests;

import java.time.LocalDate;

public class Guest {
    private String name;
    private LocalDate birthDate;

    public Guest(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    //    public Guest (String name, LocalDate birthDate) {
//        }
//    }
//    public Guest(String name){
//        this(name, surname, LocalDate());
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
